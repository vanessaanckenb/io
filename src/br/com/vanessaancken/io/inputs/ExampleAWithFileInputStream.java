package br.com.vanessaancken.io.inputs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleAWithFileInputStream {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("input-test.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
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
