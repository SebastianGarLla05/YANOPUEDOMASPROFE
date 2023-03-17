public class Person extends Character {

	public Person(String name) {
		super(name);
	}
	
	public boolean hasAttribute(String attribute) {
		return getInfo().contains(attribute);
	}
}