package at.fhj.swd;

public class FlyNoWay implements Flybehavior {

	@Override
	public void fly() {
		System.out.println("I'm not flying");
	}

}
