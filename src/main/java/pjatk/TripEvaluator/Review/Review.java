package pjatk.TripEvaluator.Review;

public class Review {
    Integer id;
    String tresc;
    String autor;
    Integer ocena;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setOcena(Integer ocena) {
        this.ocena = ocena;
    }

    public Integer getId() {
        return id;
    }

    public String getTresc() {
        return tresc;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getOcena() {
        return ocena;
    }

    public Review() {
    }
}
