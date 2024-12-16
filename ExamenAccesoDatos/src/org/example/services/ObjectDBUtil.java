package org.example.services;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObjectDBUtil {

    private static EntityManagerFactory emf;

    static{
        emf = Persistence.createEntityManagerFactory("data.odb");
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }
}
