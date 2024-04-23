package ru.gb.javacor.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayEmployee implements Iterable<Employees> {
    private List<Employees> employees = new ArrayList<>();

    public ArrayEmployee() {
        employees.add(new Worker("ignat", 23, "programmist"));
        employees.add(new Worker("roman", 19, "storekeeper"));
        employees.add(new Worker("mark", 45, "programmist"));
        employees.add(new Freelancer("anna", 30, "developer"));
    }
    @Override
    public Iterator<Employees> iterator() {
        return employees.iterator();
    }
}