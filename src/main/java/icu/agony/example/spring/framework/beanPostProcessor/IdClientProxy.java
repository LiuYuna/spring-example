package icu.agony.example.spring.framework.beanPostProcessor;

/**
 * 为 idClient 实例提供代理能力。
 */
public class IdClientProxy implements IdClient {

    private final IdClient delegate;

    public IdClientProxy(IdClient client) {
        this.delegate =  client;
    }

    @Override
    public long incr() {
        System.out.println("invoke method start: incr");
        long result = delegate.incr();
        System.out.println("invoke method end: incr");
        System.out.printf("result: %d%n", result);
        return result;
    }
    
}
