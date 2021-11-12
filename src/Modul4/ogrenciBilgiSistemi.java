package Modul4;

public class ogrenciBilgiSistemi {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "556", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "557", "BIO");
        //Course sınıfından adı tarih olan yeni bir couse oluşturuyorum
        // yukarıdaki mahmut hoca nesnesini atıyorum

        Course tarih = new Course("Tarih", "101", "TRH", t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK",t2);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO",t3);
        biyo.addTeacher(t3);

        Student s1=new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNotes(100,200,300);
        s1.printNote();
        s1.isPass();


    }
}
