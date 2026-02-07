package arquitetura.quarkus.utils.mappers;

import arquitetura.quarkus.adapters.outbound.entities.EnderecoEntity;
import arquitetura.quarkus.domain.endereco.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jakarta")
public interface EnderecoToEnderecoEntityMapper {

    EnderecoEntity mapper(Endereco endereco);

}
