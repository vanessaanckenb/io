package br.com.vanessaancken.io.outputs;

import java.io.*;

public class ExampleCWithFileWriter {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("output-filewriter-test.txt");
            fileWriter.write("Fist line");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("Second line");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
