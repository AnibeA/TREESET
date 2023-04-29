import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountyTowns{
	
	// Define a private member variable called "data" of type TreeMap that maps County objects to TreeSet of Town objects
	private TreeMap<County,TreeSet<Town>> data;

	// Define a constructor that initializes the "data" variable as a new TreeMap
	public CountyTowns(){
		data = new TreeMap<>();
	}

	// Add a town to the TreeSet of towns for a given county
	public void add(County cty, Town town){
		// Check if the county already exists in the TreeMap
		if(data.containsKey(cty))
			// If so, add the town to the existing TreeSet
			data.get(cty).add(town);
		else{
			// If not, create a new TreeSet with the town and add it to the TreeMap
			TreeSet<Town> tmp = new TreeSet<>();
			tmp.add(town);
			data.put(cty,tmp);
		}
	}
	// Add all towns to the TreeSet of towns for a given county
	public void add(County cty, Set<Town> towns){
		for(Town town : towns)
			add(cty,town);

	}

	public Set<Town> listTowns(County cty){
		// List towns in a given county (10 marks)
		if(data.containsKey(cty)){
			System.out.println(cty.toString());
		}

		return null;
	}

	public Set<County> counties(){
		//List all counties (5 marks)

		return null;
	}

	public Set<Town> listAllTowns(){
		//Return list of all towns (5 marks)
		return null;
	}

	public List<County> findCounty(Town tn){
		// find county or counties for a given town (10 marks)
		return null;
	}

	public boolean containsTown(Town tn){
		//check if town recorded (5 marks)
		return false;
	}


	public boolean containsCounty(County cty){
		//check if county recorded (5 marks)
		return false;
	}

	
	public Map<Town,TreeSet<County>> mapTownToCounty(){
		// Return a map that maps towns to counties (10 marks)
		return null;
	}

	// Return a Collection of all TreeSet of towns in the TreeMap
	public Collection<TreeSet<Town>> listAllTownsA(){
		return data.values();  
	}

	// Return a string representation of the data in the TreeMap
	public String toString(){
		return data.toString();
	}
}
