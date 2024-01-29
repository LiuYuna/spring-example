package icu.agony.example.spring.framework.beanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        final String packageName = Application.class.getPackageName();
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(packageName);
        IdClient uniqueIdClient = applicationContext.getBean("uniqueIdClient", IdClient.class);
        uniqueIdClient.incr();
        uniqueIdClient.incr();
        System.out.println("---------------------------------");
        IdClient fixedIdClient = applicationContext.getBean("fixedIdClient", IdClient.class);
        fixedIdClient.incr();
        fixedIdClient.incr();
    }

}
