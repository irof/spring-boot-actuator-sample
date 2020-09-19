package hoge;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyJavaHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return Health.status("I <3 Java!").build();
    }
}