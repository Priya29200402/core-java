package com.xworkz.equals;

public class Battery {
    public String brand;
    public int workingHours;
    public boolean isRechargeable;

    public Battery(String brand, int workingHours, boolean isRechargeable) {
        this.brand = brand;
        this.workingHours = workingHours;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "brand='" + brand + '\'' +
                ", workingHours=" + workingHours +
                ", isRechargeable=" + isRechargeable +
                '}';
    }

    public boolean equals(Object obj) {
        if(obj instanceof Battery){
            Battery battery=(Battery) obj;
            if(this.brand==battery.brand && this.workingHours==battery.workingHours){
                return true;
            }
        }
        return super.equals(obj);
    }
}
