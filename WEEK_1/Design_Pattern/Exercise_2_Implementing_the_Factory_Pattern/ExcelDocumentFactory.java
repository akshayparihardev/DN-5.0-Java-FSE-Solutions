package WEEK_1.Design_Pattern.Exercise_2_Implementing_the_Factory_Pattern;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }

}