package org.example;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        var entityManagerFactory = Persistence.createEntityManagerFactory( "default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

    }
}