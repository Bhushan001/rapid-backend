package com.app.rapid.repository;

import com.app.rapid.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 22-03-2020
 * Time: 16:54
 * inside the package - com.app.rapid.repository
 * To change this template use File | Settings | File and Code Templates.
 */

@Repository
@Transactional
public class ProjectRepository {
    @Autowired
    EntityManager em;

    public Project findById(int id) {
        Project project = em.find(Project.class, id);
        return project;
    }

    public Project saveProject(Project project){
        if(project.getId() == null) {
            em.persist(project);
        } else {
            em.merge(project);
        }
        return project;
    }

    public void deleteById(int id){
        Project project = findById(id);
        em.remove(project);
    }

    public void playWithEntityManager() {
        Project project1 = new Project("Web Service in 100 steps", "Dummy Project 5");
        em.persist(project1);
        em.flush();
        project1.setProjectName("Angular 4 in 100 steps");
        Project project2 = new Project("Web Service in 100 steps", "Dummy Project 5");
        em.persist(project2);
        em.flush();
        em.detach(project2);
        project2.setProjectName("Angular 7 in 100 steps");
    }
}

