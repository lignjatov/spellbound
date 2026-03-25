package magic.spellbound.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "DECK_PROFILE")
public class DeckProfile extends BaseModel {

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ARCHIDEKT_LINK")
    private String archidektLink;

    @Override
    public String toString(){
        return name;
    }
}
