package at.fhj.swd;

/*
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * clients that use it.
 */

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		Duck model = new ModelDuck();

		mallard.performFly();
		mallard.performQuack();
		mallard.display();

		model.performFly();
		model.performQuack();
		model.display();

		// changing behavior on the fly
		model.setFlybehavior(new FlyRocketPowered());
		model.setQuackbehavior(new QuackSqueak());

		model.performFly();
		model.performQuack();
		model.display();
	}

}
