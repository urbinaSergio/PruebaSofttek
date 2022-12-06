/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtek.dao;

import com.softtek.entity.Vehiculos;
import com.softtek.repository.IVehiculos;
import java.util.List;

/**
 *
 * @author sergi
 */
public class VehiculoDao implements IVehiculos{

    @Override
    public Vehiculos save(Vehiculos p) {
        Vehiculos  vehiculos = null;
        
        
        
        try{
        
        }catch(Exception e){
            
        }
        
        return vehiculos; 
        
        
    }

    @Override
    public Vehiculos update(Vehiculos p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculos> vehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculos findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
