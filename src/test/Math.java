/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Diego
 */
public class Math {
    public int perimeterOfSquare(int n){
        return n+n+n+n;
    }
    
    public int twoSumOfN(int n, int l, int r){
        int i=0;
        for(int a= l; a <= r; a++){
            for(int b = a+1; b <= r; b++){
                if(a+b == n){
                    i++;
                }
            }
        }        
        return i;
    }
    
    public boolean evenDivide(int n){
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
