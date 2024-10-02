package by.javaguru.languageservice.controller;

import by.javaguru.languageservice.dto.LanguageResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/languages")
public class LanguageController {

    private static final Map<Integer, String> languages = Map.of(
            1, "English",
            2, "Russian",
            3, "Spanish"
    );

    @GetMapping("/{id}")
    public LanguageResponseDto getLanguageById(@PathVariable Integer id) {
        String language = languages.get(id);
        return new LanguageResponseDto(id, language);
    }
}

