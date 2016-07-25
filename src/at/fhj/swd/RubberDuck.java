package at.fhj.swd;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flybehavior = new FlyNoWay();
		quackbehavior = new QuackSqueak();
	}

	@Override
	public void display() {
		System.out.println("I'm a rubber duck");
	}

}
