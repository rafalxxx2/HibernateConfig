package com.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDataBase");
        EntityManager entityManager =entityManagerFactory.createEntityManager();

       entityManager.close();
       entityManagerFactory.close();
    }
}
