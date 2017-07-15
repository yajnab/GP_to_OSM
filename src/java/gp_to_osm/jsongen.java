/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp_to_osm;

import java.net.*;

import java.io.*;
/**
 *
 * @author Yajnavalkya Bandyopadhyay
 */
public class jsongen {
    public void download() throws Exception {
    
        /*URL jeesan = new URL("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=26.917917,75.816138&radius=1500&type=restaurant&key=AIzaSyBzuBcuQtBqxwNFG36lOAZeNnLiSx-M7do");
        BufferedReader in = new BufferedReader(new InputStreamReader(jeesan.openStream()));

        OutputStream os = new FileOutputStream("restaurant.txt");


        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }*/ 
        OutputStream out = new FileOutputStream("test.txt");
        URL url = new URL("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=26.917917,75.816138&radius=1500&type=restaurant&key=AIzaSyBzuBcuQtBqxwNFG36lOAZeNnLiSx-M7do");
        URLConnection conn = url.openConnection();
        conn.connect();
        InputStream is = conn.getInputStream();

        copy(is, out);
        is.close();
        out.close();
    }

    private static void copy(InputStream from, OutputStream to) throws IOException {
        byte[] buffer = new byte[4096];
        while (true) {
            int numBytes = from.read(buffer);
            if (numBytes == -1) {
                break;
            }
            to.write(buffer, 0, numBytes);
        }
    }
}
