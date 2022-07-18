package br.com.vanessaancken.io.outputs;

import java.io.*;

public class ExampleBWithFileOutputStreamChangingReferencesToSuper {

    public static void main(String[] args) {
        try {

            OutputStream fileOutputStream = new FileOutputStream("output-referenced-by-super-test.txt");
            Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
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
