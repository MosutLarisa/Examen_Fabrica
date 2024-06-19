import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Angajat> lista_angajati;
    private ArrayList<Client> lista_clienti;
    private ArrayList<Act> lista_acte;
    
	public Fabrica(ArrayList<Angajat> lista_angajati, ArrayList<Client> lista_clienti, ArrayList<Act> lista_acte) {
		this.lista_angajati = lista_angajati;
		this.lista_clienti = lista_clienti;
		this.lista_acte = lista_acte;
	}

	public ArrayList<Angajat> getLista_angajati() {
		return lista_angajati;
	}

	public ArrayList<Client> getLista_clienti() {
		return lista_clienti;
	}

	public ArrayList<Act> getLista_actet() {
		return lista_acte;
	}
	
	 public void adaugareAngajat(Angajat angajat) {
		 lista_angajati.add(angajat);
	 }

	 public void concediereAngajat(Angajat angajat) {
		 lista_angajati.remove(angajat);
	 }	
	 
	 public void afisareAngajati () {
		 for (Angajat angajat : lista_angajati)
			 System.out.println(angajat.getNumeComplet() + angajat.getFunctie());
	 }
	 
	 public void adaugareClient(Client client) {
		 lista_clienti.add(client);
	}
		   
	 public void afisareClienti() {
		 for (Client client : lista_clienti) 
			 System.out.println(client.getNume());
	 }
	 



 }

