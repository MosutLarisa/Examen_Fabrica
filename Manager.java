import java.util.ArrayList;

public class Manager extends Angajat {
	
    private ArrayList<Muncitor> subordonati;

	public Manager(double salariu, String nume, String prenume, int aniVechime, ArrayList<Muncitor> subordonati) {
		super(salariu, nume, prenume, aniVechime);
		this.subordonati = subordonati;
	}

	public ArrayList<Muncitor> getSubordonati() {
		return subordonati;
	}
	public String getFunctie() {
		return "Manager";
	}

	public void adaugaSubordonat(Muncitor muncitor) {
		subordonati.add(muncitor);
	}

	
}

