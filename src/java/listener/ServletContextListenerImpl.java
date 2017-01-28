package listener;

import dao.util.EntityManagerUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by vedmant on 1/28/17.
 */
public class ServletContextListenerImpl implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Context startup");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        EntityManagerUtil.closeFactory();
        System.out.println("Context down");
    }
}
