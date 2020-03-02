package airhacks;

import java.time.LocalDateTime;

import javax.enterprise.context.Dependent;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.metrics.annotation.Metered;

@Dependent
public class HelloService {

    @ConfigProperty(name = "greeting")
    String greeting;

    @Metered
    public Message message() {
        return new Message("hello," + greeting + " at " + LocalDateTime.now());
    }
    
}