package org.example.modell;

import java.util.Objects;

public class Auto{
    //
    private String rendszam;
    private int ferohely, ar;

    public Auto(String rendszam, int ferohely, int ar) throws NemLetezoAutoException {
        if(rendszam.length() < 6 || rendszam.length() > 6){
            throw new NemLetezoAutoException("A rendszám legalább 6 betű legyen");
        }
        this.rendszam = rendszam;
        this.ferohely = ferohely;
        this.ar = ar;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    @Override
    public String toString() {
        return "Auto{" +
                ", rendszam='" + rendszam + '\'' +
                ", ferohely=" + ferohely +
                ", ar=" + ar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return ferohely == auto.ferohely && Objects.equals(rendszam, auto.rendszam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rendszam, ferohely);
    }
}
