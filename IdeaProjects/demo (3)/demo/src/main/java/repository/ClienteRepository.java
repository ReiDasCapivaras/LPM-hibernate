package repository;

import model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
    public List<Cliente> findByNome(String nome);
    public List<Cliente> findByEmail(String email);

    @Query(value="select a from Cliente c where c.nome like ?1%")
    public List<Cliente> findByComecaCom (String letra
    );

    @Query(value="select c from Cliente c where c.id > ?1")
    public List<Cliente> findByIdMaior (int id);

}
