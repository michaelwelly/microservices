package by.javaguru.skillservice.dto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "skill-service")
public interface SkillServiceClient {

    @GetMapping("/skills/{id}")
    SkillResponseDto getSkillById(@PathVariable("id") Long id);
}
