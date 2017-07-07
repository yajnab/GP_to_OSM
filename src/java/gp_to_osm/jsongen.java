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
    public static void main(String[] args) throws Exception {
    
        URL jeesan = new URL("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=26.917917,75.816138&radius=1500&type=restaurant&key=AIzaSyBzuBcuQtBqxwNFG36lOAZeNnLiSx-M7do");
        BufferedReader in = new BufferedReader(new InputStreamReader(jeesan.openStream()));

        OutputStream os = new FileOutputStream("restaurant.txt");


        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    } 

}
