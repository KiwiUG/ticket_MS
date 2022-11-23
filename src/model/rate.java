package model;

public class rate {
    String movie;
    int rate;
    Boolean available;

    public rate(String movie, int rate, Boolean available) {
        this.movie = movie;
        this.rate = rate;
        this.available = available;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void rates(){
        System.out.println("Name:       " + this.movie);
        System.out.println("Rate:       " + this.rate);
        System.out.println("Avaibality: " + this.available);
    }
}
