package arquitetura.quarkus.adapters.outbound.repositories;

import arquitetura.quarkus.adapters.outbound.entities.UsuarioEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<UsuarioEntity> {
}
