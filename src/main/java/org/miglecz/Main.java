package org.miglecz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Entry point of application
 */
public class Main {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        context.getBean(Application.class).launch();
        context.close();
    }
}
