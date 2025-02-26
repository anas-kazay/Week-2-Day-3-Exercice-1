package anas.kazay.dependencyinjectionapp;

import anas.kazay.dependencyinjectionapp.annotated.HelloWorldCOnfiguration;
import anas.kazay.dependencyinjectionapp.decoupled.MessageRenderer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyInjectionAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (HelloWorldCOnfiguration.class);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }

}
