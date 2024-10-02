package by.javaguru.skillservice.controller;

import by.javaguru.skillservice.dto.SkillResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private static final Map<Long, String> skills = Map.of(
            1L, "Java",
            2L, "Spring",
            3L, "Microservices",
            4L, "Docker",
            5L, "Kubernetes"
    );

    @GetMapping("/{id}")
    public SkillResponseDto getSkillById(@PathVariable Long id) {
        String skillName = skills.get(id);
        return new SkillResponseDto(id, skillName);
    }
}
