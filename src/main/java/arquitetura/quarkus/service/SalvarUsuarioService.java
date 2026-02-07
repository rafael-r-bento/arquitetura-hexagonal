package arquitetura.quarkus.service;

import arquitetura.quarkus.domain.usuario.Usuario;
import arquitetura.quarkus.ports.in.SalvarUsuarioServicePort;
import arquitetura.quarkus.ports.out.BuscarEnderecoPort;
import arquitetura.quarkus.ports.out.SalvarUsuarioPort;

public class SalvarUsuarioService implements SalvarUsuarioServicePort {

    private final SalvarUsuarioPort salvarUsuarioPort;

    private final BuscarEnderecoPort buscarEnderecoPort;

    public SalvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort, BuscarEnderecoPort buscarEnderecoPort) {
        this.salvarUsuarioPort = salvarUsuarioPort;
        this.buscarEnderecoPort = buscarEnderecoPort;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario, String cep) {

        var endereco = buscarEnderecoPort.buscar(cep);
        usuario.setEndereco(endereco);

        return salvarUsuarioPort.salvar(usuario);
    }
}
