package com.programeiros.exercicios.domain;

import com.programeiros.exercicios.domain.model.PinValidationResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class PinValidatorImpl implements PinValidator {

  public Mono<PinValidationResponse> validatePin(String pin) {
    // TODO: Implement logic here
    return Mono.just(PinValidationResponse
        .builder()
        .isValid(false)
        .message("Not implemented yet")
        .build());
  }

}
