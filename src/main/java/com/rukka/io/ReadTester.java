package com.rukka.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
//        inputstream();
//        filereader();
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("datachinese.txt"), "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void filereader() {
        try {
            FileReader fr = new FileReader("datachinese.txt");
            int n = fr.read();
            while (n != -1) {
                System.out.print((char)n);
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file = new File("data.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            InputStream is = new FileInputStream(file);
            System.out.println("File(" + file.getName() + ") open success");
            int n = is.read();
            while (n != -1) {
                System.out.print((char) n);
                n = is.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
