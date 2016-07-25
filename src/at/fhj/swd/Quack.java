package at.fhj.swd;

public class Quack implements Quackbehavior {

	@Override
	public void quack() {
		System.out.println("quack!");
	}

}
