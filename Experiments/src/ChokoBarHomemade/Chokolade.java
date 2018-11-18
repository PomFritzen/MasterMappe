package ChokoladeBarHomemade;
import java.util.Random;

public class Chokolade {
    public static void main(String[] args) {
        Random ranselector = new Random();
        String[] arr = {"Snickers", "Lion Bar", "Bounty", "Mars Bar", "Twix", "Yankie Bar", "Milky Way"};


        int theselect = ranselector.nextInt(arr.length);

        System.out.println("You should buy a " + arr[theselect]);

    }
}
