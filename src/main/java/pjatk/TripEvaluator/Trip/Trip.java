package pjatk.TripEvaluator.Trip;

import pjatk.TripEvaluator.Review.Review;

import java.util.List;

public class Trip {
    Integer id;
    String tytul;
    String destynacja;
    String koszt;
    List<Review> listOfReviews;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setDestynacja(String destynacja) {
        this.destynacja = destynacja;
    }

    public void setKoszt(String koszt) {
        this.koszt = koszt;
    }

    public void setListOfReviews(List<Review> listOfReviews) {
        this.listOfReviews = listOfReviews;
    }

    public Integer getId() {
        return id;
    }

    public String getTytul() {
        return tytul;
    }

    public String getDestynacja() {
        return destynacja;
    }

    public String getKoszt() {
        return koszt;
    }

    public List<Review> getListOfReviews() {
        return listOfReviews;
    }

    public Trip(Integer id, String tytul, String destynacja, String koszt, List<Review> listOfReviews) {
        this.id = id;
        this.tytul = tytul;
        this.destynacja = destynacja;
        this.koszt = koszt;
        this.listOfReviews = listOfReviews;
    }
}
