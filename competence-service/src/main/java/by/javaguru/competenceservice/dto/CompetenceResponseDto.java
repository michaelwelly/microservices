package by.javaguru.competenceservice.dto;


import java.util.List;

public record CompetenceResponseDto(List<LanguageResponseDto> languages,
                                    List<SkillResponseDto> skills) {
}
