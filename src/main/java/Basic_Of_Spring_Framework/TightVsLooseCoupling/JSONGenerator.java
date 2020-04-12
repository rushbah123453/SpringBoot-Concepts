package Basic_Of_Spring_Framework.TightVsLooseCoupling;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class JSONGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("I am JSONGenerator");
    }
}
