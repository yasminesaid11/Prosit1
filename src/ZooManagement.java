public class ZooManagement {
    int nbrCages;
    String zooName;

    public ZooManagement() {
        this.nbrCages = 20;
        this.zooName = "my zoo";
    }

    public void afficherZoo() {

        System.out.println(zooName + " comporte " + nbrCages + " cages ");
    }
    
}
