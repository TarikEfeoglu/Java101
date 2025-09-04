public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }
    void addBullExamNote(int c1Note, int c2Note, int c3Note){
        if (c1Note >=0 && c1Note<=100){
            this.c1.note = c1Note;
        }
        if (c2Note >=0 && c2Note <=100){
            this.c2.note = c2Note;
        }
        if (c3Note >=0 && c3Note <=100){
            this.c3.note = c3Note;
        }
    }

    void isPass(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note)/3.0;
        if (this.avarage >= 55){
            System.out.println("Sınıfı geçtiniz");
        }else {
            System.out.println("Sınıfta kaldınız!");
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name+ " Notu\t:"+this.c1.note);
        System.out.println(this.c2.name+ " Notu\t:"+this.c2.note);
        System.out.println(this.c3.name+ " Notu\t:"+this.c3.note);
        System.out.println("Ortalamanız = "+ this.avarage);
    }
}
