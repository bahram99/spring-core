package autowired;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class automain{
    public static void main(String[] args) {/*
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        one one1 = (one) context.getBean("one1");
        System.out.println(one1.getCar());

        one one2 = (one) context.getBean("one2");
        System.out.println(one2.getCar());

        one one3 = (one) context.getBean("one3");
        System.out.println(one3.getCar());

        usecontext ioccontainer = (usecontext) context.getBean("uc");
        System.out.println(ioccontainer.getApplicationContext());*/

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        awareclass awareclass = new awareclass();
        awareclass.setApplicationContext(context);

    }
}
