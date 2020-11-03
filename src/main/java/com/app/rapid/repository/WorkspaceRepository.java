package com.app.rapid.repository;

import com.app.rapid.domain.Workspace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 22-03-2020
 * Time: 17:13
 * inside the package - com.app.rapid.repository
 * To change this template use File | Settings | File and Code Templates.
 */
@Repository
@Transactional
public class WorkspaceRepository {
    @Autowired
    EntityManager em;

    public Workspace findById(int id) {
        Workspace workspace = em.find(Workspace.class, id);
        return workspace;
    }

    public Workspace saveWorkspace(Workspace workspace){
        if(workspace.getId() == null) {
            em.persist(workspace);
        } else {
            em.merge(workspace);
        }
        return workspace;
    }

    public void deleteById(int id){
        Workspace workspace = findById(id);
        em.remove(workspace);
    }

    public void playWithEntityManager() {
        Workspace workspace1 = new Workspace("Web Service in 100 steps", "Dummy Workspace 5");
        em.persist(workspace1);
        em.flush();
        workspace1.setWorkspaceName("Angular 4 in 100 steps");
        Workspace workspace2 = new Workspace("Web Service in 100 steps", "Dummy Workspace 5");
        em.persist(workspace2);
        em.flush();
        em.detach(workspace2);
        workspace2.setWorkspaceName("Angular 7 in 100 steps");
    }
}
