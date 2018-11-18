package Lektion8;
import java.util.Arrays;




public class Cinema {

    int[][] cinemaLayout;

    public Cinema(int[] seatsOnRow) {
        cinemaLayout = new int[seatsOnRow.length][];
        for(int i = 0; i < seatsOnRow.length; i++) {
            cinemaLayout[i] = new int[seatsOnRow[i]];

            for (int k =0; k<seatsOnRow[i]; k++) {
                cinemaLayout[i][k] = 0;
            }

        }



    }

    public int rows() {
        return cinemaLayout.length;
    }

    public int seatsOnRow(int row) {
        try {
            return cinemaLayout[row].length;
        } catch (Exception e) {
            return 0;
        }
    }

    public int seats() {

        int sum = 0;
        for( int[] i : cinemaLayout) {
            sum += i.length;
        }
return sum;

    }

    void booking(int row, int seat) {
        try {
            cinemaLayout[row][seat] = 1;
        } catch (Exception e) {
            return;
        }
    }
    void release(int row, int seat) {
        try {
            cinemaLayout[row][seat] = 0;
        } catch (Exception e) {
            return;
        }
    }

    public int rowVacancies(int row) {
        try {
        int freeSpots = 0;
    for (int i = 0; i<cinemaLayout[row].length; i++) {
        if (cinemaLayout[row][i] == 0) {
            freeSpots++;
        }
    } return freeSpots; }
    catch (Exception e) {
            return 0;
    }
    }

    public int vacancies() {
        try {
            int freeSpotsTotal = 0;
            for (int[] is : cinemaLayout) {
                for (int i : is) {
                    if (i == 0) {
                        freeSpotsTotal++;
                    }
                }
            }
            return freeSpotsTotal;
        } catch (Exception e) {
            return 0;
        }
    }

    public String toString() {
        String output = "";
        for (int[] is : cinemaLayout) {
            for (int i : is) {
                if (i == 0) {
                    output += "0";
                } else {
                    output += "#";
                }
            }
            output += "\n";
        } return output;
    }
}
