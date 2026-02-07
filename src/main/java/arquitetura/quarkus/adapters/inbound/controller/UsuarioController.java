package arquitetura.quarkus.adapters.inbound.controller;

import arquitetura.quarkus.utils.mappers.UsuarioRequestToUsuarioMapper;
import arquitetura.quarkus.adapters.inbound.request.UsuarioRequest;
import arquitetura.quarkus.domain.usuario.Usuario;
import arquitetura.quarkus.ports.in.SalvarUsuarioServicePort;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {

    private final SalvarUsuarioServicePort salvarUsuarioServicePort;

    private final UsuarioRequestToUsuarioMapper usuarioRequestToUsuarioMapper;

    public UsuarioController(SalvarUsuarioServicePort salvarUsuarioServicePort, UsuarioRequestToUsuarioMapper usuarioRequestToUsuarioMapper) {
        this.salvarUsuarioServicePort = salvarUsuarioServicePort;
        this.usuarioRequestToUsuarioMapper = usuarioRequestToUsuarioMapper;
    }

    @POST
    public Usuario salvarUsuario(UsuarioRequest usuarioRequest){
        var usuario = usuarioRequestToUsuarioMapper.mapper(usuarioRequest);
        return salvarUsuarioServicePort.salvarUsuario(usuario, usuarioRequest.getCep());
    }

}
