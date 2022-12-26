package Proje3;

public class Employe {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int vergi = 0;
    int bonus;
    int increase;

    Employe(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (this.salary <= 1000) {
        } else {
            this.vergi = this.salary * 3 / 100;
            System.out.println("Vergi : " + vergi);
        }
    }

    void bonus() {
        if (this.workHours >= 40) {
            this.bonus = (this.workHours - 40) * 30;
            System.out.println("Bonus : " + bonus);
        }
    }

    void raiseSalary() {
        if (2021 - this.hireYear < 10) {
            this.increase = this.salary * 5 / 100;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            this.increase = this.salary * 10 / 100;
        } else {
            this.increase = this.salary * 15 / 100;
        }
        System.out.println("Maaş Artışı : " + increase);
    }

    void printInfo() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus - this.vergi));
        System.out.println("Toplam maaş : " + (this.salary + this.bonus + this.increase - this.vergi));
    }
}
