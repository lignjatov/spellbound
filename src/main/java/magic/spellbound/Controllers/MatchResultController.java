package magic.spellbound.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import magic.spellbound.Dtos.MatchResult.MatchResultDto;
import magic.spellbound.Dtos.MatchResult.MatchResultInsertDto;
import magic.spellbound.Mappers.MatchResultMapper;
import magic.spellbound.Models.MatchResult;
import magic.spellbound.Repositories.MatchResultRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("match-results")
public class MatchResultController {

    private final MatchResultRepository matchResultRepository;
    private final MatchResultMapper matchResultMapper;

    public MatchResultController(MatchResultRepository matchResultRepository, MatchResultMapper matchResultMapper) {
        this.matchResultRepository = matchResultRepository;
        this.matchResultMapper = matchResultMapper;
    }

    @PostMapping()
    @ResponseBody
    @Operation(summary = "Creates a MatchResult entity")
    public MatchResultDto save(@Valid @RequestBody @Schema(implementation = MatchResultInsertDto.class) MatchResultInsertDto matchResultDto) {
        MatchResult matchResult = matchResultMapper.toEntity(matchResultDto);
        var result = matchResultRepository.save(matchResult);
        return matchResultMapper.toDto(result);
    }
}
