/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtek.test;

import com.softtek.dao.ProveedorDao;
import com.softtek.repository.IProveedores;

/**
 *
 * @author sergi
 */
public class TestInsert {
    public static void main(String[] args){
        IProveedores prove = new ProveedorDao();
//        Proveedores p = new  Proveedores();
//        p.setId(2);
//        p.setDireccion("Carrera 3 # 82 - 64 Sur");
//        p.setEmail("sergiourbina765@gmail.com");
//        p.setNombre("Stiven");
//        p.setNumeroIT("5464");
//        p.setNumeroVH("454564");
//        
//        prove.update(p);

        
        
//        for (Proveedores c:  prove.proveedores()) {
//            System.out.println("Proveedores " + c.toString());
//        }


        if(prove.findById(1) == null){
           System.out.println("No existe esta consulta");
        }else{
            System.out.println("Si existe");  
        }
        
    }
}
