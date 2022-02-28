package thomas.bazar;

public class Prof extends Personne{

	Animal moyenLocomotion;
	
	public Prof(Animal moyenLocomotion) {
		super();
		this.moyenLocomotion = moyenLocomotion;
	}

	@Override
	public void eat() {
		this.points -= 1;
	}

	public Animal getMoyenLocomotion() {
		return moyenLocomotion;
	}

	public void setMoyenLocomotion(Animal moyenLocomotion) {
		this.moyenLocomotion = moyenLocomotion;
	}
	
	

}
