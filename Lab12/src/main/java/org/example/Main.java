package org.example;

public class Main {
    static public void main(String[] args){
        Tester t = new Tester("Diana", "Boltut");
        Tester t1 = new Tester("Diana", "Boltut",5, 2);
        Tester t2 = new Tester("Diana", "Boltut",5, 2, 1000);

        t.info();
        t1.info(5, 2);
        t2.info(1000);

        System.out.println("Зарплата за определенное кол-во часов: " + Tester.sal(8, 20));
    }
}

