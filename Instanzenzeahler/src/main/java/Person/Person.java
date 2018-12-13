package Person;

public class Person {

    private String vorname;
    private String nachname;
    public static int instanzen = 0;


    public void setVorname(String vorname) {
        this.vorname = vorname;
    }


    public void setNachname(String nachname) {
        this.nachname = nachname;
    }


    public Person(String vorname, String nachname){
        setVorname(vorname);
        setNachname(nachname);
        this.instanzen++;
    }



}
