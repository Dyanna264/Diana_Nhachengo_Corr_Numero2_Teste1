package gitcorr_numero2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validacao {
    BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
    
    public int validarInt (int min, int max, String msg) {
        int valor = 0;
        System.out.print(msg);
        
        do {
            try {
                valor = Integer.parseInt(w.readLine());
            } catch (IOException | NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
            if (valor < min || valor > max) {
                    System.out.println("Valor invalido. Tente Novamente!");
            }
        } while (valor < min || valor > max);
        return valor;
    }
    
    public float validarFloat (float min, float max, String msg) {
        float valor = 0;
        System.out.print(msg);
        
        do {
            try {
                valor = Float.parseFloat(w.readLine());
            } catch (IOException | NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
            if (valor < min || valor > max) {
                    System.out.println("Valor invalido. Tente Novamente");
            }
        } while (valor < min || valor > max);
        return valor;
    }
    
    public String validarString (String msg) {
        String palavra = "";
        System.out.print(msg);
        
        do {
            try {
                palavra = w.readLine();
            } catch (IOException ex) {
                System.out.println("error: " + ex.getMessage());
            }
            if (palavra.trim().isEmpty()) {
                System.out.println("Preenchimento vazio. Tente novamente!!!");
            }
        } while (palavra.trim().isEmpty());
        return palavra;
    }
    
    public char validarChar (char a, char b, char c, char d, String msg) {
        char palavra = ' ';
        System.out.print(msg);
        
        do {
            try {
                palavra = w.readLine().charAt(0);
            } catch (IOException ex) {
                System.out.println("error: " + ex.getMessage());
            }
            if (palavra != a && palavra != b && palavra != c && palavra != d) {
                System.out.println("Preencha com palavras. Tente novamente!!!");
            }
        } while (palavra != a && palavra != b && palavra != c && palavra != d);
        return palavra;
    }
}
