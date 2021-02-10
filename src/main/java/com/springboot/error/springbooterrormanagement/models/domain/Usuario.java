package com.springboot.error.springbooterrormanagement.models.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Usuario {

  private Integer id;
  private String nombre;
  private String apellido;
}
