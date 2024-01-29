package icu.agony.example.spring.framework.beanPostProcessor;

import org.springframework.stereotype.Component;

@Component
public class FixedIdClient implements IdClient {

    @Override
    public long incr() {
        return 0;
    }

}
