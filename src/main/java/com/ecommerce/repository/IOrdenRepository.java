package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ecommerce.model.Orden;


public interface IOrdenRepository extends JpaRepository<Orden, Integer>  {
    

}
