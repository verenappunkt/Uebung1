package com.company;

public class Main {
    static int giessdauer(double feuchtigkeit){
        int dauer;
        if (feuchtigkeit < 0.2) {
            dauer = 5;
        }
        if (feuchtigkeit > 0.2 || feuchtigkeit < 0.4) {
            dauer = 3;
        }
        if (feuchtigkeit >= 0.4 && feuchtigkeit <= 0.75) {
            dauer = 1;
        } else {
            dauer = 0;
        }
        return dauer;
    }
    public static void main(String[] args) {

        double feuchtigkeit = 0.1;
        int zeitGiessen;
        zeitGiessen = giessdauer(feuchtigkeit);

        System.out.println("Die Giessdauer beträgt " + zeitGiessen);



    }
    }
