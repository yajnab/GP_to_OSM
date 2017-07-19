/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp_to_osm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Pooja Nigam
 */
public class jsonpar {
    public void process(){
        try{
          String[] file = {"hospital", "restaurant", "museum", "bank", "atm", "movie", "mosque", 
              "hindu_temple", "church", "school", "university", "store", "gym", "doctor"};
          for(int it=0;it<file.length;it++){
              for(int j=1;j<=5;j++ ){
                try{
                    String JSON_FILE="data/"+file[it]+j+".json";
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
                }
                catch(Exception e){}
              } 
          }
        }
        catch(Exception e){}
       
    }
}
