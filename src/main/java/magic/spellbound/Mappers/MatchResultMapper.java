package magic.spellbound.Mappers;
import magic.spellbound.Dtos.MatchResult.MatchResultDto;
import magic.spellbound.Dtos.MatchResult.MatchResultInsertDto;
import magic.spellbound.Models.MatchResult;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MatchResultMapper {
    MatchResultDto toDto(MatchResult matchResult);
    MatchResult toEntity(MatchResultInsertDto matchResultDto);
    List<MatchResultDto> toDto(List<MatchResult> matchResults);
}
