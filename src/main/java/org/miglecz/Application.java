package org.miglecz;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * Application logic goes here
 */
@Component
public class Application {
    @Resource
    private SomethingDao somethingDao;

    public void launch() {
        System.out.println("Record from database: " + somethingDao.getSomething().get(0).getValue());
    }
}
