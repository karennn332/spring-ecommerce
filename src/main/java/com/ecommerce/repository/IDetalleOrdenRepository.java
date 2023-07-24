package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ecommerce.model.DetalleOrden;


public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {

}
