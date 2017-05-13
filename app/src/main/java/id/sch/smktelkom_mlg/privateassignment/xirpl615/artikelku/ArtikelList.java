package id.sch.smktelkom_mlg.privateassignment.xirpl615.artikelku;

import java.io.Serializable;

/**
 * Created by Joice Jessica on 5/13/2017.
 */

public class ArtikelList implements Serializable {
    private String image;
    private String judul;
    private String popular;

    public ArtikelList(String image, String judul, String popular) {
        this.image = image;
        this.judul = judul;
        this.popular = popular;
    }

    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getPopular() {
        return popular;
    }
}
