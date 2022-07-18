package br.com.vanessaancken.io.outputs;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ExampleAWithFileOutputStream {

    public static void main(String[] args) {
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("output-test.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("Fist line");
            bufferedWriter.newLine();
            bufferedWriter.write("Second line");

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
