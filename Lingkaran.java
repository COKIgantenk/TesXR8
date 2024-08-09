import java.util.Scanner;

public class Lingkaran{
    public static void main(String[] args) throws InterruptedException {

        // diameter/radius check

        Scanner inYesNo = new Scanner(System.in);
        System.out.println("Apakah kamu mengetahui jari-jari lingkaran? (Y/N)");
        char yes = inYesNo.next().charAt(0);
        System.out.println("");

        // if radius is known

        Scanner inRadius = new Scanner(System.in);
        if (yes == 'Y' ) {
            System.out.println("Masukkan nilai jari-jari lingkaran. (Angka saja)");
        } else {
            System.out.println("Tidak apa-apa, masukkan saja nilai diameternya. (Angka saja)");
        }
        int radius = inRadius.nextInt();
        double diameter = Double.valueOf(radius);
        System.out.println("");
        
        // input height

        Scanner inHeight = new Scanner(System.in);
        System.out.println("Masukkan nilai tingginya. (Angka saja)");
        int height = inHeight.nextInt();
        System.out.println("");

        // math time

        if (yes != 'Y') {
            diameter = diameter / 2;
        }
        int volume = (int) (Math.PI * diameter * diameter);
        int luas = (int) (1/2 * Math.PI * diameter);

        // display output

        System.out.println("Luas dari lingkaran adalah " + volume + " cm3.");
        System.out.println("Luas permukaan dari lingkaran adalah " + luas + " cm2.");
        System.out.println("Sekian, terimakasih.");
        System.out.println("");
        System.out.println("Code written by @CokiGantenk");
    }
}
    


    

        


    
        
    



    

