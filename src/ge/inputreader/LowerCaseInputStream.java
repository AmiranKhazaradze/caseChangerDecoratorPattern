package ge.inputreader;

import java.io.InputStream;

;

public  class LowerCaseInputStream extends LowerCaseDecorator {


    public LowerCaseInputStream(InputStream fileInputStream) {
        super(fileInputStream);
    }

    @Override
    public char changeRegister(char c) {
        return Character.toLowerCase(c);
    }


}
