package model;

public class Queue {
	
	// Ultimo en salir primero en entrar

	private NodeQueue first;
	private NodeQueue last;
	private int size;

	public Queue() {
		this.first = this.last = null;
		this.size = 0;
	}

	public boolean isVoid() {
		return first == null;
	}

	public void coupling(Worker worker) {
		NodeQueue newNode = new NodeQueue(worker);
		if(isVoid()) {
			first = newNode;
		}else {
			last.setNext(newNode);
		}
		last = newNode;
		size++;
	}

	public void uncouple() {
		if(!isVoid()) {
			first = first.getNext();
			size--;
		}
	}
	
	public String getStringQueue() {
		String str = "- - - - Cola - - - - \n\n";
		if (!isVoid()) {
			NodeQueue aux = first;
			for (int i = 0; i < getSize(); i++) {
				if(aux != last) {
					str += "    " + i + "    |    [" + aux.getWorker().toString() + "]\n";					
				}else {
					str += "    " + i + "    |    ~" + aux.getWorker().toString() + "~\n";					
				}
				aux = aux.getNext();
			}
		}
		return str;
	}
	
	public NodeQueue getFirst() {
		return first;
	}

	public void setFirst(NodeQueue first) {
		this.first = first;
	}

	public NodeQueue getLast() {
		return last;
	}

	public void setLast(NodeQueue last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}



}
