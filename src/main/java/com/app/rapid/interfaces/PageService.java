package com.app.rapid.interfaces;

import com.app.rapid.domain.Page;

import java.util.List;

public interface PageService {

    List<Page> getAllPages();

    Page getPageById(Integer id);

    Page saveOrUpdatePage(Page Page);

    void deletePage(Integer id);
}
