//DO NOT EDIT
final class County implements Comparable<County>{
	// Define a private final member variable called "county" of type String to hold the name of the county
	private final String county;

	// Define a constructor that takes a string parameter "name" and sets the value of the "county" variable to the passed value
	public County(String name){
		county = name;
	}

	// Returns the name of the county
	public String county(){
		return county;
	}

	// Returns the name of the county as a string
	@Override
	public String toString(){
		return county;
	}

	// Determines whether two County objects are equal by comparing their names
	@Override
	public boolean equals(Object ob){
		if(!(ob instanceof County)) 
			return false;
		County cty = (County)ob;
		return county.equals(cty.county);
	}

	// Generates a hash code for the County object based on its name
	@Override
	public int hashCode(){
		return county.hashCode();
	}

	// Compares two County objects based on their names
	@Override
	public int compareTo(County cty){
		if(cty == null) 
			return -1;
		return county.compareTo(cty.county);
	}
}
