package arquitetura.quarkus.infrastructure.restclient;

import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;
import java.util.List;

import arquitetura.quarkus.infrastructure.restclient.dto.ExtensionDto;

@QuarkusTest
public class MyRemoteServiceTest {

    @Inject
    @RestClient
    MyRemoteService myRemoteService;

    @Test
    public void testExtensionsRestClientEndpoint() {
        List<ExtensionDto> restClientExtensions = myRemoteService.getExtensionsById("io.quarkus:quarkus-rest-client");

        Assertions.assertEquals(1, restClientExtensions.size());
        for (ExtensionDto extension : restClientExtensions) {
            Assertions.assertEquals("io.quarkus:quarkus-rest-client", extension.id);
            Assertions.assertEquals("REST Client", extension.name);
            Assertions.assertEquals("REST Client", extension.shortName);
            Assertions.assertTrue(extension.keywords.size() > 1);
            Assertions.assertTrue(extension.keywords.contains("rest-client"));
        }
    }
}
