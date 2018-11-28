package Lektion6;

public class Car2 {
    String brand, licenseplate, color;
    private static int registration = 0;
    private int regno;


    public Car2(String brand, String licenseplate, String color) {
        this.brand = brand;
        this.licenseplate = licenseplate;
        this.color = color;
        regno = ++registration;
    }
    public String toString() {
        return "[" + licenseplate + "] " + color + " " + brand;
    }

    public boolean equals(Car2 otherCar) {
        if (this.licenseplate.compareTo(otherCar.licenseplate) == 0) {
            return true;
        }
        return false;
    }

    public boolean alike(Car2 otherCar) {
        if ((this.brand.compareTo(otherCar.brand) == 0) && (this.color.compareTo(otherCar.color) == 0)) {
            return true;
        }
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRegno() {
        return regno;

    }

    public static int getNextRegno() {
        return registration +1;
    }

}
