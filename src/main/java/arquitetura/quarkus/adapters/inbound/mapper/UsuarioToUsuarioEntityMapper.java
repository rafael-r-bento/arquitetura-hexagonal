package arquitetura.quarkus.adapters.inbound.mapper;

import arquitetura.quarkus.adapters.inbound.entity.UsuarioEntity;
import arquitetura.quarkus.application.core.domain.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jakarta")
public interface UsuarioToUsuarioEntityMapper {

     UsuarioEntity mapper(Usuario usuario);

}
