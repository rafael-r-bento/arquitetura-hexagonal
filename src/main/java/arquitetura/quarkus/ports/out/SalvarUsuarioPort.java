package arquitetura.quarkus.ports.out;

import arquitetura.quarkus.domain.usuario.Usuario;

public interface SalvarUsuarioPort {
    Usuario salvar(Usuario usuario);
}
