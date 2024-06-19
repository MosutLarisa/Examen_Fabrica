import java.util.ArrayList;

public class Muncitor extends Angajat{

    private ArrayList<String> responsabilitati;
    
    public Muncitor(double salariu, String nume, String prenume, int aniVechime, ArrayList<String> responsabilitati) {
		super(salariu, nume, prenume, aniVechime);
		this.responsabilitati = responsabilitati;
	}
    
	public ArrayList<String> getResponsabilitati() {
		return responsabilitati;
	}

	public String getFunctie() {
		return "Muncitor";
	}

	public void adaugaResponsabilitate(String responsabilitate) {
		responsabilitati.add(responsabilitate);
	}


}
