package org.example;

import org.example.modell.Auto;
import org.example.modell.NemLetezoAutoException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //

    @Test
    void testAutoKivetel(){
        Auto auto= new Auto("GZ-8", 5, 2540000);
        if(auto.getRendszam().length() < 6 || auto.getRendszam().length() > 6){
            throw new NemLetezoAutoException("A rendszám legalább 6 betű legyen");
        }
    }
}