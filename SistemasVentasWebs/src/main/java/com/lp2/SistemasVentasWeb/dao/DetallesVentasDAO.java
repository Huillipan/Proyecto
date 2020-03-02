/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2.SistemasVentasWeb.dao;

import com.lp2.SistemasVentasWeb.modelo.DetalleVentas;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author SEBASTIAN
 */
public interface DetallesVentasDAO extends CrudRepository<DetalleVentas, Integer> {
    
}
