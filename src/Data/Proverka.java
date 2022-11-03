package Data;

public class Proverka {
    public static void main(String[] args) {
        Collague collague = new Collague();
        System.out.println(collague.getInfoName());
        System.out.println(collague.getInfoAge());

        Bank bank = new Bank();
        System.out.println(bank.getInfoBalance());


    }
}
