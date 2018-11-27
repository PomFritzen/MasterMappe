package Lektion8;

public class l8_9_3 {
    public static void main(String[] args) {
        Cinema c = new Cinema(new int[]{6,5,4,3,3,7,10});
        c.booking(1, 2);
        c.booking(3, 4);
        c.release(3, 4);
        System.out.println("Rows: " +c.rows());
        System.out.println("Seats on row 5: " +c.seatsOnRow(5));
        System.out.println("Total number of seats: " + c.seats());
        System.out.println("Total number of available seats: " +c.vacancies());
        System.out.println("Avalable seats on row 1: " + c.rowVacancies(1));
        System.out.println(c);

    }

}
