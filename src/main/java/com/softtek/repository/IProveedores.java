/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtek.repository;

import com.softtek.entity.Proveedores;
import java.util.List;

/**
 *
 * @author sergi
 */
public interface IProveedores {
 
    Proveedores save(Proveedores p);
    
    Proveedores update(Proveedores p);
    
    List<Proveedores> proveedores();
    
    Proveedores findById(int id);
    
    
}
