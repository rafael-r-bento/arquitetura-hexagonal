package arquitetura.quarkus.infrastructure.config;

import arquitetura.quarkus.ports.out.BuscarEnderecoPort;
import arquitetura.quarkus.ports.out.SalvarUsuarioPort;
import arquitetura.quarkus.service.SalvarUsuarioService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class ApplicationConfig {

    @Produces
    public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort, BuscarEnderecoPort buscarEnderecoPort){
        return new SalvarUsuarioService(salvarUsuarioPort, buscarEnderecoPort);
    }



}
