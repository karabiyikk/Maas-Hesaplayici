package Proje3;

public class Maas {
    public static void main(String[] args) {

        Employe e1 = new Employe("Ahmet", 2000, 45, 1985);
        Employe e2 = new Employe("Mehmet", 950, 35, 2020);
        Employe e3 = new Employe("Veli", 1500, 42, 2000);


        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
    }
}
