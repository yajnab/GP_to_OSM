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
public class Ltlggrid {

    /**
     * @param args the command line arguments
     */
    public static void d_gen() {
        double x1 = 26.918360, x2 = 26.913923;
        double y1 = 75.786008, y2= 75.779632;
        double xs = (x2-x1)/150;
        double ys = (y2-y1)/150;
        for(int i=0;i<150;i++){
            for(int j=0;j<150;j++){
                System.out.println((x1+i*xs)+" "+(y1+j*ys));
            }
        }
    }
    
}