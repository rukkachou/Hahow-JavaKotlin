package com.rukka.network;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
//            URL url = new URL("https://pastebin.com/raw/CsQfxSt4");
            URL url = new URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = in.readLine();
            StringBuffer json = new StringBuffer();
            while (line != null) {
//                System.out.println(line);
                json.append(line);
                line = in.readLine();
            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
