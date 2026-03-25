package magic.spellbound.Dtos.MatchResult;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MatchResultInsertDto {

    @NotBlank(message = "Name cannot be blank")
    @Schema(description = "The name of the match", example = "Grand Finals")
    private String name;

    @NotBlank(message = "Winner name cannot be blank")
    @Schema(description = "The winner of the match", example = "Player1")
    private String winner;

    @NotBlank(message = "Winning card cannot be blank")
    @Schema(description = "The winning card played", example = "Ace of Spades")
    private String winningCard;

    @Size(max = 128, message = "Description can be a maximum of 128 characters")
    @Schema(description = "Optional match description", example = "Incredible comeback")
    private String description;
}
