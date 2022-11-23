package model;

public class shows {
    String name;
    String Location;
    String time;

    public shows(String name, String location, String time) {
        this.name = name;
        Location = location;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void show(){
        System.out.println("Name:     " + this.name);
        System.out.println("Location: " + Location);
        System.out.println("Time:     " + this.time);
    }
}
