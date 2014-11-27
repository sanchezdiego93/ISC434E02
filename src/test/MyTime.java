/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class MyTime {
    public boolean earlier(ArrayList<Integer> t1, ArrayList<Integer> t2){
        int _t1 = (t1.get(0) * 60) + t1.get(1);
        int _t2 = (t2.get(0) * 60) + t2.get(1);
        if(_t1 < _t2) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Integer> nextSecond(ArrayList<Integer> currentTime){
         ArrayList<Integer> newCurrent = new ArrayList<>();
        newCurrent.add(currentTime.get(0));
        newCurrent.add(currentTime.get(1));
        if ((currentTime.get(2) + 1) < 60) {
            newCurrent.add(currentTime.get(2) + 1);
        }
        return newCurrent;
    }
}
