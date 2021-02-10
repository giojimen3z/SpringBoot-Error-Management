package com.springboot.error.springbooterrormanagement.controllers;

import com.springboot.error.springbooterrormanagement.errors.UsuarioNoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ErrorHandlerController {

  @ExceptionHandler(ArithmeticException.class)
  public String arithmeticError(ArithmeticException ex, Model model) {

    model.addAttribute("error", "Error aritmetico");
    model.addAttribute("message", ex.getMessage());
    model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
    model.addAttribute("timestamp", new Date());
    return "error/aritmetica";
  }

  @ExceptionHandler(NumberFormatException.class)
  public String numberFormat(NumberFormatException ex, Model model) {

    model.addAttribute("error", "Error: Formato numero invalido");
    model.addAttribute("message", ex.getMessage());
    model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
    model.addAttribute("timestamp", new Date());
    return "error/numberformat";
  }

  @ExceptionHandler(UsuarioNoEncontradoException.class)
  public String usuarioNoEncontrado(UsuarioNoEncontradoException ex, Model model) {

    model.addAttribute("error", "Error: Usuario no existe");
    model.addAttribute("message", ex.getMessage());
    model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
    model.addAttribute("timestamp", new Date());
    return "error/gener";
  }
}
