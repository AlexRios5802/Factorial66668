
package factorial66668;

import java.io.*;
import java.util.*;

public class Factorial66668 {

    public static void main(String[] args) {
        int factorial = 1;
        int numero = 15;
        
        for (int i = numero; i > 0; i-- ) {
            factorial = factorial * i;
        }
        
        System.out.println("El factorial de " + numero + "  es: " + factorial );
    }
    
}
