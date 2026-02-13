package Repository;

import entities.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PiloteRepository extends JpaRepository<Pilote, Long> {
}
