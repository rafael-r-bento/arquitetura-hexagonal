package arquitetura.quarkus.adapters.outbound;

import arquitetura.quarkus.adapters.outbound.rest.BuscarEnderecoRest;
import arquitetura.quarkus.domain.endereco.Endereco;
import arquitetura.quarkus.ports.out.BuscarEnderecoPort;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    @Inject
    @RestClient
    BuscarEnderecoRest buscarEnderecoRest;

    @Override
    public Endereco buscar(String cep) {
        return buscarEnderecoRest.buscar(cep);
    }
}
