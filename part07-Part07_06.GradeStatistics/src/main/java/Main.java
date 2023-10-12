import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaPassing = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Point average (all): " + Main.averagePassing(lista));
                if (Main.averagePassing(listaPassing) == 0) {
                    System.out.println("Point average (passing): -");
                } else {
                    System.out.println("Point average (passing): " + Main.averagePassing(listaPassing));
                }
                System.out.println("Passing percentage: " + Main.passPercentage(lista, listaPassing));
                Main.statistica(lista);
                break;
            }
            if (input >= 0 && input <= 100) {
                lista.add(input);
                if (input >= 50) {
                    listaPassing.add(input);
                }
            }
        }
    }

    public static double average(ArrayList<Integer> lista) {
        double medie = 0;
        for (int i = 0; i < lista.size(); i++) {
            medie = medie + lista.get(i);
        }
        medie = medie / lista.size();
        return medie;
    }

    public static double averagePassing(ArrayList<Integer> listaPassing) {
        double medie = 0;
        if (listaPassing.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < listaPassing.size(); i++) {
            medie = medie + listaPassing.get(i);
        }
        medie = medie / listaPassing.size();
        return medie;
    }

    public static double passPercentage(ArrayList<Integer> lista, ArrayList<Integer> listaPassing) {
        double procentaj = ((double) listaPassing.size() / lista.size()) * 100;
        return procentaj;
    }
    
    public static void statistica(ArrayList<Integer> lista) {
    int[] grades = new int[6];
    for (int i = 0; i < lista.size(); i++) {
        int pointTotal = lista.get(i);
        if (pointTotal >= 0 && pointTotal < 50) {
            grades[0]++;
        } else if (pointTotal >= 50 && pointTotal < 60) {
            grades[1]++;
        } else if (pointTotal >= 60 && pointTotal < 70) {
            grades[2]++;
        } else if (pointTotal >= 70 && pointTotal < 80) {
            grades[3]++;
        } else if (pointTotal >= 80 && pointTotal < 90) {
            grades[4]++;
        } else if (pointTotal >= 90 && pointTotal <= 100) {
            grades[5]++;
        }
    }

    System.out.println("Grade distribution:");
    for (int i = grades.length - 1; i >= 0; i--) {
        System.out.print(i + ": ");
        for (int j = 0; j < grades[i]; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
    

}
