package Basic_Of_Spring_Framework.TightVsLooseCoupling;

import org.springframework.beans.factory.annotation.Autowired;

public class MainCallingClass {




    public static void main(String[] args) {

        //Tight Coupling
        CSVGenerator csvGenerator=new CSVGenerator();
        csvGenerator.generateOutput();

        //Loose Couipling
        //Here IOutputHelper Should be Autowired
        //But we are using Main calss to run it
        //To understand Loose Coupling concept
        IOutputHelper  iOutputHelper =new IOutputHelper();
        iOutputHelper.setOutputGenerator(new JSONGenerator());
        iOutputHelper.generateOutput();






    }
}
