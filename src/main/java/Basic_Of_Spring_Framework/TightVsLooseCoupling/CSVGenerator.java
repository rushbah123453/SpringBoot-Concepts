package Basic_Of_Spring_Framework.TightVsLooseCoupling;


import org.springframework.stereotype.Component;

@Component
public class CSVGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("I am CSVGenerator");
    }
}
