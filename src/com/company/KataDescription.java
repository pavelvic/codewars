package com.company;

public @interface KataDescription {
    String name(); //name of the Kata (exercise), for example "Buid a Car"

    String Sensei(); //author, for example "frameture"

    int kyu(); //difficult, foe example "5" (form "8 kyu" to "1 kyu" asc)

    String link(); //URL (https://www.codewars.com/kata/5832d6e2565e120ae60000bb)

    /* you can see description of the Kata by link! */

}
