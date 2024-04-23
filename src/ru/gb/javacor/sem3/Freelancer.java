package ru.gb.javacor.sem3;

public class Freelancer extends Employees {
     private double hourly_rate;
    private String specialty;

    public Freelancer(String name, int age, String post) {
        super(name, age, post);
        this.hourly_rate = hourly_rate;
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getPost() {
        return super.getPost();
    }

    @Override
    public void salaryCalculation() {
        double wages=hourly_rate;
        System.out.println(wages);
    }
}
