/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtek.repository;

import com.softtek.entity.Vehiculos;
import java.util.List;

/**
 *
 * @author sergi
 */
public interface IVehiculos {
    Vehiculos save(Vehiculos p);
    
    Vehiculos update(Vehiculos p);
    
    List<Vehiculos> vehiculos();
    
    Vehiculos findById(int id);
}
