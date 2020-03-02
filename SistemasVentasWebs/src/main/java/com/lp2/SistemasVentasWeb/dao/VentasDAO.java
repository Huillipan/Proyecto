/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2.SistemasVentasWeb.dao;

import com.lp2.SistemasVentasWeb.modelo.Ventas;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author SEBASTIAN
 */
public interface VentasDAO extends CrudRepository<Ventas, Integer> {
    
}
