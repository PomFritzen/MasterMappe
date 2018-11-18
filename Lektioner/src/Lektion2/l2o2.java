package Lektion2;
import java.util.Scanner;

public class l2o2 {
    public static void main(String[] args) {
        Scanner scansec = new Scanner(System.in);


        int totalsec = scansec.nextInt();

        int seconds = totalsec % 60;

        int minisec = (totalsec % (60 * 60))-seconds;
        int minutes = minisec / 60;

        int hoursinsec = (totalsec % (60 * 60 * 24))-seconds-minisec;
        int hours = hoursinsec / 60 / 60;

        int daysinsec = (totalsec % (60 * 60 * 24 * 365))-seconds-minisec-hoursinsec;
        int days = daysinsec / 60 / 60 / 24;

        System.out.print(totalsec + " seconds equals ");
        System.out.print(days + " days, ");
        System.out.print(hours + " hours, ");
        System.out.print(minutes + " minutes and ");
        System.out.print(seconds + " seconds.");

    }

}