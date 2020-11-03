package com.app.rapid.repository;

import com.app.rapid.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 21-03-2020
 * Time: 20:10
 * inside the package - com.app.rapid.repository
 * To change this template use File | Settings | File and Code Templates.
 */

@Repository
@Transactional
public class PageRepository {
    @Autowired
    EntityManager em;

    public Page findById(int id) {
        Page page = em.find(Page.class, id);
        return page;
    }

    public Page savePage(Page page){
        if(page.getId() == null) {
            em.persist(page);
        } else {
            em.merge(page);
        }
        return page;
    }

    public void deleteById(int id){
        Page page = findById(id);
        em.remove(page);
    }

    public void playWithEntityManager() {
        Page page1 = new Page("Web Service in 100 steps", "Dummy Page 5");
        em.persist(page1);
        em.flush();
        page1.setPageName("Angular 4 in 100 steps");
        Page page2 = new Page("Web Service in 100 steps", "Dummy Page 5");
        em.persist(page2);
        em.flush();
        em.detach(page2);
        page2.setPageName("Angular 7 in 100 steps");
    }
}
