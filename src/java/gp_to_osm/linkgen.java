/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp_to_osm;

/**
 *
 * @author Pooja Nigam
 */
public class linkgen {
    public static void ligen(String grid[][]){
        String[] file = {"hospital", "restaurants", "museum", "bank", "atm", "movie", "mosque", 
              "hindu_temple", "church", "school", "university", "store", "gym", "doctor"};
        for(int i=0;i<file.length;i++){
            for(int gi=0;gi<grid.length;gi++){                
                for(int gj=0;gj<grid[0].length;gj++){
            System.out.println("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+grid[gi][gj]+"&radius=600&type="+file[i]+"&key=AIzaSyBzuBcuQtBqxwNFG36lOAZeNnLiSx-M7do");
        }}}
    }
}
