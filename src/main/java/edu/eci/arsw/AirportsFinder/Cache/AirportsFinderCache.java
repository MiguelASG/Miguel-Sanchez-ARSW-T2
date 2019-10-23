/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.AirportsFinder.Cache;

import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author 2128408
 */
public class AirportsFinderCache {
    HashMap<String, String> cache = new HashMap<String, String>();
    
    public boolean inCache(String name){
        if(cache.containsKey(name)){
            return true;
        }
        return false;
    }
    
    public String nameCache(String name){
        return cache.get(name);
    }
    
}
