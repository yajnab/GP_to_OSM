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
    static boolean grid= false;
    public static void d_gen() {
        
        if(grid){
            double x1 = 26.8681, x2 = 26.8405;
            double y1 = 75.8003, y2= 75.8254;
            double xs = (x2-x1)/4;
            double ys = (y2-y1)/4;
            String grid[][] = new String[2][2];
            /*
            We Only need middle square of 9 grid
            */
            for(int i=1;i<3;i++){
                for(int j=1;j<3;j++){
                    String b = (x1+i*xs)+","+(y1+j*ys);
                    System.out.println((x1+i*xs)+","+(y1+j*ys));
                    grid[i-1][j-1]=b;
                }
            }
            linkgen lg = new linkgen();
            lg.ligen(grid);
        }
        else{
            double x = 26.847275, y =  75.814685;
            String grid[][] = new String[1][2];
            /*
            We Only one point 
            */
                String b = (x)+","+(y);
                System.out.println((x)+","+(y));
                grid[0][0]=b;
                
            linkgen lg = new linkgen();
            lg.ligen(grid);
        }
    }
    
}
