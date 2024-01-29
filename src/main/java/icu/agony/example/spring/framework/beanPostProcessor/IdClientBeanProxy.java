package icu.agony.example.spring.framework.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 对 idClient 实例 Bean 代理，由{@link IdClientProxy}提供代理能力。
 */
@Component
public class IdClientBeanProxy implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof IdClient) {
            return new IdClientProxy((IdClient) bean);
        }
        return bean;
    }

}
