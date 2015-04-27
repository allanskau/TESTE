/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Pratica32 {
    private double x;
    private double media;
    private double desvio;
        
    public static double densidade(double x, double media, double desvio) {
        double d = (1/Math.sqrt(2*Math.PI*desvio))*Math.pow(Math.E,(-1/2)*Math.pow((x-media)/desvio, 2));
        return d;
    }
    
    public static void main(String[] args) {
        double x = -1;
        double media = 67;
        double desvio = 3;
        System.out.println(densidade(x, media, desvio));
    }
}
