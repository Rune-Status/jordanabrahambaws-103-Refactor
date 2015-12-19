
public class Deque {

	public Node head = new Node();
	Node tail;

	public void method467() {
		while (true) {
			Node var1 = this.head.next;
			if (var1 == this.head) {
				this.tail = null;
				return;
			}

			var1.unlink();
		}
	}

	public Deque() {
		this.head.next = this.head;
		this.head.previous = this.head;
	}

	public static void method468(Node var0, Node var1) {
		if (var0.previous != null) {
			var0.unlink();
		}

		var0.previous = var1.previous;
		var0.next = var1;
		var0.previous.next = var0;
		var0.next.previous = var0;
	}

	public Node method469() {
		Node var1 = this.head.next;
		if (var1 == this.head) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	public Node method470() {
		Node var1 = this.head.previous;
		if (var1 == this.head) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	public Node method471() {
		Node var1 = this.head.next;
		if (var1 != this.head) {
			this.tail = var1.next;
			return var1;
		} else {
			this.tail = null;
			return null;
		}
	}

	public Node method472() {
		Node var1 = this.head.previous;
		if (var1 != this.head) {
			this.tail = var1.previous;
			return var1;
		} else {
			this.tail = null;
			return null;
		}
	}

	public Node method473() {
		Node var1 = this.tail;
		if (var1 == this.head) {
			this.tail = null;
			return null;
		} else {
			this.tail = var1.next;
			return var1;
		}
	}

	public void method474(Node var1) {
		if (var1.previous != null) {
			var1.unlink();
		}

		var1.previous = this.head;
		var1.next = this.head.next;
		var1.previous.next = var1;
		var1.next.previous = var1;
	}

	public void method475(Node var1) {
		if (var1.previous != null) {
			var1.unlink();
		}

		var1.previous = this.head.previous;
		var1.next = this.head;
		var1.previous.next = var1;
		var1.next.previous = var1;
	}

	public Node method476() {
		Node var1 = this.tail;
		if (var1 != this.head) {
			this.tail = var1.previous;
			return var1;
		} else {
			this.tail = null;
			return null;
		}
	}
}