/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp_to_osm;

import javax.json.JsonNumber;

/**
 *
 * @author Pooja Nigam
 */
public class osmgen {
    public void osmgenerator(JsonNumber lat, JsonNumber lng, String type){
        
         randn randnum = (new randn()); //Call randum number generating class
         
         String node = "<node id=\""+ randnum.numbera() + "\" visible=\"true\" version=\"1\" changeset=\""+ randnum.numbera() + "\" timestamp=\"2009-11-18T22:51:06Z\" user=\"yajnab\" uid=\"111111\" lat=\"" + lat +  "\" lon=\""+lng+"\">\n" +
"  <tag k=\""+ type +"\" v=\""+ type +"\"/>\n" +
" </node>";
         System.out.println(node);      
    }
    
}
