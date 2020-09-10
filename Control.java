package controller;

import model.Manager;
import model.Worker;

public class Control {

	private Manager manager;
	
	public Control() {
		manager = new Manager();
	}

	public void test() {
		System.out.println("Ejecuting...");
		manager.getQueue().coupling(new Worker("Andres","Ruiz","124",1500000));
		manager.getQueue().coupling(new Worker("Felipe","Calderon","123",1150000));
		manager.getQueue().coupling(new Worker("Alejandro","Rodriguez","119",1250000));
		manager.getQueue().coupling(new Worker("Luis","Martinez","128",1700000));
		System.out.println(manager.getQueue().getStringQueue());
	}

	public static void main(String[] args) {
		Control ctrl = new Control();
		ctrl.test();
	}
}
