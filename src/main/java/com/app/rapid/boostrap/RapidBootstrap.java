package com.app.rapid.boostrap;

import com.app.rapid.domain.Page;
import com.app.rapid.interfaces.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 07-02-2020
 * Time: 15:32
 * inside the package - com.app.rapid.boostrap
 * To change this template use File | Settings | File and Code Templates.
 */
@Component
public class RapidBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private PageService pageService;

    @Autowired
    public void setPageService(PageService pageService) {
        this.pageService = pageService;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadPages();
    }

    public void loadPages() {
        Page page1 = new Page();
        page1.setPageName("Page 1");
        page1.setPageDesc("First Page Created");
        page1.setData("dsfjsdh sdhj hhsdjgh jsd hdsgo ");
        page1.setCreatedBy("Bhushan Gadekar");
        pageService.saveOrUpdatePage(page1);

        Page page2 = new Page();
        page2.setPageName("Page 2");
        page2.setPageDesc("Second Page Created");
        page2.setData("dsfjsdh sdhj hhsdjgh jsd hdsgo ");
        page2.setCreatedBy("Bhushan Gadekar");
        pageService.saveOrUpdatePage(page2);

        Page page3 = new Page();
        page3.setPageName("Page 3");
        page3.setPageDesc("Third Page Created");
        page3.setData("dsfjsdh sdhj hhsdjgh jsd hdsgo ");
        page3.setCreatedBy("Bhushan Gadekar");
        pageService.saveOrUpdatePage(page3);

        Page page4 = new Page();
        page4.setPageName("Page 4");
        page4.setPageDesc("Fourth Page Created");
        page4.setData("dsfjsdh sdhj hhsdjgh jsd hdsgo ");
        page4.setCreatedBy("Bhushan Gadekar");
        pageService.saveOrUpdatePage(page4);

        Page page5 = new Page();
        page5.setPageName("Page 5");
        page5.setPageDesc("Fifth Page Created");
        page5.setData("dsfjsdh sdhj hhsdjgh jsd hdsgo ");
        page5.setCreatedBy("Bhushan Gadekar");
        pageService.saveOrUpdatePage(page5);

    }
}
