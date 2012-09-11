
package ordenamiento.de.numeros;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrdenamientoDeNumeros {




    public static void main (String[] args)  throws IOException {
        int num_elementos=0;
        int i, j, aux;
        int val[] =new int [20];
        String dato2[] = new String [20];
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("ingrese cantidad de elementos");
        String dato = br.readLine();
        num_elementos = Integer.parseInt(dato);
        
        for (i=0; i<num_elementos; i++) {
            int a=i+1;
            System.out.println("Ingrese el elemento "+a+": ");
            dato2[i] = br.readLine();
            val[i] = Integer.parseInt(dato2[i]);
            
        }
        
        
        for (i=0; i<num_elementos; i++) {
            for (j=i+1; j<num_elementos; j++) {
            if (val[j] < val[i]) {
                aux=val[i];
                val[i]=val[j];
                val[j]=aux;
                
            }
        }


    }
        System.out.println();
        System.out.println("su orden es");
        for(i=0; i<num_elementos; i++)
        System.out.println(val[i]);
        
}
    
}