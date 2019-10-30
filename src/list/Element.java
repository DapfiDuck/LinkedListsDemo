package list;

public class Element {
	
	int value;
	Element child = null;
	
	public Element(int value) {
		
		//System.out.println("Adding No. " + index);
		this.value = value;
	}
	
	public Element getIndex(byte n) {
		//System.out.println("Get Index " +n);
		if(n == 1) {
			return this;
		} else {
			return child.getIndex((byte) (n-1));
		}
	}

	public int getValue() {
		return value;
	}

	public Element getChild() {
		return child;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setChild(Element child) {
		this.child = child;
	}

}
