import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainHashSetPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teclado = "";
        Set<String> palabras = new HashSet<>();

        System.out.println("Escribe palabras. Escribe fin para terminar");
        while (!teclado.equalsIgnoreCase("fin")) {
            teclado = sc.nextLine();
            if (!teclado.equalsIgnoreCase("fin")){
                palabras.add(teclado);
            }
        }

        for(String palabra : palabras){
            System.out.println(palabra);
        }
    }
}