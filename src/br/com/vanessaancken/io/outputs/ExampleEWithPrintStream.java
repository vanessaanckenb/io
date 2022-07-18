package br.com.vanessaancken.io.outputs;

import java.io.*;

public class ExampleEWithPrintStream {

    public static void main(String[] args) {
        try {
            PrintStream printStream = new PrintStream("output-printstream-test.txt");
            printStream.println("PrintStream test");
            printStream.println();
            printStream.println("123...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
