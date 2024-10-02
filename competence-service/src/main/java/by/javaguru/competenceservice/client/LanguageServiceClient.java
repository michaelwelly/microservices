package by.javaguru.competenceservice.client;

import by.javaguru.competenceservice.dto.LanguageResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "language-service")
public interface LanguageServiceClient {

    @GetMapping("/languages/{id}")
    LanguageResponseDto getLanguageById(@PathVariable("id") Integer id);
}
