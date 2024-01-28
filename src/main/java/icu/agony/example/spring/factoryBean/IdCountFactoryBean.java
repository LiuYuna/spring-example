package icu.agony.example.spring.factoryBean;

import lombok.Getter;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Getter
@Component
public class IdCountFactoryBean implements FactoryBean<IdCount> {

    private Long idCount = 0L;

    @Override
    public IdCount getObject() {
        return new IdCount(++idCount);
    }

    @Override
    public Class<?> getObjectType() {
        return IdCount.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
