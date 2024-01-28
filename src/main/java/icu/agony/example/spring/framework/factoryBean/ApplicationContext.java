package icu.agony.example.spring.framework.factoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {
        final String packageName = "icu.agony.example.spring.factoryBean";
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(packageName);
        // 第一次获取
        IdCount idCount1 = applicationContext.getBean(IdCount.class);
        System.out.println(idCount1); // out: 1
        // 第二次获取
        IdCount idCount2 = applicationContext.getBean(IdCount.class);
        System.out.println(idCount2); // out: 2
        // 获取生产bean的bean
        IdCountFactoryBean idCountFactoryBean = (IdCountFactoryBean) applicationContext.getBean("&idCountFactoryBean");
        System.out.printf("idCount: %s%n",idCountFactoryBean.getIdCount());
    }
}
