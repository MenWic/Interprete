
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Codigo {

    public static void main(String[] args) {
        int n;
        n = 0;
        System.out.println(String.valueOf(n));
        String t;
        t = "hola";
        System.out.println(String.valueOf(t));
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo valor para n:"));
        System.out.println(String.valueOf(n));
        t = JOptionPane.showInputDialog(null, "Ingrese el nuevo valor para t:");
        System.out.println(String.valueOf(t));
        if (n == 10) {
            System.out.println(String.valueOf("n es 10"));

        } else {
            System.out.println(String.valueOf("n no es 10"));

        }
        for (int i = 0; i < 4; i++) {
            System.out.println(String.valueOf("hola"));

        }
        n = 10;
        System.out.println(String.valueOf(n));
        switch (n) {
            case 1:
                System.out.println(String.valueOf("Uno"));

                break;
            case 10:
                System.out.println(String.valueOf("Diez"));

                break;
            default:
                System.out.println(String.valueOf("Default, deplano va"));

                break;
        }
        System.out.println(String.valueOf(n));
        n = 10;
        System.out.println(String.valueOf(n));
        while (n < 12) {
            System.out.println(String.valueOf(n));

            n = n + 1;

        }
        System.out.println(String.valueOf(n));
    }
}
