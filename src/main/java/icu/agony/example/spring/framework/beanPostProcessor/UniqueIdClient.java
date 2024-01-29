package icu.agony.example.spring.framework.beanPostProcessor;

import org.springframework.stereotype.Component;

/**
 * 生成唯一 id 的客户端
 */
@Component
public class UniqueIdClient implements IdClient {

    private long count;

    public long incr() {
        return ++count;
    }

}
