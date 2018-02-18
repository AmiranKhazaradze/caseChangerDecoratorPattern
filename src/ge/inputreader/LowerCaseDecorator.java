package ge.inputreader;


import java.io.InputStream;

public abstract class LowerCaseDecorator extends InputCaseChanger {


    public LowerCaseDecorator(InputStream inputStream) {
        super(inputStream);
    }


}
