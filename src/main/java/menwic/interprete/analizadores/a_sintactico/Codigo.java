package menwic.interprete.analizadores.a_sintactico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Codigo {
	public static void MainCodigo(javax.swing.JTextArea jTextAreaSalida){
int n;
String t;
n = 10;
t = "hola";
jTextAreaSalida.append(String.valueOf(n));
jTextAreaSalida.append(String.valueOf(t));
n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo valor para n:"));
t = JOptionPane.showInputDialog(null, "Ingrese el nuevo valor para t:");
if(n==10){jTextAreaSalida.append(String.valueOf("n es 10"));}else{jTextAreaSalida.append(String.valueOf("n no es 10"));}
for(int i=0; i<7; i++){jTextAreaSalida.append(String.valueOf("hola "));}
switch(n){case 1:
jTextAreaSalida.append(String.valueOf("switch, n es 1"));
break;
case 10:
jTextAreaSalida.append(String.valueOf("switch, n es 10"));
break;
}
	}
}