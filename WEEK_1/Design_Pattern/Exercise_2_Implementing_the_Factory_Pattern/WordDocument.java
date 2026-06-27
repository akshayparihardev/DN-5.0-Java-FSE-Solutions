package WEEK_1.Design_Pattern.Exercise_2_Implementing_the_Factory_Pattern;

public class WordDocument implements Document {
    
    @Override
    public void open(){
        System.out.println("Word Document Opening");
    }
}
