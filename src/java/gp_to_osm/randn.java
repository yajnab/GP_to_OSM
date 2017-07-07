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
    public long num(){
        long minimum = 1000000;
        long maximum = 9999999;
        long num = minimum + (int)(Math.random() * maximum); 
        return num;
    }
}