package com.springboot.error.springbooterrormanagement.services;

import com.springboot.error.springbooterrormanagement.models.domain.Usuario;

import java.util.List;

public interface IUsuarioService {

  public List<Usuario> listar();

  public Usuario obtenerPorId(Integer id);
}
