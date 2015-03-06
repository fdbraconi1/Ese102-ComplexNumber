package complexnumber;

public class ComplexNumber
{
    private double re;
    private double im;
    
    
    /**
     * 
     * @param re
     * @param im
     */
    public void setRectangular(double re, double im){
    	this.re = re;
    	this.im = im;
    }
    
    
    /**
     * 
     * @param modulus
     * @param argument
     */
    public void setPolar(double argument, double modulus){
        this.re = Math.cos(argument*Math.PI/180)*modulus;
	    this.im = Math.sin(argument*Math.PI/180)*modulus;
    }
    
    
    /**
     *
     * @return
     */
    public double getModulus(){
        return(Math.sqrt(Math.pow(this.re, 2)+Math.pow(this.im, 2)));
    }
    
    
    /**
     * 
     * @return
     */
    public double getArgument(){
    	return((Math.atan(this.im/this.re)*180)/Math.PI);
    }
    
    
    /**
     * 
     * @return
     */
    public double getRe(){
        return re;
    }
    
    
    /**
     * 
     * @return
     */
    public double getIm(){
        return im;
    }
}