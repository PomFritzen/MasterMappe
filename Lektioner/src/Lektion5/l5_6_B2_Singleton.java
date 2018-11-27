package Lektion5;

public class l5_6_B2_Singleton {
    private static l5_6_B2_Singleton Instance = new l5_6_B2_Singleton();

    private String str;

    private l5_6_B2_Singleton() {


    }

    public String getString() {
        return str;
    }

    public void setString(String str) {
        this.str = str;
    }

    public static l5_6_B2_Singleton getInstance() {
        return Instance;
    }
}