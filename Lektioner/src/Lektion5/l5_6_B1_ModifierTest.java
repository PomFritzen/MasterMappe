package Lektion5;

public class l5_6_B1_ModifierTest {
    private String string1; //  skal kun være synlig for objektet selv og indre klasser
    protected String string2; // skal kun være synlig for objektet selv og nedarvende klasser
    String string3; // skal være synlig for alle i pakken
    public String string4; // skal være synlig for alle i projektet
    static String string5; // skal være bundet til klassen og ens for alle objekter af samme type (også selv om den ændres)
    final String string6; // skal ikke kunne ændres når objektet er instantieret

    public l5_6_B1_ModifierTest(String string1, String string2, String string3, String string4, String string5, String string6) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
        this.string4 = string4;
        this.string5 = string5;
        this.string6 = string6;
    }
}

//opgaven er korrekt