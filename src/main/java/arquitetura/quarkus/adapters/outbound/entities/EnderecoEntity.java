package arquitetura.quarkus.adapters.outbound.entities;

import arquitetura.quarkus.domain.endereco.Endereco;

import jakarta.persistence.*;

@Entity
public class EnderecoEntity extends Endereco {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
