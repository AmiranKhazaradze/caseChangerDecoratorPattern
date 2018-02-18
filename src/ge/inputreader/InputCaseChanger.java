package ge.inputreader;

import java.io.IOException;
import java.io.InputStream;

public abstract class InputCaseChanger extends InputStream {
    InputStream inputStream;

    public InputCaseChanger(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
     public int read() throws IOException {
        return inputStream.read();
    }

    public abstract char changeRegister(char c);
}
