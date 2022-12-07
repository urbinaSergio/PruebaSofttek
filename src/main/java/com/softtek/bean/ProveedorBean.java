/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtek.bean;

import com.softtek.dao.ProveedorDao;
import com.softtek.entity.Proveedores;
import com.softtek.repository.IProveedores;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



/**
 *
 * @author sergi
 */
@ManagedBean
@ViewScoped
public class ProveedorBean {
    
    private Proveedores  proveedores = new Proveedores();
    
    private List<Proveedores> ListProveedores;

    public List<Proveedores> getListProveedores() {
        return ListProveedores;
    }

    public void setListProveedores(List<Proveedores> ListProveedores) {
        this.ListProveedores = ListProveedores;
    }
    
    

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
    
    public void registro(){
        IProveedores prove = new ProveedorDao();
        try {
            prove.save(proveedores);
        } catch (Exception e) {
            System.out.println("Error .. " + e.getMessage());
        }
    }
    
    public void listar(){
        IProveedores prove = new ProveedorDao();
        try {
            ListProveedores = prove.proveedores();
        } catch (Exception e) {
            System.out.println("Error .. " + e.getMessage());
        }
    }
    
    public void modificarId(Proveedores p){
      IProveedores prove = new ProveedorDao();
      Proveedores temp;  
      try {
            temp = prove.update(p);
            
            if(temp != null){
                this.proveedores = temp;
            }
            
        } catch (Exception e) {
            System.out.println("Error .. " + e.getMessage());
        }  
    }
    
    
     public void editar(){
      IProveedores prove = new ProveedorDao();
      
      try {
            prove.update(proveedores);
            this.listar();
            
            
        } catch (Exception e) {
            System.out.println("Error .. " + e.getMessage());
        }  
    }
     
     
     public void delete(Proveedores p){
         ProveedorDao prove = new ProveedorDao();
         try {
             prove.eliminarDao(p);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }

}
