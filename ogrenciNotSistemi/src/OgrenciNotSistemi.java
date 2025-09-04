public class OgrenciNotSistemi {
    public static void main(String[] args) {
        Teacher t1 =new Teacher("Mehmet","555","FZK");
        Teacher t2 = new Teacher("Kasım","111","KMY");
        Teacher t3 =new Teacher("Belkıs","554","TRH");

        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(t1);

        Course kimya = new Course("Kimya","102","KMY");
        kimya.addTeacher(t2);

        Course tarih = new Course("Tarih","103","TRH");
        tarih.addTeacher(t3);




        Student s1 = new Student("Ahmet","65","4",fizik,kimya,tarih);
        s1.addBullExamNote(100,90,50);
        s1.isPass();
    }
}