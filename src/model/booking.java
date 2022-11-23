package model;

public class booking {
    int rate;
    int numberofseats;
    Boolean threeD;

    public booking(int rate, int numberofseats, Boolean threeD) {
        this.rate = rate;
        this.numberofseats = numberofseats;
        this.threeD = threeD;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getNumberofseats() {
        return numberofseats;
    }

    public void setNumberofseats(int numberofseats) {
        this.numberofseats = numberofseats;
    }

    public Boolean getThreeD() {
        return threeD;
    }

    public void setThreeD(Boolean threeD) {
        this.threeD = threeD;
    }
    public void book() {
        int total;
        if (this.threeD) {
            total = (this.numberofseats)*(rate + 50);
        } else {
            total =  (this.numberofseats)*rate;
        }
        System.out.println("Total cost: " + total);
    }

}
