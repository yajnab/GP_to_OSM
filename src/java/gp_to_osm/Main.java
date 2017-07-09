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
    public static void main(String[] args){
      try{
          
          String JSON_FILE="hospital.txt";
          InputStream fis = new FileInputStream(JSON_FILE);		
	//create JsonReader object
	JsonReader reader = Json.createReader(fis);
        JsonObject jobj = reader.readObject();
         //JsonObject jobjS = jobj.getJsonObject("results");
         JsonArray res = (JsonArray) jobj.get("results");
         
        randn randnum = (new randn()); //Call randum number generating class      
        
        try{
         for(int i=0; i< res.size();i++){
                 JsonObject geo = res.getJsonObject(i);
                 JsonObject geoloc = geo.getJsonObject("geometry").getJsonObject("location");
                 JsonNumber lat = geoloc.getJsonNumber("lat");
                 JsonNumber lng = geoloc.getJsonNumber("lng");
                 System.out.println("lat: " + lat +"\t lng : " + lng);
             }
         }
         catch(Exception e){
             System.err.println(e);
         }
      }
      catch(FileNotFoundException ex){
          System.err.println(ex);
      }
   }
}
    
    

