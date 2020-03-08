package com.app.rapid.services;

import com.app.rapid.domain.Page;
import com.app.rapid.interfaces.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 07-02-2020
 * Time: 15:30
 * inside the package - com.app.rapid.services
 * To change this template use File | Settings | File and Code Templates.
 */
@Service
@Profile("jpa")
public class PageServiceImpl implements PageService {

    private EntityManagerFactory emf;

    @Autowired
    private JdbcTemplate jtm;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Page> getAllPages() {

        String sql = "SELECT * FROM PAGE ";
        List<Page> pages = jtm.query(sql, new BeanPropertyRowMapper(Page.class));
        return pages;
    }

    @Override
    public Page getPageById(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Page.class, id);
    }

    @Override
    public Page saveOrUpdatePage(Page Page) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Page savedPage = em.merge(Page);
        em.getTransaction().commit();
        return savedPage;
    }

    @Override
    public void deletePage(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Page.class, id));
        em.getTransaction().commit();
    }


}
