/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp_to_osm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import javax.json.*;

/**
 *
 * @author Yajnavalkya Bandyopadhyay
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        int c = 0;
        jsonpar m = new jsonpar();
        jsongen jg = new jsongen();
        Ltlggrid ltd = new Ltlggrid();
        System.out.println("1 for download, 2 for processing, 3 for Coordinate Generation");
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        c = Integer.parseInt(br.readLine());
        switch(c){
            case 1:
                jg.download();
                break;
            case 2:
                m.process();
                break;
            case 3:
                ltd.d_gen();
                break;
            default:
                jg.download();
                break;
        } 
   } 
    
}
    
    

