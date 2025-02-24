package org.example.modell;

import java.util.LinkedList;
import java.util.UUID;

public class Jarmu extends Auto{
    //
    private UUID id;
    private String szin;
    private Tulajdonos tulajdonos;

    public Jarmu(String rendszam, int ferohely, int ar, UUID id, String szin,
                 Tulajdonos tulajdonos) throws NemLetezoAutoException {
        super(rendszam, ferohely, ar);
        this.id = id;
        this.szin = szin;
        this.tulajdonos = tulajdonos;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

    public void setTulajdonos(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "rendszam='" + super.getRendszam() + '\'' +
                ", ferohely="+ super.getFerohely() +
                ", ar="+ super.getAr() +
                ", id=" + id +
                ", szin='" + szin + '\'' +
                ", tulajdonos=" + tulajdonos +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
