
import java.util.Scanner;

public class login {
    
    public login()
            {  
        usuario invocar=new usuario();
        System.out.println("-_-_-_-CAJERO LEON_-_-_-_-\n");
        System.out.println("elija la targeta deseada");
        System.out.println("1)master card");
        System.out.println("2)maestro");
        System.out.println("3)visa");
        System.out.println("4)American express");
        System.out.println("Digite el numero de la targeta deseada");
        Scanner var = new Scanner(System.in);
        int opcion=var.nextInt();
        int intentos=0;
        while (intentos!=3)
        {
            System.out.println("inserte numero de cuenta");
            Scanner var2= new Scanner(System.in);
        int cuenta=var2.nextInt();
            System.out.println("digite conrasena");
            Scanner var3 = new Scanner(System.in);
        int clave=var3.nextInt();
        
        for (int f=0; f<4; f++)
        {
            if (cuenta==invocar.ncuenta[f] && clave==invocar.clave[f])
            {
                System.out.println("1)consultar balance");
                
                System.out.println("2)retiro de efectivo");
                System.out.println("3)balance en cajero");
                Scanner var4 = new Scanner(System.in);
                int opcion2=var4.nextInt();
            }//fin condicion if de comprobacion
          
           
        }//fin for
            intentos++;
        }//fin while intentos
        
    }//fin login
}//fin class login