package complexnumber;
import java.io.*;
import java.util.*;

import complexnumber.*;

public class main {

	public static void main(String[] args) {

		InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        System.out.println("Programma che gestisce le coordinate cartesiane e polari");
        
        
        String linea = "";
   
        ComplexNumber z = new ComplexNumber(0,0);
        
        boolean valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci la coordinata a(parte reale):");
            try {
				linea = tastiera.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            try {
                z.re = Float.valueOf(linea).floatValue();
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci la coordinata b(parte immaginaria): ");
            try {
				linea = tastiera.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            try {
                z.im = Float.valueOf(linea).floatValue();
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
				
		       
				System.out.println("rappresentazione piano cartesiano:" + z.ComplexNumberGauss());
				System.out.println("rappresentazione coordinate polari: ro= "+ z.ComplexNumberPolar());

		
			}
		}