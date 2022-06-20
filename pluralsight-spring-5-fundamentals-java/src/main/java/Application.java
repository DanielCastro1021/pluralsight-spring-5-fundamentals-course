import com.pluralsight.service.ISpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ISpeakerService service = context.getBean("speakerService", ISpeakerService.class);
        ISpeakerService service2 = context.getBean("speakerService", ISpeakerService.class);
        System.out.println(service);
        System.out.println(service2);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
