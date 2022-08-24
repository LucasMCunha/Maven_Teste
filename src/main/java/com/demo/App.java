package com.demo;

import java.util.LinkedList;
import java.util.List;
import org.apache.commons.numbers.complex.Complex;

public class App {
    public static void main(String []args) {
        List<Complex> lista = new LinkedList<>();
        preencheLista(lista);

        for (Complex aux : lista) {
            String auxStr = convertString(aux);
            System.out.println("------------------------------------");
            System.out.println(" Complex number: " + auxStr);
            System.out.println("\nValor absoluto: " + aux.abs());
            System.out.println("Argumento: " + aux.arg());
            System.out.println("Seno: " + aux.sin());
            System.out.println("Cosseno: " + aux.cos());    
        }
    }

    private static void preencheLista(List<Complex> lista) {
        lista.add(Complex.I);
        lista.add(Complex.ONE);
        lista.add(Complex.ZERO);
        lista.add(Complex.ofCartesian(5, 4));
        lista.add(Complex.ofCartesian(1, 2));
        lista.add(Complex.ofCartesian(10, -8));
        lista.add(Complex.ofCartesian(6, 7));
    }

    public static String convertString(Complex x) {
        String str="";
        for (String letra : x.toString().split("")) {
            if (letra.equals("(") || letra.equals(")")) {
                continue;
            }
            else if (letra.equals(",")) {
                str += " + ";
            }
            else {
                str += letra;
            }
        }
        str += "i";
        return str;
    }
}
