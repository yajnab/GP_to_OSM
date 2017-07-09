/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp_to_osm;
/**
 *
 * @author Yajnavalkya Bandyopadhyay
 */
public class randn {   
    public long numbera(){
        long minimum = 1000000;
        long maximum = 9999999;
        long numbaa = minimum + (int)(Math.random() * maximum); 
        return numbaa;
    }
}