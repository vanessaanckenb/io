package br.com.vanessaancken.io.inputs;

import java.io.*;

public class ExampleBWithFileInputStreamChangingReferencesToSuper {

    public static void main(String[] args) {
        try {
            InputStream fileInputStream = new FileInputStream("input-test.txt");
            Reader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line = bufferedReader.readLine();
            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
