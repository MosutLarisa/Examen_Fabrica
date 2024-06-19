
public class Oferta extends Act {
	
	private double valoareTotala;
	private Client client;

    public Oferta(int id, String nume, double valoareTotala, Client client) {
		super(id, nume);
		this.valoareTotala = valoareTotala;
		this.client = client;
	}

	public double getValoareTotala() {
		return valoareTotala;
	}

	public Client getClient() {
		return client;
	}

	public String getTipAct() {
        return "Oferta";
    }
	
}