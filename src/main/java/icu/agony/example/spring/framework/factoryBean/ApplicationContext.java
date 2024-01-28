package icu.agony.example.spring.framework.factoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {

    public static void main(String[] args) {
        final String packageName = ApplicationContext.class.getPackageName();
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(packageName);
        // 第一次获取
        IdCount idCount1 = applicationContext.getBean(IdCount.class);
        System.out.println(idCount1); // out: 1
        // 第二次获取
        IdCount idCount2 = applicationContext.getBean(IdCount.class);
        System.out.println(idCount2); // out: 2
        // 获取生产bean的bean
        // 注意：直接获取名称为 idCountFactoryBean 的 bean 是获取不到的的，需要添加前缀 & ，因为它是一个 FactoryBean
        // see also: org.springframework.beans.factory.BeanFactory.FACTORY_BEAN_PREFIX
        IdCountFactoryBean idCountFactoryBean = (IdCountFactoryBean) applicationContext.getBean("&idCountFactoryBean");
        System.out.printf("idCount: %s%n",idCountFactoryBean.getIdCount());
    }

}
