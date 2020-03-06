package epam.epamcollectionstask;

public class main {

	public static void main(String[] args) {
		List1 l1 = new List1();
		l1.insertnode(5);
		l1.delete(3);
		l1.delete(11);
		l1.insertnode(21.17);
		System.out.println(l1.fetch(10));
		l1.print();
	}

}
