package com.xworkz.equals;

public class Industry {
    public String name;
    public String type;
    public String location;

    public Industry(String name, String type, String location) {
        this.name = name;
        this.type = type;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Industry){
            Industry industry=(Industry) obj;
            if(this.name==industry.name && this.type==industry.type){
                return true;
            }
        }
        return super.equals(obj);
    }
}
