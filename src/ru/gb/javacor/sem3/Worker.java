package ru.gb.javacor.sem3;

public class Worker extends Employees{
double fixed_monthly_payment;
    private String place;

    public Worker(String name, int age, String post) {
        super(name, age, post);
        this.fixed_monthly_payment = fixed_monthly_payment;
        this.place = place;
    }

  

    public String getPlace() {
        return place;
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
       double wages=20.8 * 8* fixed_monthly_payment;
       System.out.println(wages);
    }


}
