package model;

public class NodeQueue {

	private NodeQueue next;
	private Worker worker;
	
	public NodeQueue(Worker worker) {
		this.next = null;
		this.worker = worker;
	}

	public NodeQueue getNext() {
		return next;
	}

	public void setNext(NodeQueue next) {
		this.next = next;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker= worker;
	}
	
	@Override
	public String toString() {
		return "Data: [" + worker.toString() + "]";
	}
}
