package arquitetura.quarkus.config;

import arquitetura.quarkus.application.ports.out.BuscarEnderecoPort;
import arquitetura.quarkus.application.ports.out.SalvarUsuarioPort;
import arquitetura.quarkus.application.core.service.SalvarUsuarioService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class ApplicationConfig {

    @Produces
    public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort, BuscarEnderecoPort buscarEnderecoPort){
        return new SalvarUsuarioService(salvarUsuarioPort, buscarEnderecoPort);
    }



}
