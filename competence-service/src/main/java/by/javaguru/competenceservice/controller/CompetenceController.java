package by.javaguru.competenceservice.controller;

import by.javaguru.competenceservice.client.LanguageServiceClient;
import by.javaguru.competenceservice.client.SkillServiceClient;
import by.javaguru.competenceservice.dto.CompetenceResponseDto;
import by.javaguru.competenceservice.dto.LanguageResponseDto;
import by.javaguru.competenceservice.dto.SkillResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/competence")
public class CompetenceController {

    private final LanguageServiceClient languageServiceClient;
    private final SkillServiceClient skillServiceClient;

    @Autowired
    public CompetenceController(LanguageServiceClient languageServiceClient, SkillServiceClient skillServiceClient) {
        this.languageServiceClient = languageServiceClient;
        this.skillServiceClient = skillServiceClient;
    }

    @GetMapping("/{id}")
    public CompetenceResponseDto getCompetenceById(@PathVariable String id) {
        String trimmedId = id.trim();

        LanguageResponseDto language = languageServiceClient.getLanguageById(Integer.parseInt(trimmedId));

        SkillResponseDto skill = skillServiceClient.getSkillById(Long.parseLong(trimmedId));

        return new CompetenceResponseDto(
                List.of(language),
                List.of(skill)
        );
    }
}
