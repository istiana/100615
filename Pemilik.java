/**
 * Created by USER on 6/10/2015.
 */
public class Pemilik {
    private String NamaPemilik;
    private char JenisKelamin;
    private  String PekerjaanPemilik;

    public Pemilik(String namaPemilik, char jenisKelamin, String pekerjaanPemilik) {
        NamaPemilik = namaPemilik;
        JenisKelamin = jenisKelamin;
        PekerjaanPemilik = pekerjaanPemilik;
    }

    public String getNamaPemilik() {
        return NamaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        NamaPemilik = namaPemilik;
    }

    public char getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getPekerjaanPemilik() {
        return PekerjaanPemilik;
    }

    public void setPekerjaanPemilik(String pekerjaanPemilik) {
        PekerjaanPemilik = pekerjaanPemilik;
    }

    @Override
    public String toString() {
        return "Pemilik{" +
                "NamaPemilik='" + NamaPemilik + '\'' +
                ", JenisKelamin=" + JenisKelamin +
                ", PekerjaanPemilik='" + PekerjaanPemilik + '\'' +
                '}';
    }

}

