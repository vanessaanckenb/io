package br.com.vanessaancken.io.outputs;

import java.io.IOException;
import java.io.PrintWriter;

public class ExampleFWithPrintWriter {

    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("output-printwriter-test.txt");
            printWriter.println("PrintWriter test");
            printWriter.println();
            printWriter.println("123...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
