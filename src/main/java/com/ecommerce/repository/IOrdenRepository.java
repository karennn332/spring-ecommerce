package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ecommerce.model.Orden;
import com.ecommerce.model.Usuario;


public interface IOrdenRepository extends JpaRepository<Orden, Integer>  {
    List<Orden> findByUsuario(Usuario usuario);

}
