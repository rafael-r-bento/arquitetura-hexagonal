package arquitetura.quarkus.ports.in;

import arquitetura.quarkus.domain.usuario.Usuario;

public interface SalvarUsuarioServicePort {
    Usuario salvarUsuario(Usuario usuario, String cep);
}
