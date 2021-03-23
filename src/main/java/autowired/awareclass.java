package autowired;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class awareclass implements ApplicationContextAware {


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("id :" +applicationContext.getId());

        System.out.println("id :" +applicationContext.getParent());
        System.out.println("id :" +applicationContext.getStartupDate());
        System.out.println("id :" +applicationContext.getDisplayName());
    }
}
