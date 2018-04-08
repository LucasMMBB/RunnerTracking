package Demo;

import domain.Location;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunningLocationServiceApplication {
    public static void main(String[] args){
        Location location = new Location();
        location.getLatitude();
        SpringApplication.run(RunningLocationServiceApplication.class, args);
    }
}


