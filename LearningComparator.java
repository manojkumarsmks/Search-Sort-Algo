import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearningComparator {

	public static void main(String[] args) {
		ArrayList<Cats> arrayList = new ArrayList<Cats>();
		Cats cat = new Cats(2, "British Shorthair");
		arrayList.add(cat);
		
		cat = new Cats(1, "Persian cat");
		arrayList.add(cat);
		
		cat = new Cats(8, "Sphynx cat");
		arrayList.add(cat);
		
		cat = new Cats(4, "Abyssinian cat");
		arrayList.add(cat);
		
		Collections.sort(arrayList, new sortByAge());
		
		for (Cats cats : arrayList) {
			System.out.println(cats.getAverageAge() + "  " + cats.getBreed());
		}
		
		System.out.println("------------------------------------------------------------");
		Collections.sort(arrayList, new sortByName());
		
		for (Cats cats : arrayList) {
			System.out.println(cats.getAverageAge() + "  " + cats.getBreed());
		}

	}
}

class Cats {
	int averageAge;
	String breed;
	
	public Cats(int averageAge, String breed) {
		this.averageAge = averageAge;
		this.breed = breed;
	}
	
	public int getAverageAge() {
		return averageAge;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setAverageAge(int averageAge) {
		this.averageAge = averageAge;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
}

class sortByAge implements Comparator<Cats> {

	@Override
	public int compare(Cats obj1, Cats obj2) {
		return obj1.getAverageAge() - obj2.getAverageAge();
	}
	
}

class sortByName implements Comparator<Cats> {

	@Override
	public int compare(Cats obj1, Cats obj2) {
		return obj1.getBreed().compareTo(obj2.getBreed());
	}
	
}
