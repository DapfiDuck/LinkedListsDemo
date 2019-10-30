package list;

public class LinkedList {
	
	Element root = null;
	byte size = 0;
	
	public void append(int value) {
		if(size == 0) {
			root = new Element(value);
		} else {
			root.getIndex(size).setChild(new Element(value));
		}
		
		size++;
	}
	
	public Element get(byte i) {
		return root.getIndex(i);
	}
	
	public void delete(byte i) {
		Element parent = root.getIndex((byte) (i-1)); //get element before cut
		Element child;
		
		if(parent.getChild() != null) {
			child = parent.getChild().getChild();
		} else {
			child = null;
		}
		
		parent.setChild(child);
	}
	
	//insert after element i
	public void insert(byte i, int value) {
		Element parent = root.getIndex(i);
		Element child = parent.getChild();
		Element insert = new Element(value); 
		
		parent.setChild(insert);
		insert.setChild(child);
	}
	
	public void print(byte i) {
		System.out.println(root.getIndex(i).getValue());
	}
	
	public void print() {
		Element e = root;
		
		while(e != null) {
			System.out.print(e.getValue() + " -> ");
			e = e.getChild();
		}
		System.out.println("null");
	}

}
