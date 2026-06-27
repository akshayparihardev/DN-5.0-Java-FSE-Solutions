package WEEK_1.Design_Pattern.Exercise_2_Implementing_the_Factory_Pattern;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }

}