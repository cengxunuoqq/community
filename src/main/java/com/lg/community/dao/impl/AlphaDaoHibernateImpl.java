package com.lg.community.dao.impl;

import com.lg.community.dao.AlphaDao;
import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoHibernateImpl implements AlphaDao {

    @Override
    public String select() {
        return "Hibernate";
    }
}
