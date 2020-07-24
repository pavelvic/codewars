package com.company.BuildCar;


import com.company.KataDescription;

@KataDescription(
        name = "Build a Car",
        Sensei = "frameture",
        kyu = 5,
        link = "https://www.codewars.com/kata/5832d6e2565e120ae60000bb")
class Body {
    public String component;

    public Body(String component) {
        this.component = component;
    }
}

class Chassis {
    public String component;

    public Chassis(String component) {
        this.component = component;
    }
}

public class Car {
    public Body body;
    public Chassis chassis;

    public Car(int length, int doors) {

        //implement arguments check and exceptions
        if (length < 7 || doors < 1 || doors > (length - 2) / 2) throw new IllegalArgumentException();

        //implement layer 1
        String body1 = " " + "_".repeat(length - 3) + "\n";

        //implement layer 2
        String body2L = "|" + "[]".repeat(doors / 2);
        String body2R = "[]".repeat(doors - (doors / 2)) + "\\";
        String body2 = body2L + " ".repeat(length - 1 - body2L.length() - body2R.length()) + body2R + "\n";

        //implement layer 3
        String chassisL = "-o" + "-o".repeat(length < 12 ? 0 : (length - 10) / 2 - (length - 10) / 4);
        String chassisR = "o-" + "o-".repeat(length < 12 ? 0 : (length - 10) / 4);

        String chassis = chassisL + "-".repeat(length - 1 - chassisL.length() - chassisR.length()) + chassisR + "'";

        //construct object Car etc
        this.body = new Body(body1 + body2);
        this.chassis = new Chassis(chassis);
    }
}
