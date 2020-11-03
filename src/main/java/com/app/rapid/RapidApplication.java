package com.app.rapid;

import com.app.rapid.domain.Page;
import com.app.rapid.repository.PageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.app.rapid")
public class RapidApplication  implements CommandLineRunner {

    private  Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PageRepository pageRepository;
    public static void main(String[] args) {

        SpringApplication.run(RapidApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(pageRepository.findById(10002).toString());
        pageRepository.deleteById(10003);
        Page page = pageRepository.savePage(new Page("JPA in 10000 Steps", "Dummy Page 4"));
        logger.info(page.toString());
        pageRepository.playWithEntityManager();
    }
}
