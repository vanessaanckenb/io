package br.com.vanessaancken.io.outputs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleDWithFileWriterInsideABufferedWriter {

    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output-filewriter-with-bufferedwriter-test.txt"));
            bufferedWriter.write("Fist line");
            bufferedWriter.newLine();
            bufferedWriter.write("Second line");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
