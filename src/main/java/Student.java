import poo.Comparabil;

public class Student extends CSV_Writer implements Comparabil{
    private String nume;
    private int prezenta;

    private int nota;
    

    //Getter
    public String getNume(){
        return nume;
    }

    //Setter
    public void setNume(String nume){
        this.nume=nume;
    }
     //Getter
     public int getPrezenta(){
        return prezenta;
    }

    //Setter
    public void setPrezenta(int prezenta){
        this.prezenta=prezenta;
    }

    //Getter
    public int getNota(){ return nota; }

    //Setter
    public void setNota(int nota) {this.nota = nota;}

    //    @Override
    public int comparaCu(Comparabil c) {
        Student s1 = (Student)c;
        if(this.getPrezenta() == s1.getPrezenta()){
            return 0;
        }else if (this.getPrezenta() > s1.getPrezenta()){
            return 1;
        }else {
            return -1;
    }
    }

    @Override
    public String toString() {return nume;}
}

