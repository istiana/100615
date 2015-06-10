/**
 * Created by USER on 6/9/2015.
 */
public class Rumah {
    //atribut
    private String Alamatrumah;
    private double LuasRumah;
    private Pemilik Nama;

    public Rumah(String alamatrumah, double luasRumah, Pemilik nama) {
        Alamatrumah = alamatrumah;
        LuasRumah = luasRumah;
        Nama = nama;
    }

    public String getAlamatrumah() {
        return Alamatrumah;
    }

    public void setAlamatrumah(String alamatrumah) {
        Alamatrumah = alamatrumah;
    }

    public double getLuasRumah() {
        return LuasRumah;
    }

    public void setLuasRumah(double luasRumah) {
        LuasRumah = luasRumah;
    }

    public Pemilik getNama() {
        return Nama;
    }

    public void setNama(Pemilik nama) {
        Nama = nama;
    }

    @Override
    public String toString() {
        return "Rumah{" +
                "Alamatrumah='" + Alamatrumah + '\'' +
                ", LuasRumah=" + LuasRumah +
                ", Nama=" + Nama +
                '}';
    }
}
