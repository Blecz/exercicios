package com.programeiros.exercicios.ports;

import com.programeiros.exercicios.domain.PinValidator;
import com.programeiros.exercicios.domain.model.PinValidationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "pin", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PinController {

  private final PinValidator pinValidator;

  @GetMapping("/validate")
  public Mono<PinValidationResponse> validatePin(@RequestParam String pin) {
    return pinValidator.validatePin(pin);
  }

}
