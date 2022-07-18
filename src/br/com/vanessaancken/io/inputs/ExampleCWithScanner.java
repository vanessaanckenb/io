package br.com.vanessaancken.io.inputs;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class ExampleCWithScanner {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("csv-file.csv"));

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                Scanner item = new Scanner(line);
                item.useLocale(Locale.US);
                item.useDelimiter(",");

                String name = item.next();
                String type = item.next();
                BigInteger agency = item.nextBigInteger();
                BigInteger digit = item.nextBigInteger();
                BigDecimal value = item.nextBigDecimal();

                String result = String.format("Titular: %20s. %s: %05d-%02d, %010.2f  ", name, type, agency, digit, value);
                System.out.println(result);

                item.close();
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
