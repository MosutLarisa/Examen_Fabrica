
public abstract class Act {

	private int id;
	private String nume;

	public Act(int id, String nume) {
		this.id = id;
		this.nume = nume;
	}

	
	public int getId() {
		return id;
	}

	
    public String getNume() {
		return nume;
	}

    
    
	public abstract String getTipAct();

	
	
}
