package top.macondo.patterns.headfirst.designpatterns.strategy;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
