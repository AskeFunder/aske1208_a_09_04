package SorteOpgaver.ch9.aske1208_a_09_04;

import SorteOpgaver.ch9.aske1208_a_09_04.Car;

public class SportUtilityBehicle extends Car
{
    public void m1()
    {
        System.out.println("SUV 1");
    }

    public void m2()
    {
        super.m1();
    }



    public String toString() {
        return "SUV " + super.toString();
    }
}
