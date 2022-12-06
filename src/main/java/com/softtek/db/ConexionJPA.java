/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtek.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sergi
 */
public class ConexionJPA {
    private static EntityManagerFactory emf = null;
    
    public static EntityManager conectar(){
        try {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("PruebaSofttekPERSISTENCIA");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion: "+ e.getMessage());
        }
        
        return emf.createEntityManager();
    }
    
    public static void desconectar(EntityManager em){
            if(em != null){
                em.close();
                emf.close();
            }
    }
}
