package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat one = applicationContext.getBean("cat",Cat.class);
        Cat two = applicationContext.getBean("cat",Cat.class);
        System.out.println(one.getMessage());
        System.out.println(two.getMessage());
        System.out.println(one==(two));

    }
}
