package Lektion4;

public class Dato {

    int year, month, day;
    Dato(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String danish() {

        String output = Integer.toString(day)+"/"+Integer.toString(month)+"-"+Integer.toString(year);

        return output;
    }
    public String danishText() {


        String monthstring;

        switch (month)
        {
            case 12:
                monthstring = "December";
                break;
            case 11:
                monthstring = "November";
                break;
            case 10:
                monthstring = "Oktober";
                break;
            case 9:
                monthstring = "September";
                break;
            case 8:
                monthstring = "August";
                break;
            case 7:
                monthstring = "Juli";
                break;
            case 6:
                monthstring = "Juni";
                break;
            case 5:
                monthstring = "Maj";
                break;
            case 4:
                monthstring = "April";
                break;
            case 3:
                monthstring = "Marts";
                break;
            case 2:
                monthstring = "Februar";
                break;
            case 1:
                monthstring = "Januar";
                break;
            default:
                monthstring = "Katastrofe";
        }



        String output = Integer.toString(day)+". "+monthstring+" "+Integer.toString(year);

        return output;
    }

    public String iso() {

        String monthstring = Integer.toString(month);
        String daystring = Integer.toString(day);

        if (month < 10) {
            monthstring = "0"+monthstring;
        }


        if (day < 10) {
            daystring = "0"+daystring;
        }


        String output = Integer.toString(year)+"-"+monthstring+"-"+daystring;

        return output;

    }
}

