package ese102;
import java.io.*;
import complexnumber.*;


public class Ese102{
    public static void main(String[] args) throws IOException{
    	ComplexNumber cn=new ComplexNumber();
    	InputStreamReader input=new InputStreamReader(System.in);
    	BufferedReader tastiera=new BufferedReader(input);
    	boolean valore=false;
    	double re=0;
    	double im=0;
    	String linea;
    	while(!valore){
	     	System.out.println("Inserisci re: ");
	      	linea = tastiera.readLine();
	       	try{
	       		re=Double.valueOf(linea).doubleValue();
	       		valore=true;
	       	}
	       	catch(NumberFormatException e){
	       		System.out.println("Inserisci un numero corretto");
	       	}
        }
        valore = false;
        while(!valore){
        	System.out.println("Inserisci im: ");
        	linea = tastiera.readLine();
        	try{
        		im = Double.valueOf(linea).doubleValue();
        		valore=true;
        	}
        	catch(NumberFormatException e){
        		System.out.println("Inserisci un numero corretto");
        	}
        }
        cn.setRectangular(re, im);
        System.out.println("Modulo: " + cn.getModulus());
        System.out.println("Argomento " + cn.getArgument());       
        
    }
}