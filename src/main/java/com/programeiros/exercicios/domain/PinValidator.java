package com.programeiros.exercicios.domain;

import com.programeiros.exercicios.domain.model.PinValidationResponse;
import reactor.core.publisher.Mono;

public interface PinValidator {

  Mono<PinValidationResponse> validatePin(String pin);

}
