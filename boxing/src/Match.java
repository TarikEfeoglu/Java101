public class Match {

    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {

        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

    }

    void run() {
        if (isChek()) {
            
            while (this.f1.healty > 0 && this.f2.healty > 0 ){
                System.out.println("======Yeni Raunt=====");
                this.f2.healty = this.f1.hit(f2);
                if (isWin())
                    break;

                this.f1.healty = this.f2.hit(f1);
                if (isWin())
                    break;
                System.out.println(this.f1.name+ "Sağlığı" +this.f1.healty);
                System.out.println(this.f2.name+ "Sağlığı" +this.f2.healty);
            }

        } else {
            System.out.println("Dövüşçülerin kiloları uygun değil !!");
        }

    }

    boolean isChek() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

    }
    boolean isWin(){
        if (f1.healty == 0){
            System.out.println(f2.name+"kazandı!");
            return true;

        }
        if (f2.healty == 0){
            System.out.println(f1.name+"Kazandı!!");
            return true;
        }
        return false;
    }
}
