package br.com.vanessaancken.io;

import java.io.*;

public class InputOutputTestWithSystem {

    public static void main(String[] args) {
        try {
            InputStream fileInputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            OutputStream fileOutputStream = System.out;
            Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            String line = bufferedReader.readLine();
            while(line != null && !line.isEmpty()){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
