package Basic_Of_Spring_Framework.TightVsLooseCoupling;


import org.springframework.stereotype.Component;

@Component
public class IOutputHelper {


    IOutputGenerator iOutputGenerator;


    public void generateOutput(){
         iOutputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator iOutputGenerator){
    this.iOutputGenerator=iOutputGenerator;
    }
}
