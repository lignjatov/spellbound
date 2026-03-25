package magic.spellbound.Dtos.MatchResult;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import magic.spellbound.Dtos.BaseDto;

@Getter
@Setter
@NoArgsConstructor
public class MatchResultDto extends BaseDto {
    private String name;
    private String winner;
    private String winningCard;
    private String description;
}
