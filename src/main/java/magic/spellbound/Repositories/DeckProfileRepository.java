package magic.spellbound.Repositories;

import magic.spellbound.Models.DeckProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "deck-profile")
public interface DeckProfileRepository extends JpaRepository<DeckProfile, Integer> {
}
