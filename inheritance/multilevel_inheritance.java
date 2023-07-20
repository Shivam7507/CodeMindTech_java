package inheritance;


class Parent{
	void imParant() {
		System.out.println("I am a Parennt class!");
	}
}

class Child extends Parent{
	void imChild() {
		imParant();
		System.out.println("I am a Child class!");
	}
}

class GrandChild extends Child{
	void imGrantChild() {
		imChild();
		System.out.println("I am a GrantChild class!");
	}
}

public class multilevel_inheritance {
	public static void main(String[] args) {
		GrandChild g = new GrandChild();
		g.imGrantChild();
	}

}
