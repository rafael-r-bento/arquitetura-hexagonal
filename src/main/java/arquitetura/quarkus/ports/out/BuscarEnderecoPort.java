package arquitetura.quarkus.ports.out;

import arquitetura.quarkus.domain.endereco.Endereco;

public interface BuscarEnderecoPort {
    Endereco buscar(String cep);
}
