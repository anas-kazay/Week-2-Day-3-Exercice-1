package anas.kazay.dependencyinjectionapp.annotated;

import anas.kazay.dependencyinjectionapp.decoupled.HelloWorldMessageProvider;
import anas.kazay.dependencyinjectionapp.decoupled.MessageProvider;
import anas.kazay.dependencyinjectionapp.decoupled.MessageRenderer;
import anas.kazay.dependencyinjectionapp.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldCOnfiguration {
    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }
    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
