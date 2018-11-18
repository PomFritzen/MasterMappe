package Lektion3;

import java.util.Scanner;

public class l3o3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean leapYearCheck;

        System.out.print("Indtast år: ");
        int year = scanner.nextInt();
        if (year < 0) {
            System.out.println("Ugyldigt år");
            return;
        }

        if (year % 400 == 0) {
        leapYearCheck = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            leapYearCheck = true;
        } else leapYearCheck = false;

        System.out.print("Indtast måned: ");
        int month = scanner.nextInt();
        switch (month) {
            case 0:
                //System.out.println("Ugyldig måned");
                break;
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                break;
            default:
                //System.out.println("Ugyldig måned");
                break;
        }

        System.out.print("Indtast dag: ");
        int day = scanner.nextInt();
        switch (day) {
            case 0:
                //System.out.println("Ugyldig dato");
                break;
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28:
                break;
            case 29:
                if (month == 2 && leapYearCheck == false) {
                    System.out.println("Ugyldig dato");
                    return;
                } else if (month == 2 && leapYearCheck == true) {
                    break;
                }
            case 30:
                if (month == 2 && day != 29) {
                    System.out.println("Ugyldig dato");
                    return;
                } else break;
            case 31:
                if (month == 2 | month == 4 | month == 6 | month == 9 | month == 11) {
                    System.out.println("Ugyldig dato");
                    return;
                } else break;
            default:
                //System.out.println("Ugyldig dag");
                break;
                }



        int dayAfter;
        if (month == 1 && day == 31) {
            dayAfter = 1;
        } else if (month == 2 && day == 28 || month == 2 && day == 29) {
            dayAfter = 1;
        } else if (month == 3 && day == 31) {
            dayAfter = 1;
        } else if (month == 4 && day == 30) {
            dayAfter = 1;
        } else if (month == 5 && day == 31) {
            dayAfter = 1;
        } else if (month == 6 && day == 30) {
            dayAfter = 1;
        } else if (month == 7 && day == 31) {
            dayAfter = 1;
        } else if (month == 8 && day == 31) {
            dayAfter = 1;
        } else if (month == 9 && day == 30) {
            dayAfter = 1;
        } else if (month == 10 && day == 31) {
            dayAfter = 1;
        } else if (month == 11 && day == 30) {
            dayAfter = 1;
        } else if (month == 12 && day == 31) {
            dayAfter = 1; }
            else {
                dayAfter = (day+1);
        }


        int monthAfter;
        if (month == 1 && day == 31) {
            monthAfter = (month+1);
        } else if (month == 2 && day == 28 || month == 2 && day == 29) {
            monthAfter = (month+1);
        } else if (month == 3 && day == 31) {
            monthAfter = (month + 1);
        } else if (month == 4 && day == 30) {
            monthAfter = (month + 1);
        } else if (month == 5 && day == 31) {
            monthAfter = (month + 1);
        } else if (month == 6 && day == 30) {
            monthAfter = (month + 1);
        } else if (month == 7 && day == 31) {
            monthAfter = (month + 1);
        } else if (month == 8 && day == 31) {
            monthAfter = (month + 1);
        } else if (month == 9 && day == 30) {
            monthAfter = (month + 1);
        } else if (month == 10 && day == 31) {
            monthAfter = (month + 1);
        } else if (month == 11 && day == 30) {
            monthAfter = (month + 1);
        } else if (month == 12 && day == 31) {
            monthAfter = 1;
        } else {
            monthAfter = month;
        }



        int yearAfter;
        if (month == 12 && day == 31) {
            yearAfter = (year+1);
        } else yearAfter = year;




    if ( 0 >= day || day >=32 || 0 >= dayAfter || dayAfter >=32|| 0>= month || month >= 13 || 0>= monthAfter || monthAfter >= 13) {
        System.out.println("Ugyldig dato");
    } else {
        System.out.println("Dagen efter " + day + "/" + month + " " + year + " er " + dayAfter + "/" + monthAfter + " " + yearAfter);
    }

    }
}
