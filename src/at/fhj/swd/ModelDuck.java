package at.fhj.swd;

public class ModelDuck extends Duck {

	public ModelDuck()  {
		setFlybehavior(new FlyNoWay());
		setQuackbehavior(new Quack());
	}
	
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
