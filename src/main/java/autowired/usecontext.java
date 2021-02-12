package autowired;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class usecontext implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public usecontext(){

    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

        two t2 = (two) applicationContext.getBean("two");

    }
}
