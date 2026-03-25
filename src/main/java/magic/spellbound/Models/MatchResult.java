package magic.spellbound.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "MATCH_RESULT")
public class MatchResult extends BaseModel {

    @Column(name = "NAME")
    private String name;

    @Column(name = "WINNER")
    private String winner;

    @Column(name = "WINNING_CARD")
    private String winningCard;

    @Column(name = "DESCRIPTION")
    private String description;
}
