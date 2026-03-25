package magic.spellbound.Repositories;

import magic.spellbound.Models.MatchResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "match-result")
public interface MatchResultRepository extends JpaRepository<MatchResult, Integer> {
}
