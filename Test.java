import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Test{
	
	public static void main(String args[]){
		//Data Setup section
		ArrayList<TreeSet<Town>> towns = new ArrayList<TreeSet<Town>>();
		TreeSet<Town> cork = new TreeSet<>(Arrays.asList(new Town("Bandon"),new Town("Blarney"),new Town("Fermoy"),new Town("Kanturk")));
		towns.add(cork);
		TreeSet<Town> limerick = new TreeSet<>(Arrays.asList(new Town("Croom"),new Town("Foynes"),new Town("Ballingarry")));
		towns.add(limerick);
		TreeSet<Town> offaly = new TreeSet<>(Arrays.asList(new Town("Rhode"),new Town("Tullamore"),new Town("Barna")));
		towns.add(offaly);
		TreeSet<Town> galway = new TreeSet<>(Arrays.asList(new Town("Athenry"),new Town("Barna"),new Town("Tuam")));
		towns.add(galway);
		TreeSet<Town> dublin = new TreeSet<>(Arrays.asList(new Town("Howth"),new Town("Rush"),new Town("Skerries"),new Town("Oldtown")));
		towns.add(dublin);
		TreeSet<Town> mayo = new TreeSet<>(Arrays.asList(new Town("Ballina")));
		towns.add(mayo);
		TreeSet<Town> tipperary = new TreeSet<>(Arrays.asList(new Town("Ballina"),new Town("Clonmel"),new Town("Ballingarry"),new Town("Fethard")));
		towns.add(tipperary);
		TreeSet<Town> kerry = new TreeSet<>(Arrays.asList(new Town("Barna"),new Town("Tralee"),new Town("Listowel"),new Town("Oldtown")));
		towns.add(kerry);
		List<County> cnts = new ArrayList<>(Arrays.asList(new County("Cork"),new County("Limerick"),new County("Offaly"), new County("Galway"),new County("Dublin"), new County("Mayo"), new County("Tipperary"), new  County("Kerry")));
		
		CountyTowns data = new CountyTowns();
		for(int j = 0; j < cnts.size();j++)
			data.add(cnts.get(j),towns.get(j));
		System.out.println(data);
		
		
		//Test your CountyTowns methods based on the given data set
		System.out.println();
		
	}
}

