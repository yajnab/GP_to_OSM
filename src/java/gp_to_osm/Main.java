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
        Main m = new Main();
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
            default:
                jg.download();
                break;
        } 
   }
    public void process(){
        try{
          String[] file = {"hospital", "restaurants", "museum", "bank", "atm", "movie", "mosque", 
              "hindu_temple", "church", "school", "university", "store", "gym", "doctor"};
          for(int it=0;it<file.length;it++){
          String JSON_FILE=file[it]+".txt";
          InputStream fis = new FileInputStream(JSON_FILE);		
	//create JsonReader object
	JsonReader reader = Json.createReader(fis);
        JsonObject jobj = reader.readObject();
         //JsonObject jobjS = jobj.getJsonObject("results");
         JsonArray res = (JsonArray) jobj.get("results");
         
       try{
         for(int i=0; i< res.size();i++){
                 JsonObject geo = res.getJsonObject(i);
                 JsonObject geoloc = geo.getJsonObject("geometry").getJsonObject("location");
                 JsonNumber lat = geoloc.getJsonNumber("lat");
                 JsonNumber lng = geoloc.getJsonNumber("lng");
                 osmgen og = new osmgen();
                 og.osmgenerator(lat, lng, file[it]);
             }
         }
         catch(Exception e){
             System.err.println(e);
         }
      }}
      catch(FileNotFoundException ex){
          System.err.println(ex);
      }
    }
    
}
    
    

