public abstract class Character {
	
	protected String name;
	protected String atributo1, atributo2, atributo3, atributo4;
		
	public Character(String name) {
		this.name = name;
	}
	
	public void setAtributo1(String str){
		atributo1 = str;
	}

	public void setAtributo2(String str){
		atributo2 = str;
	}
	
	public void setAtributo3(String str){
		atributo3 = str;
	}
	
	public void setAtributo4(String str){
		atributo4 = str;
	}
	
	public String getInfo()
	{
		return  "   |"+name+" |:  "+atributo1+" - "+atributo2+" - "+atributo3+" - "+atributo4;	
	}
}
