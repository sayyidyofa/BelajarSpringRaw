package xyz.yoffa.BelajarSpringRaw.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.LinkedList;
import java.util.List;

public class PrototypeBeanProcessor implements BeanPostProcessor, BeanFactoryAware, DisposableBean {

    private BeanFactory beanFactory;

    private final List<Object> prototypeBeanList = new LinkedList<>();

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // after start up, keep track of the prototype scoped beans.
        // we will need to know who they are for later destruction
        if (beanFactory.isPrototype(beanName)) {
            synchronized (prototypeBeanList) {
                prototypeBeanList.add(bean);
            }
        }
        return bean;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void destroy() {
        // loop through the prototype beans and call the `destroy()` method on each one
        synchronized (prototypeBeanList) {
            prototypeBeanList.forEach(this::doDestroy);
        }
    }

    private void doDestroy(Object bean) {
        if (bean instanceof DisposableBean) {
            try {
                ((DisposableBean)bean).destroy();
            } catch (Exception e) {
                System.out.println("Failed to destroy disposable bean");
                e.printStackTrace();
            }
        }
        prototypeBeanList.clear();
    }
}
