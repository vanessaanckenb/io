package br.com.vanessaancken.io;

import java.io.*;

public class InputOutputTestWithFiles {

    public static void main(String[] args) {
        try {
            InputStream fileInputStream = new FileInputStream("input-test.txt");
            Reader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            OutputStream fileOutputStream = new FileOutputStream("output-from-input-test.txt");
            Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            String line = bufferedReader.readLine();
            while(line != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
