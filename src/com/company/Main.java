package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start programu.");
        System.out.println("Jestem kalkulatorem.");
        System.out.println("Podaj pierwszą liczbę.");
        Scanner pierwsza = new Scanner(System.in);
        double liczba1 = pierwsza.nextDouble();
        System.out.println("Podaj drugą liczbę.");
        Scanner druga = new Scanner(System.in);
        double liczba2 = druga.nextDouble();
        System.out.println("Wybierz operator, którego chcesz użyć: +, -, *, /.");
        Scanner operator = new Scanner(System.in);
        String akcja = operator.nextLine();
        if(akcja.equals("+")){
            double dodawanie = liczba1 + liczba2;
            System.out.println(liczba1+" + "+liczba2+" = "+dodawanie);
        }
        else if(akcja.equals("-")){
            double odejmowanie = liczba1 - liczba2;
            System.out.println(liczba1+" - "+liczba2+" = "+odejmowanie);
        }
        else if(akcja.equals("*")){
            double mnozenie = liczba1 * liczba2;
            System.out.println(liczba1+" * "+liczba2+" = "+mnozenie);
        }
        else if(akcja.equals("/")){
            double dzielenie = liczba1/liczba2;
            System.out.println(liczba1+" / "+liczba2+" = "+dzielenie);
        }
        else {
            System.out.println("Niepoprawne działanie.");
            return ;
        }
        System.out.println("Aby zamknąć program nacisnij enter.");
        Scanner koniec = new Scanner(System.in);
        String enter = koniec.nextLine();
        koniec.close();
        System.out.println("Koniec programu.");
    }
}
