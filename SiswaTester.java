//Driver Class
import java.util.Scanner; 

public class SiswaTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan nama lengkap");
        String nama = in.nextLine();
        System.out.println("Inputkan ID Siswa");
        int id = in.nextInt();
        System.out.println("Inputkan IPK Siswa");
        double ipk = in.nextDouble();

        //object
        Siswa lia = new Siswa();
        Siswa andi = new Siswa();
        //object dgn constructor parameter
        Siswa via = new Siswa(30067,"Saraswati",10.00);
        Siswa doni = new Siswa(id,nama,ipk);
        
        //mengubah nilai variabel
        lia.id = 12345;
        lia.nama = "Aprillia";
        lia.ipk = 08.39;
        System.out.println(lia.id);
        System.out.println(lia.nama);
        System.out.println(lia.ipk);

        andi.id = 10023;
        andi.nama = "Suharto";
        andi.ipk = 09.76;
        System.out.println(andi.id);
        System.out.println(andi.nama);
        System.out.println(andi.ipk);

        via.id = 30067;
        via.nama = "Saraswati";
        via.ipk = 10.00;
        System.out.println(via.id);
        System.out.println(via.nama);
        System.out.println(via.ipk);

        System.out.println(doni);
        
        
    }
}
