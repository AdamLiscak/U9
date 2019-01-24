import java.io.Serializable;

public class Student implements Serializable {
    private String vorname;
    private String nachname;
    private int alter;
    private int matnr;
    private String nationality;

    public int getMatnr()
    {
        return matnr;
    }

    public void setMatnr(int matnr) {
        this.matnr = matnr;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Student(String vorname, String nachname, int alter, int matnr, String nationality)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.matnr = matnr;
        this.nationality=nationality;
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
    public String toString()
    {
       return getVorname()+","+getNachname()+","+getAlter()+","+getMatnr()+","+getNationality();
    }
}
