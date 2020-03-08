package com.app.rapid.controllers;

import com.app.rapid.domain.Page;
import com.app.rapid.interfaces.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 06-03-2020
 * Time: 12:22
 * inside the package - com.app.rapid.controllers
 * To change this template use File | Settings | File and Code Templates.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/pages")
@RestController
public class PageController {
    private PageService pageService;

    @Autowired
    public void setPageService(PageService pageService) {
        this.pageService = pageService;
    }

    @RequestMapping("/list")
    public List<Page> listPages() {
        List<Page> pages = pageService.getAllPages();
        return pages;
    }
}
