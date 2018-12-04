package Far_solutions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Opgave4_4_far {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Indtast år: ");
            int year = scanner.nextInt();
            System.out.print("Indtast måned: ");
            int month = scanner.nextInt();
            System.out.print("Indtast dag: ");
            int day = scanner.nextInt();

            Date date = parseDate(year, month, day);
            if (date != null) {
                DateFormat dateFormat = new SimpleDateFormat("d/M yyyy");

                Date dayAfter = date;
                Calendar c = Calendar.getInstance();
                c.setTime(dayAfter);
                c.add(Calendar.DATE, 1);
                dayAfter = c.getTime();

                String output = String.format("Dagen efter %s er %s", dateFormat.format(date), dateFormat.format(dayAfter));
                System.out.println(output);
            }
            else {
                System.out.println("Ugyldig dato");
            }
        }

        private static Date parseDate(int year, int month, int day) {
            Date date = null;

            String maybeDate = String.format("%04d-%d-%d", year, month, day);
            SimpleDateFormat sdf = (SimpleDateFormat) DateFormat.getDateInstance();
            sdf.applyPattern("yyyy-M-d");
            sdf.setLenient(false);
            try { date = sdf.parse(maybeDate); } catch (ParseException e) { }
            return date;
        }
}
