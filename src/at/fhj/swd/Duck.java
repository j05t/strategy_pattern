package at.fhj.swd;

public abstract class Duck {

	Quackbehavior quackbehavior;
	Flybehavior flybehavior;

	public Duck() {
	}

	public void setQuackbehavior(Quackbehavior quackbehavior) {
		this.quackbehavior = quackbehavior;
	}

	public void setFlybehavior(Flybehavior flybehavior) {
		this.flybehavior = flybehavior;
	}

	public abstract void display();

	public void performFly() {
		flybehavior.fly();
	}

	public void performQuack() {
		quackbehavior.quack();
	}

	public void swim() {
		System.out.println("swimming");
	}
}
