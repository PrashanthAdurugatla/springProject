package io.learnSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        College college = context.getBean("college", College.class);
        college.test();
        context.close();

    }
}
