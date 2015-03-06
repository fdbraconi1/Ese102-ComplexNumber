package complexnumber;

import java.io.*;
import java.util.*;
import complexnumber.*;

public class ese102 {

	public static int main() {
		
		ComplexNumber z = new ComplexNumber(0,0);
       
		System.out.println("z1= " + z.ComplexNumberGauss());
		System.out.println("z2= " + z.ComplexNumberPolar());

    return 0;
	}
}