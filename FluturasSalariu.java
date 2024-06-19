
public class FluturasSalariu extends Act {

	private double valoareSalariu;
	private Angajat angajat;

	public FluturasSalariu(int id, String nume, double valoareSalariu, Angajat angajat) {
		super(id, nume);
		this.valoareSalariu = valoareSalariu;
		this.angajat = angajat;
	}

	public double getValoareSalariu() {
		return valoareSalariu;
	}
	public Angajat getAngajat() {
		return angajat;
	}

	public String getTipAct() {
		return "Fluturas Salariu";
	}

}

