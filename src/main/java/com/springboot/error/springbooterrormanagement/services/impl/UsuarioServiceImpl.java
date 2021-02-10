package com.springboot.error.springbooterrormanagement.services.impl;

import com.springboot.error.springbooterrormanagement.models.domain.Usuario;
import com.springboot.error.springbooterrormanagement.services.IUsuarioService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

  private List<Usuario> lista;

  public UsuarioServiceImpl() {

    this.lista = new ArrayList<>();
    this.lista.add(new Usuario(1, "Gio", "Jimenez"));
    this.lista.add(new Usuario(2, "Andres", "Guzman"));
    this.lista.add(new Usuario(3, "Pepa", "Garcia"));
    this.lista.add(new Usuario(4, "Lalo", "Mena"));
    this.lista.add(new Usuario(5, "Paco", "Jimenez"));
    this.lista.add(new Usuario(6, "Gio", "Hernandez"));
    this.lista.add(new Usuario(7, "Juan", "Gomez"));
  }

  @Override
  public List<Usuario> listar() {
    return lista;
  }

  @Override
  public Usuario obtenerPorId(Integer id) {

    Usuario resultado = null;

    for (Usuario u : this.lista) {

      if (u.getId().equals(id)) {
        resultado = u;
        break;
      }
    }

    return resultado;
  }
}
