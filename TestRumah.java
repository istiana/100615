/**
 * Created by USER on 6/10/2015.
 */
public class TestRumah {
    public static void main(String[] args) {

        Pemilik tia = new Pemilik("Istiana",'P',"Guru");
        System.out.println("Semua data : " + tia.toString() );
        System.out.println("Nama Pemilik : " + tia.getNamaPemilik());
        System.out.println("Jenis Kelamin : " + tia.getJenisKelamin());
        System.out.println("Pekerjaan Pemilik : " + tia.getPekerjaanPemilik());
    }
}
