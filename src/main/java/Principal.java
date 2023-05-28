import java.util.Scanner;
import java.util.SplittableRandom;

public class Principal {
    public static void main(String[] args) {
        String frase = validarFrase();
        comprobarPalindromo(frase);

    }

    private static String validarFrase() {
        boolean a = false;
        String frase = "" ;
        do {
            a = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese una frase: ");
            frase = sc.next();
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == '0' || frase.charAt(i) == '1' || frase.charAt(i) == '2' || frase.charAt(i) == '3' || frase.charAt(i) == '4' || frase.charAt(i) == '5' || frase.charAt(i) == '6' || frase.charAt(i) == '7' || frase.charAt(i) == '8' || frase.charAt(i) == '9') {
                    a = true;
                }
            }
        }while (a);
        return frase;
    }

    private static void comprobarPalindromo(String frase) {
        Palindromo p = new Palindromo(frase);
        boolean pa = p.vericarPali();
        if (pa){
            System.out.println("Es un palindromo");
        }else {
            System.out.println("No es un palindromo");
        }
    }
}
