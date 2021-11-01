package Modul2;

public class ıfElseBloklari {
    public static void main(String[] args) {
        int a = 10, b = 20;
        boolean compare = (a == b);
        //String str=compare? "Eşittir":"Eşit Değildir";
        //System.out.println(str);


        //if-else bloğu
        //parantez içine yazılır
        //yeni scope oluşturulur
        //else tek başına kullanılamaz
        if (compare) {
            System.out.println("Eşittir");
        } else {
            System.out.println("Eşit Değildir");
        }


        //else-if bloğu
        int d = 10, e = 20, f = 1;
        if (d < e && d < f) {
            System.out.println("D En Küçük Sayıdır");
        } else if (e < d && e < f) {
            System.out.println("E En küçük Sayıdır");
        } else if (f < d && f < e) {
            System.out.println("F En Küçük Sayıdır");
        }


    }
}
