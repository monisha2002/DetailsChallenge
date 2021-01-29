package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("First employee details----->\t");

        Details details1 = new Details("Robert",1994,840000,"64C- WallsStreet Sam 2000 " +
                "68D- WallsStreet John 1999 26B- WallsStreet");
        System.out.println("Name: " + details1.getName());
        System.out.println("Year of joining: " + details1.getYearOfJoining());
        System.out.println("Salary: " + details1.getSalary());
        System.out.println("Address: " + details1.getAddress());
        System.out.println("\t");

        System.out.println("Second employee details----->\t");

        Details details2 = new Details("Michael",1996,900000,"House no. 201 , Silicon Valley, London ");
        System.out.println("Name: " + details2.getName());
        System.out.println("Year of joining: " + details2.getYearOfJoining());
        System.out.println("Salary: " + details2.getSalary());
        System.out.println("Address: " + details2.getAddress());
        System.out.println("\t");

        System.out.println("Third employee details----->\t");


        Details details3 = new Details("Tim",2000,1000000,"Street - 2125, near complex building, chicago ");
        System.out.println("Name: " + details3.getName());
        System.out.println("Year of joining: " + details3.getYearOfJoining());
        System.out.println("Salary: " + details3.getSalary());
        System.out.println("Address: " + details3.getAddress());
        System.out.println("\t");
    }
}
