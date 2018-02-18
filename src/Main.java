import ge.inputreader.InputCaseChanger;
import ge.inputreader.LowerCaseInputStream;
import ge.inputreader.UperCaseInputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        int c;
        try{


            InputCaseChanger in =
                    new LowerCaseInputStream(new FileInputStream("./files/source.txt"));

            FileOutputStream out = new FileOutputStream("./files/out.txt");

            int input ;
            while ((input = in.read()) != -1){
                if(Character.isUpperCase((char)input)){
                    in = new LowerCaseInputStream(in);
                }else if(Character.isLowerCase(input)){
                    in = new UperCaseInputStream(in);
                }

                input = in.changeRegister((char)input);
                out.write((char)input);
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
