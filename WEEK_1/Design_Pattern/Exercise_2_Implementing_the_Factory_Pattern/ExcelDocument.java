package WEEK_1.Design_Pattern.Exercise_2_Implementing_the_Factory_Pattern;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}