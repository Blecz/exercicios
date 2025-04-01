package com.programeiros.exercicios.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PinValidationResponse {

  private Boolean isValid;
  private String message;

}
