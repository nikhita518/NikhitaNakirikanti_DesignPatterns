package com.mycompany.pattern;

import com.mycompany.pattern.Student.StudentBuild;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Builder Design Pattern");
        Student student = new Student.StudentBuild("Nikhita", "Nakirikanti", "VVIT").age(19).address("Guntur").acquire();
        System.out.println(student.details());
        Student student1 = new Student.StudentBuild("UshaSri", "Mavuri", "RVR").age(21).acquire();
        System.out.println(student1.details());
        System.out.println();
        
        System.out.println("Singleton Design Pattern");
        Singleton single = Singleton.getInstance();
        System.out.println(single.s);
        Singleton single1 = Singleton.getInstance();
        System.out.println(single1.s);
        System.out.println();
        
        System.out.println("Bridge Design Pattern");
        Shape shape1 = new Rectangle(new ColorRed(),new ColorBlue());
        shape1.print();
        Shape shape2 = new Circle(new ColorRed(),new ColorBlue());
        shape2.print();
        System.out.println();
        
        System.out.println("Decorater Design Pattern");
        Rover rover = new Rover();
        rover.produce();
        Benz benz = new Benz();
        benz.produce();
        System.out.println();
        
        System.out.println("Commad Design Pattern");
        LightOnCommand light = new LightOnCommand(new Light());
        light.execute();
        GenratorService genservice = new GenratorService(new Generator());
        genservice.execute();
        LightOffCommand lightoff = new LightOffCommand(new Light());
        lightoff.execute();
        System.out.println();
        
        System.out.println("State Design Pattern");
        TVStateChange state = new TVStateChange();
        state.alert();
        state.alert();
        state.setState(new Mute());
        state.alert();
        state.setState(new Change());
        state.alert();
    }
}
