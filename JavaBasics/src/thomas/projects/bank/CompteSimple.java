package thomas.projects.bank;

public final class CompteSimple extends Compte{
	
	private float decouvert;

	public CompteSimple(float decouvert) {
		System.out.println("Constructeur Compte Simple");
		this.decouvert = decouvert;
	}
	
	@Override
	public void retirer(float amount) {
		if(amount < solde + decouvert) {
			this.solde -= amount;			
		}
	}

	@Override
	public void verser(float amount) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompteSimple [decouvert=");
		builder.append(decouvert);
		builder.append(", solde=");
		builder.append(solde);
		builder.append(", getCode()=");
		builder.append(getCode());
		builder.append("]");
		return builder.toString();
	}


	
	
}
