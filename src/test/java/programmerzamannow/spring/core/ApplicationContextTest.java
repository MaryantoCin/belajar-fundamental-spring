package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;

public class ApplicationContextTest {

    @Test
    void testApplicationContext(){
        ApplicationContext context = new AnnotationConfigReactiveWebApplicationContext(HelloWorldConfiguration.class);

        Assertions.assertNotNull(context);
    }
}
