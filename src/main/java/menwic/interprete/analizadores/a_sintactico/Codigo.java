package menwic.interprete.analizadores.a_sintactico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Codigo {
	public static void MainCodigo(javax.swing.JTextArea jTextAreaSalida){
int n;
n = 10;
String t;
t = "hola";
jTextAreaSalida.append(String.valueOf(n)+"\n");
jTextAreaSalida.append(String.valueOf(t)+"\n");
n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo valor para n:"));
jTextAreaSalida.append(String.valueOf(n)+"\n");
t = JOptionPane.showInputDialog(null, "Ingrese el nuevo valor para t:");
jTextAreaSalida.append(String.valueOf(t)+"\n");
if(n==10){jTextAreaSalida.append(String.valueOf("n es 10")+"\n");}else{jTextAreaSalida.append(String.valueOf("n no es 10")+"\n");}
for(int i=0; i<7; i++){jTextAreaSalida.append(String.valueOf("hola ")+"\n");}
n = 10;
jTextAreaSalida.append(String.valueOf(n)+"\n");
switch(n){case 1:
jTextAreaSalida.append(String.valueOf("Uno")+"\n");
break;
case 10:
jTextAreaSalida.append(String.valueOf("Diez")+"\n");
break;
default:jTextAreaSalida.append(String.valueOf("Default, deplano va")+"\n");break;}
jTextAreaSalida.append(String.valueOf(n)+"\n");
	}
}