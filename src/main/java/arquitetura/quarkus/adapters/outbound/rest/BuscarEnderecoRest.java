package arquitetura.quarkus.adapters.outbound.rest;

import arquitetura.quarkus.application.core.domain.Endereco;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/ws")
@RegisterRestClient(baseUri = "https://viacep.com.br")
public interface BuscarEnderecoRest {

    @GET
    @Path("/{cep}/json")
    Endereco buscar(@PathParam("cep") String cep);

}
