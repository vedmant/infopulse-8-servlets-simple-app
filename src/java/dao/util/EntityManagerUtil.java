package dao.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by vedmant on 1/28/17.
 */
public class EntityManagerUtil {

    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("em");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void closeFactory() {
        factory.close();
    }
}
