import poo.util.ListaDeComparabil;

public class main {
    public static void main (String[] args){
        ListaDeComparabil list= new ListaDeComparabil(Integer.valueOf(args[0]));

        String[][] data = new String[(Integer.valueOf(args[0])+1)][4];
        for(int i =0; i<=Integer.valueOf(args[0]);i++){
                Student student = new Student();
                student.setPrezenta(i);
                student.setNume("Stud_ELTH_" + i);
                double nota = Math.random() * (10 - 1) + 1;
                student.setNota((int) nota);
                list.adaugareElement(student);
                data[i][0]= String.valueOf(i+1);
                data[i][1]= student.getNume();
                data[i][2]= String.valueOf(student.getPrezenta());
                data[i][3]= String.valueOf(student.getNota());

        }
        String[] header={"Nr","Nume","Prezenta","Nota"};
        Student.writeToCSV(data,"Test",header);
        list.afisareElemente();
    }
}