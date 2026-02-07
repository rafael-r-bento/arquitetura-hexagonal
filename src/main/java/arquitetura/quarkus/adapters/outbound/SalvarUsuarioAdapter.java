package arquitetura.quarkus.adapters.outbound;

import arquitetura.quarkus.utils.mappers.EnderecoToEnderecoEntityMapper;
import arquitetura.quarkus.utils.mappers.UsuarioEntityToUsuarioMapper;
import arquitetura.quarkus.utils.mappers.UsuarioToUsuarioEntityMapper;
import arquitetura.quarkus.adapters.outbound.repositories.UsuarioRepository;
import arquitetura.quarkus.domain.usuario.Usuario;
import arquitetura.quarkus.ports.out.SalvarUsuarioPort;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    UsuarioToUsuarioEntityMapper usuarioToUsuarioEntityMapper;

    @Inject
    UsuarioEntityToUsuarioMapper usuarioToUsuarioEntitymMapper;

    @Inject
    EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper;

    @Override
    @Transactional
    public Usuario salvar(Usuario usuario) {
        var usuarioEntity = usuarioToUsuarioEntityMapper.mapper(usuario);
        var enderecoEntity = enderecoToEnderecoEntityMapper.mapper(usuario.getEndereco());
        usuarioEntity.setEndereco(enderecoEntity);
        usuarioRepository.persist(usuarioEntity);
        return usuarioToUsuarioEntitymMapper.mapper(usuarioEntity);
    }
}
