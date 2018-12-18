import Aufgabe1.Mensch;
import Aufgabe2.Student;
import Aufgabe3.Auto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        System.out.println("\nAufgabe 1:");

        Mensch ich = new Mensch("Abdullatif", 21, "männlich");

        System.out.println(ich.printAll());
                                                                                                            //Aufgabe 2
        System.out.println("\nAufgabe 2:");

        Aufgabe2.Mensch Abdullatif = new Aufgabe2.Mensch("Abdullatif", "Atalay", 21);

        Abdullatif.Status();

        Student Latif2 = new Student("Latif", "Atalay", 21, 1810653130, "Web Business & Technology");

        Latif2.Status();

                                                                                                            //Aufgabe 3
        System.out.println("\nAufgabe 3:");

        Auto audi = new Auto ((short)4, (short)4, "silber", (short)220, (short)4, (short)200);

        Auto bmw = new Auto ((short)6, (short)4, "rot", (short)180, (short)3, (short)150);

        Auto audi2 = new Auto ((short)4, (short)4, "schwarz", (short)200, (short)5, (short)70);

        Auto audi3 = new Auto ((short)8, (short)4, "blau", (short)150, (short)4, (short)190);

        Auto audi4 = new Auto ((short)7, (short)4, "weiß", (short)160, (short)5, (short)230);

                                                                                                        //Liste mit Autos
        List<Auto> liste = new ArrayList<>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        Collections.sort(liste);                                //Liste der Autos --> Sortierung nach PS (absteigend)

        for (Auto i : liste)
        {
            System.out.println(i);
        }
                                                                                                            //Aufgabe 4
        System.out.println("\nAufgabe 4:");

        String eins = JOptionPane.showInputDialog("Geben Sie bitte ein Wort ein!");

        String zwei = JOptionPane.showInputDialog("Geben Sie bitte ein zweites Wort ein!");

        String drei = JOptionPane.showInputDialog("Geben Sie bitte ein weiteres Wort ein!");

        if(eins.equals(zwei))
        {
            System.out.println("Die ersten beiden Worte sind identisch.");
        }

        else if(eins.equals(drei))
        {
            System.out.println("Das erste und das letzte Wort sind identisch.");
        }

        else if(zwei.equals(drei))
        {
            System.out.println("Die letzten beiden Worte sind identisch.");
        }

        else
        {
            System.out.println("Keiner der Wörter sind identisch.");
        }
    }
}