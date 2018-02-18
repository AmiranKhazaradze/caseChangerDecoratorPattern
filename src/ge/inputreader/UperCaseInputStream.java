package ge.inputreader;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class UperCaseInputStream extends UperCaseDecorator {


    public UperCaseInputStream(InputStream inputStream) throws FileNotFoundException {
        super(inputStream);
    }


    @Override
    public char changeRegister(char c) {
        return Character.toUpperCase(c);
    }
}
