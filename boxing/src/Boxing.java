public class Boxing {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ahmet",20,120,100,20);
        Fighter f2 = new Fighter("Hasan",10,95,95,50);

        Match match = new Match(f1,f2,90,100);
        match.run();
    }
}