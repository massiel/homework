package cajero.mco;
import java.util.Scanner;
public class CajeroMCO {
public static void main(String[] args) {
usuario invocar=new usuario();
card tarjeta=new card();
papeletas billetes=new papeletas();
int A;
System.out.println("-_-_-_-CAJERO LEON_-_-_-_-\n");
System.out.println("elija la targeta deseada");
System.out.println("1)MASTER CARD");
System.out.println("2)MAESTRO");
System.out.println("3)VISA");
System.out.println("4)AMERICAN EXPRESS");
System.out.println("--Digite el numero de la targeta deseada--");
Scanner var = new Scanner(System.in);
int opcion=var.nextInt();
A=opcion;
System.out.println("--inserte numero de cuenta--");
Scanner var2= new Scanner(System.in);
int cuenta=var2.nextInt();
int intentos=0;
while (intentos!=3)
{
System.out.println("--digite conrasena--");
Scanner var3 = new Scanner(System.in);
int clave=var3.nextInt();
for (int f=0; f<4; f++)
{
if (cuenta==invocar.ncuenta[f] && clave==invocar.clave[f])
{
System.out.println("1)consultar balance");
System.out.println("2)retiro de efectivo");
System.out.println("3)balance en cajero");
System.out.println("opcion: ");
Scanner var4 = new Scanner(System.in);
int opcion2=var4.nextInt();
switch(opcion2)
{
case 1:
System.out.println("sen@r: " + invocar.nombre[f] + " su saldo disponible es: "+ invocar.saldo[f] );
break;
case 2:
System.out.println("1) 100");
System.out.println("2) 200");
System.out.println("3) 500");
System.out.println("4) 1000");
System.out.println("5) 2000") ;     
Scanner var5= new Scanner(System.in);
int opcion3=var5.nextInt();
int pp100=0;
int pp200=0;
int pp500=0;
int pp1000=0;
int pp2000=0;
int retiro=0;
if (tarjeta.saldopordia[A]>0){
switch(opcion3)
{ 
case 1:
invocar.saldo[f]-=100; pp100++; retiro+=100;tarjeta.saldopordia[A]-=100; billetes.cien--;
break;
case 2:
invocar.saldo[f]-=200; pp200++; retiro+=200;tarjeta.saldopordia[A]-=200;billetes.doscientos--;
break;
case 3:
invocar.saldo[f]-=500; pp500++; retiro+=500;tarjeta.saldopordia[A]-=500;billetes.quinientos--;
break;
case 4:
invocar.saldo[f]-=1000; pp1000++; retiro+=1000;tarjeta.saldopordia[A]-=1000;billetes.mil--;
break;
case 5:
invocar.saldo[f]-=2000; pp2000++; retiro+=2000;tarjeta.saldopordia[A]-=2000;billetes.dosmil--;
break; 
}//fin del switch opcion 3
}//fin del if tarjeta
System.out.println("RECIBO") ;
System.out.println("sen@r: "+ invocar.nombre[f]) ;
System.out.println("----------------------------");
System.out.println("retiro: "+retiro);
System.out.println("----------------------------");
System.out.println("disponible: "+invocar.saldo[f]);
System.out.println("----------------------------");
System.out.println("Cantidad de 100: "+ pp100) ;    
System.out.println("Cantidad de 200: "+ pp200);
System.out.println("Cantidad de 500: "+ pp500);
System.out.println("Cantidad de 1000: "+pp1000);
System.out.println("Cantidad de 2000: "+pp2000);
System.out.println("desea realizar otra transaccion?\n 1)SI \n 2)NO");
System.out.println("OPCION");
Scanner var6= new Scanner(System.in);
int opcion5=var6.nextInt();     
break;
case 3:
System.out.println("--BILLETES EN CAJERO--");
System.out.println("Cantidad de 100: "+ billetes.cien) ;    
System.out.println("Cantidad de 200: "+ billetes.doscientos);
System.out.println("Cantidad de 500: "+ billetes.quinientos);
System.out.println("Cantidad de 1000: "+billetes.mil);
System.out.println("Cantidad de 2000: "+billetes.dosmil);
break;
} //fin switch
}//fin condicion if de comprobacion
}//fin for
intentos++;
if  (intentos==3)
System.out.println("--su tarjeta ha sido bloqueada--");
}//fin while intentos
}//fin login
}//fin class login

