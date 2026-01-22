package arquitetura.quarkus.infrastructure.restclient;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import java.util.List;

import arquitetura.quarkus.infrastructure.restclient.dto.ExtensionDto;

@Path("/extensions")
@RegisterRestClient(configKey = "code-quarkus-api")
public interface MyRemoteService {

    @GET
    List<ExtensionDto> getExtensionsById(@QueryParam("id") String id);
}
