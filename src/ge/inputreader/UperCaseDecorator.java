package ge.inputreader;


import java.io.InputStream;

public abstract class UperCaseDecorator extends InputCaseChanger {


    public UperCaseDecorator(InputStream fileInputStream) {
        super(fileInputStream);
    }
}
