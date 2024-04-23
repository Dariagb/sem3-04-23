package ru.gb.javacor.sem3;

public class Employees implements Comparable<Employees> {
   private String name;
     private int age;
     private String post;

    public Employees(String name, int age, String post) {
        this.name = name;
        this.age = age;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }
    private void updateAge(int age) {
        if (age < 18){
            throw new RuntimeException("Некорректный возраст человека.");
        }
        this.age = age;
    }

    private void updateName(String name) {
        if (name == null || name.length() < 3){
            throw new RuntimeException("Некорректное имя человека.");
        }
        this.name = name;
    }

    public void salaryCalculation() {

    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employees anotherEm) {
        if(this.age==anotherEm.age){
            return 0;
        }
        else if (this.age<anotherEm.age){
            return -1;
        }
        else{
        return 1;
    }
}}
