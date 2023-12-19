package org.bike;

public class Ktm implements Bike {

	public void cost() {
		System.out.println("On Road Cost Will Be 2.5 L");

	}

	@Override
	public void speed() {
		System.out.println("Maximum Speed Will Be 200Kmph");

	}
	public static void main(String[] args) {
		Ktm a = new Ktm();
		a.cost();
		a.speed();
	}

}
