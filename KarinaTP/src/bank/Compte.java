package bank;

public abstract class Compte {
	private int		code;
	private int		nbComptes;
	protected float	solde;
	
	public Compte(int code, int nbComptes, float solde) {
		this.code = code;
		this.nbComptes = nbComptes;
		this.solde = solde;
	}

	public int getCode() {
		return code;
	}

	public int getNbComptes() {
		return nbComptes;
	}

	public float getSolde() {
		return solde;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setNbComptes(int nbComptes) {
		this.nbComptes = nbComptes;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
}
