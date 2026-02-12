package Class12_Java_FileHandling;

public class ForEachDEmo {

	public static void main(String[] args) {
		
		File[] files = {"Alice", "Bob", "Charlie"};
		for(File file : files) {
			System.out.println(file);
		}
		

	}

}
