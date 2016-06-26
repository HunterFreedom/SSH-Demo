package com.neworin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by NewOrin Zhang on 2016/6/25.
 * Email: NewOrinZhang@Gmail.com
 */
public class BaseDao {

    public SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
