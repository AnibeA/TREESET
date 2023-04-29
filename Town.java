//DO NOT EDIT
public class Town implements Comparable<Town>{
	private String town;

	// Define a constructor that takes a string parameter "name" and sets the value of the "town" variable to the passed value
	public Town(String name){
		town = name;
	}

	// Returns the name of the town
	public String getTown(){
		return town;
	}

	// Returns information about the town
	@Override
	public String toString(){
		return town;
	}

	// Determines whether two Town objects are equal by comparing their names
	@Override
	public boolean equals(Object ob){
		if(!(ob instanceof Town)) 
			return false;
		Town tn = (Town)ob;
		return town.equals(tn.town);
	}

	// Generates a hash code for the Town object based on its name
	@Override
	public int hashCode(){
		return town.hashCode();
	}

	// Compares two Town objects based on their names
	@Override
	public int compareTo(Town tn)
	{
		if(tn == null) 
			return -1;
		return town.compareTo(tn.town);
	}
}
