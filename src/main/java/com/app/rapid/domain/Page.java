package com.app.rapid.domain;

import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 07-02-2020
 * Time: 15:24
 * inside the package - com.app.rapid.domain
 * To change this template use File | Settings | File and Code Templates.
 */
@Entity
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String pageName;
    private String pageDesc;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    protected Page() {
    }

    public Page(String pageName, String pageDesc) {
        this.pageName = pageName;
        this.pageDesc = pageDesc;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageDesc() {
        return pageDesc;
    }

    public void setPageDesc(String pageDesc) {
        this.pageDesc = pageDesc;
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
        return "Page{" +
                "Id=" + Id +
                ", pageName='" + pageName + '\'' +
                ", pageDesc='" + pageDesc + '\'' +
                '}';
    }
}
