package poo.util;
import java.util.*;
import poo.Comparabil;


public class ListaDeComparabil {
    int nr_max;
    Comparabil[] elemente;
    int numarCurentDeElemente;

    public ListaDeComparabil(int nr_max) {
        this.nr_max = nr_max;
        numarCurentDeElemente = 0;
        elemente = new Comparabil[nr_max];
    }

    public void afisareElemente() {
        if (numarCurentDeElemente > 0) {
            System.out.println(Arrays.toString(elemente));
        } else {
            System.out.println("Vectorul nu contine valori");
        }

    }

    public void adaugareElement(Comparabil element_adaugat) {
        if (numarCurentDeElemente < nr_max) {
            elemente[numarCurentDeElemente] = element_adaugat;
            numarCurentDeElemente++;
            System.out.println("Elementul a fost adaugat.\n Au mai ramas: " + (nr_max - numarCurentDeElemente) + " valori de adaugat");
        } else {
            System.out.println("Nu se mai pot adauga elemente");
        }
    }

    public void sortareElemente() {
        //Bubble Sort  
        Comparabil temp;
        for (int i = 0; i < elemente.length; i++) {
            for (int j = 0; j < (elemente.length - i - 1); j++) {
                if (elemente[j - 1].comparaCu(elemente[j]) == 1) {
                    temp = elemente[j - 1];
                    elemente[j - 1] = elemente[j];
                    elemente[j] = temp;
                }

            }
        }
    }
}