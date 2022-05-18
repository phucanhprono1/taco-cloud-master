package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Taco;

import java.util.Optional;

public interface TacoRepository extends CrudRepository<Taco, String> {
    Optional<Taco> findById(Long id);
}
