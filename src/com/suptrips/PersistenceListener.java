package com.suptrips;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

/**
 * Created by root on 06/12/15.
 */
@WebListener
public class PersistenceListener {
    public PersistenceListener() {
        // TODO
    }


    public void contextDestroyed(ServletContextEvent arg0)  {
        PersistenceManager.closeEntityManagerFactory();
    }

    public void contextInitialized(ServletContextEvent arg0)  {
        // TODO
    }
}
