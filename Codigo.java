import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Codigo {
	public static void main(String[] args){
//Procediminetos/Funciones creados inicialmente...
int x;
x = suma(4,6);
System.out.println(String.valueOf("La suma es:"));
System.out.println(String.valueOf(x));
double perim;
perim = diametro(4.6);
System.out.println(String.valueOf("El diametro es:"));
System.out.println(String.valueOf(perim));
String txt;
txt = "vacio";
System.out.println(String.valueOf("Instanciamos variable txt"));
System.out.println(String.valueOf(txt));
System.out.println(String.valueOf("Valor asignado a txt:"));
txt = JOptionPane.showInputDialog(null, "Ingrese el nuevo valor para txt:");
System.out.println(String.valueOf(txt));
System.out.println(String.valueOf("Inicio de switch:"));
switch(txt){case "":
System.out.println(String.valueOf("txt esta vacio"));


break;
case "a":
System.out.println(String.valueOf("txt es a"));


break;
default:System.out.println(String.valueOf("Default, txt tiene un valor no vacio!"));

break;}
System.out.println(String.valueOf("Fin de switch:"));
String impr;
impr = "impreso";
cicloEscritura(impr,6);
String a;
a = "Muchas";
String b;
b = "Gracias!";
saluda(a,b);
	
}
public static void saluda(String t1,String t2){System.out.println(String.valueOf("Saludo de Despedida!"));

for(int i=0; i<3; i++){System.out.println(String.valueOf(t1));

}

System.out.println(String.valueOf(t2));

System.out.println(String.valueOf("Ing Christian :)"));

}
public static void cicloEscritura(String texto,int cant){int cont;

cont = 0;

System.out.println(String.valueOf("Inicio de ciclo"));

while(cont<cant){System.out.println(String.valueOf(texto));

cont = cont+1;

}

System.out.println(String.valueOf("Fin de ciclo"));

}
public static double diametro(double radio){double diam;

diam = 2*radio;

if(diam>0){if(diam<100){System.out.println(String.valueOf("Diametro calculado! Entre 0 y 100"));

}else{System.out.println(String.valueOf("Diametro calculado! Mayor que 0"));

}

}else{System.out.println(String.valueOf("Diametro no puede ser menor que 0"));

}

return diam;}
public static int suma(int num1,int num2){int resultado;

resultado = num1+num2;

System.out.println(String.valueOf("Suma realizada!"));

return resultado;}
}