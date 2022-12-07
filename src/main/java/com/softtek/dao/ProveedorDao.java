/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtek.dao;

import com.softtek.db.ConexionJPA;
import com.softtek.entity.Proveedores;
import com.softtek.repository.IProveedores;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author sergi
 */
public class ProveedorDao implements IProveedores{

    private EntityManager em = null;
    
    @Override
    public Proveedores save(Proveedores p) {
        em = ConexionJPA.conectar();
        try{
         em.getTransaction().begin();
         em.persist(p);
         em.getTransaction().commit();
            System.out.println("Guardado");
        }catch(Exception e){
            ConexionJPA.desconectar(em);
        }
        
        return p;
    }

    @Override
    public Proveedores update(Proveedores p) {
        em = ConexionJPA.conectar();
        try{
          Proveedores pro = em.find(Proveedores.class, p.getId());
         em.getTransaction().begin();
         if(em.contains(pro)){
            em.merge(p);
            em.getTransaction().commit();
            System.out.println("Actualizado");
         }else{
            System.out.println("No encontrado este id.. "+ p.getId());
         }
         
        }catch(Exception e){
            ConexionJPA.desconectar(em);
        }
        
        return p;
    }
    
     

    @Override
    public List<Proveedores> proveedores() {
        em = ConexionJPA.conectar();
        List<Proveedores> listProveedores = null;
        try {
            Query query = em.createNamedQuery("Proveedores.findAll");
            listProveedores = query.getResultList();
        }catch(Exception e){
            ConexionJPA.desconectar(em);
        }
        
        return listProveedores;
    }

    @Override
    public Proveedores findById(int id) {
        em = ConexionJPA.conectar();
        try {
         return em.find(Proveedores.class, id);
        }finally{
            ConexionJPA.desconectar(em);
        }
    }
    
    public void eliminarDao(Proveedores p){
        em = ConexionJPA.conectar();
        
        
        try {
            
        Proveedores pro = em.find(Proveedores.class, p.getId());
        em.getTransaction().begin();
        em.remove(pro);
        em.getTransaction().commit();
        
        System.out.println("Eliminado");
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error.." + e.getMessage());
        }
    } 
    
}
