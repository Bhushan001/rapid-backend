package com.app.rapid.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 22-03-2020
 * Time: 16:48
 * inside the package - com.app.rapid.domain
 * To change this template use File | Settings | File and Code Templates.
 */

@Entity
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String workspaceName;
    private String workspaceDesc;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public Workspace() {
    }

    public Workspace(String workspaceName, String workspaceDesc) {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public String getWorkspaceDesc() {
        return workspaceDesc;
    }

    public void setWorkspaceDesc(String workspaceDesc) {
        this.workspaceDesc = workspaceDesc;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Workspace{" +
                "Id=" + Id +
                ", workspaceName='" + workspaceName + '\'' +
                ", workspaceDesc='" + workspaceDesc + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
