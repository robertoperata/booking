package net.perata.booking.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.problem.jackson.ProblemModule;
import org.zalando.problem.violations.ConstraintViolationProblemModule;

@Configuration
public class ProblemConfiguration {

    @Bean
    ObjectMapper objectMapper() {

        return new ObjectMapper().registerModules(new ProblemModule(),
                                                  new ConstraintViolationProblemModule());
    }
}
