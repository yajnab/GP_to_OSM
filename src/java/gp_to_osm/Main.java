/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp_to_osm;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Yajnavalkya Bandyopadhyay
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
          
          String JSON_FILE="employee.txt";
          InputStream fis = new FileInputStream(JSON_FILE);
		
	//create JsonReader object
	JsonReader reader = Json.createReader(fis);        

         JsonObject jobj = reader.readObject();
         System.out.println("ID: " +
            jobj.getInt("id"));
         System.out.println("Elapsed " + jobj.getString
                           ("name"));                            
         System.out.println("Permanent: " +
            jobj.getBoolean("permanent"));
         JsonObject jobjS = jobj.getJsonObject("address");
         System.out.println(jobjS.getString("street"));
      } catch (Exception ex) {
         System.out.println(ex);
      }
   }
    
    
}
