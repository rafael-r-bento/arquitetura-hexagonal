package arquitetura.quarkus.utils.mappers;

import arquitetura.quarkus.adapters.inbound.request.UsuarioRequest;
import arquitetura.quarkus.domain.usuario.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jakarta")
public interface UsuarioRequestToUsuarioMapper {

    Usuario mapper(UsuarioRequest usuarioRequest);

}
