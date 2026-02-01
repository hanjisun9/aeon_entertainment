package aeon;

public class Group {
    private int id;
    public String name;
    public String debut;
    public String company;
    public String imageUrl;

    // constructor untuk data dari DB
    public Group(String n, String d, String c, String img, int getId) {
        name = n;
        debut = d;
        company = c;
        imageUrl = img;
        id = getId;
    }

    // constructor untuk form input (BELUM ADA ID)
    public Group(String n, String d, String c, String img) {
        name = n;
        debut = d;
        company = c;
        imageUrl = img;
    }

    public int getId() {
        return id;
    }
}
