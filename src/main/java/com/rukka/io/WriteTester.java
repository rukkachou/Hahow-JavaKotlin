package com.rukka.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) {
        try {
//            FileWriter fw = new FileWriter("C:\\Users\\Scute0001\\dataoutput.txt");
            FileWriter fw = new FileWriter("dataoutput.txt");
            fw.write("abc def gg");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
