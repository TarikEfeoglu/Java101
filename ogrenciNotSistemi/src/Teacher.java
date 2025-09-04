public class Teacher {
    String name;
    String mphone;
    String branch;

    Teacher(String name, String mphone, String branch) {
        this.name = name;
        this.branch = branch;
        this.mphone = mphone;

    }
    void print(){
        System.out.println("Adı = "+this.name);
        System.out.println("Telefon = "+this.mphone);
        System.out.println("Branş = "+this.branch);
    }
}
