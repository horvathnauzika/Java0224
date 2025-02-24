package org.example.modell;

import java.util.*;

public class Garazs implements Iterable<Jarmu> {
    private LinkedList<Jarmu> jarmuvek;

    public Garazs() {
        jarmuvek=new LinkedList<>();
        try {
            jarmuvek.add(new Jarmu("ASD-324", 5, 4500000, new UUID(2, 1), "piros", new Tulajdonos("Én")));
            jarmuvek.add(new Jarmu("DNE-583-", 4, 3900000, new UUID(9,6), "szürke", new Tulajdonos("Te")));
        } catch (NemLetezoAutoException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Auto> getAutok(){
        return new ArrayList<>(jarmuvek);
    }

    @Override
    public Iterator<Jarmu> iterator() {
        return jarmuvek.iterator();
    }
}
