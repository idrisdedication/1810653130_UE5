package Aufgabe2;

public class Mensch
{
    private String vorname;
    private String nachname;
    private int alter;

    public Mensch(String vorname, String nachname, int alter)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public void Status()
    {
        System.out.println("Es handelt sich um einen Menschen. Er/Sie  heißt " + getVorname() + " " + getNachname() + " und ist " + getAlter() + " Jahre alt.");
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}