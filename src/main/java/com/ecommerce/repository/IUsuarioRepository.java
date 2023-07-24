package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ecommerce.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

}
