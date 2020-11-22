package com.cg.oms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil
{

 

    private static final String PERSISTENCE_UNIT_NAME = "oms_sprint";

 

    private static EntityManagerFactory factory;
    private static EntityManager entityManager;
    static
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

 

    public static EntityManager getEntityManager()
    {
        if (entityManager == null || !entityManager.isOpen())
        {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

 

}
 