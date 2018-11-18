package Lektion5;

public class Car {
    String brand, licenseplate, color;

    public Car(String brand , String licenseplate, String color) {

        this.brand = brand;
        this.licenseplate = licenseplate;
        this.color  = color;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public String toString() {
        return "[" + licenseplate + "] " + color + " " + brand;
    }

    public boolean equals(Car otherCar) {

        if (this.licenseplate.compareTo(otherCar.licenseplate) == 0) {
            return true;
        }
        return false;
    }
    public boolean alike(Car otherCar) {
        if ((this.brand.compareTo(otherCar.brand) == 0) && (this.color.compareTo(otherCar.color) == 0)) {
            return true;
        }
        return false;
    }
}
