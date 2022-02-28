package thomas.projects.bank;

public abstract class Compte {
	
	private int code;
	protected float solde;
	private static int nbComptes;
	
	public Compte() {
		System.out.println("Constructeur Compte");
		this.code = ++nbComptes;
	}
	
	public static void hello() {
		System.out.println();
	}
	
	public abstract void verser(float amount);
	
	public void retirer(float amount) {
		if(this.solde - amount > 0) {
			this.solde -= amount;			
		}
	}

	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public float getSolde() {
		return solde;
	}


	public static int getNbComptes() {
		return nbComptes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compte [code=");
		builder.append(code);
		builder.append(", solde=");
		builder.append(solde);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
