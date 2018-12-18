package Aufgabe3;

public class Fahrzeug
{
    private short reifen;
    private String color;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;

    public static int anzahl;

    public Fahrzeug(short reifen, String color, short ps, short tueren, short geschwindigkeit) {
        this.reifen = reifen;
        this.color = color;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = false;
        this.geschwindigkeit = geschwindigkeit;
        this.anzahl+=1;
    }

    public void starten()
    {
        this.gestartet = true;
    }

    public void stoppen()
    {
        this.gestartet = false;
    }

    public void beschleunigen(short geschwindigkeit)
    {
        if(this.gestartet==true)
        {

            if(this.geschwindigkeit + geschwindigkeit <=250)
            {
                this.geschwindigkeit += geschwindigkeit;
            }
            else
            {
                this.geschwindigkeit = 250;
            }
        }
    }
    public void bremsen(short geschwindigkeit)
    {

        if(this.gestartet==true)
        {
            if(this.geschwindigkeit - geschwindigkeit >=0)
            {
                this.geschwindigkeit -= geschwindigkeit;
            }
            else
            {
                this.geschwindigkeit = 0;

            }
        }
    }
                                                                //Aufgabe 3
    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }
}
