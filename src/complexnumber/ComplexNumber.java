package complexnumber;

import java.lang.*;

public class ComplexNumber {
    public double re;
    public double im;

    public ComplexNumber(float re, float im) { 
        this.re = re; 
        this.im = im; 
    } 


	public String ComplexNumberGauss() {
        String r = "P" + "(" +  this.re + "," +  this.im + ")";
        return r;
    }
    
    public String ComplexNumberPolar() {
        double s= re*re + im*im;
        double ro = (double) Math.sqrt(s);
        double t = (double) Math.atan((double)(im/re));
        String r = ro + "(cos teta=" +  t + " + isen teta=" +  t + ")";
        return r;
    }


    
}


