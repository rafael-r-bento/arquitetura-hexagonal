package arquitetura.quarkus.utils.mappers;

import arquitetura.quarkus.adapters.outbound.entities.UsuarioEntity;
import arquitetura.quarkus.domain.usuario.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jakarta")
public interface UsuarioEntityToUsuarioMapper {

     Usuario mapper(UsuarioEntity usuario);

}
