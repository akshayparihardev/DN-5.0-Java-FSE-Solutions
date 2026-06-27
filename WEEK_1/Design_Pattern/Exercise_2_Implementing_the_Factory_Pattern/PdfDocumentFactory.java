package WEEK_1.Design_Pattern.Exercise_2_Implementing_the_Factory_Pattern;

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }

}