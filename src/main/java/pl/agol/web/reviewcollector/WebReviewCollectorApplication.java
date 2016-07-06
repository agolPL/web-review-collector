package pl.agol.web.reviewcollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebReviewCollectorApplication {

    public static void main(String... args) {
        new SpringApplication(WebReviewCollectorApplication.class)
                .run(args);
    }
}
