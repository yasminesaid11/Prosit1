
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ZooManagement zoo = new ZooManagement ();


            System.out.print("Saisir le nom du zoo");
            zoo.zooName = sc.nextLine();

            System.out.print("Saisir le nombre des cages");
            zoo.nbrCages = sc.nextInt();


            zoo.afficherZoo();
        }
    }



