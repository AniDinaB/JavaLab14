package org.example;

public class Tester {
    String name;
    String surname;
    int expInY;
    int engL;
    double salary;

    public Tester(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Tester(String name, String surname,int expInY, int engL){
        this(name, surname);
        this.expInY = expInY;
        this.engL = engL;
    }

    public Tester(String name, String surname,int expInY, int engL, double salary){
        this(name, surname, expInY, engL);
        this.salary = salary;
    }

    public void info(){
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
    }

    public void info(int expInY, int engL){
        System.out.println("Опыт работы: " + expInY);
        System.out.println("Уровень английского: " + engL);
    }

    public void info(double salary){
        System.out.println("Зарплата: " + salary);
    }

    static public double sal(int hour, double s){
        double salary = hour * s;
        return salary;
    }
}

