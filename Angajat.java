
public abstract class Angajat {
	
    private double salariu;
	private String nume, prenume;
    private int aniVechime;
    
	public Angajat(double salariu, String nume, String prenume, int aniVechime) {
		this.salariu = salariu;
		this.nume = nume;
		this.prenume = prenume;
		this.aniVechime = aniVechime;
	}
	public double getSalariu() {
		return salariu;
	}
	public String getNume() {
		return nume;
	}
	public String getPrenume() {
		return prenume;
	}

	public double calculeazaSalariu() {
		return salariu + (salariu * 0.1 * aniVechime);
	}

	public String getNumeComplet() {
        return nume + " " + prenume;
	}

	public abstract String getFunctie();
	
}

	

