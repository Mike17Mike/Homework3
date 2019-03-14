package HW3.CS3310;


//This hash map is using linear probing with open addressing

public class HashMap<E extends Comparable<E>> {
	private static int size = 1000;  //A variable that determines the size of the map and can be changed right here 
	private LinkedList maps[] = new LinkedList[size];  //Linked list of all of the urls for each key. 
	private String keys[] = new String[size];  //Sets a parallel array of strings to keep track of the key in each position and handle collision 
	private boolean usage[] = new boolean[size]; //is for being used or not
	
	public static int hash(String key) {
		int keySize = 0;
		for(int i= 0; i < key.length(); i++) {
			keySize += (int)key.charAt(i);
		}
		keySize = keySize % size;
		return keySize;
	}
	
	
	public void insert(String key, E data) {
		boolean inserted = false;
		int factor = 0;
		while(inserted != true) {
			if(usage[hash(key) + factor] == false) {
				maps[hash(key)].addEnd(data);
				usage[hash(key)] = true;
				keys[hash(key)] = key;
				inserted = true;
			}
			else {
				factor ++;
			}
		}
	}
	
	public int getSize() {
		return size;
	}
		
	
	public String[] search(String key) {
		LinkedList target = new LinkedList();
		boolean found = false;                           //Boolean for if the target key was found in the map or not
		boolean looped = false;							 //Boolean for if it wasn't found and stops it from checking an infinite amount of times
		int factor = 0;                                  //This will increment by 1 each time to keep moving forward and searching every spot in the map
		while(found != true && looped != true) {                    //Loop will terminate when it is found or if it searched the entire map
			if(keys[hash(key) + factor].compareTo(key) == 0) {      //If the key is equal to the key at that given index the if statement will start
				target = maps[hash(key)];
				found = true;
			}
			else {
				if(factor + hash(key) < size) {
					factor ++;
				}
				else if(factor + hash(key) >= size){
					factor = 0 - hash(key);
				}
				else {
					looped = true;
				}
			}
		}
		String urls[];												//Creates a string array to get the urls with the given key
		if(found == true) {											//If the key was actually found the if will start
			urls = new String[target.size()];
			for(int i = 0; i < urls.length; i++) {					//A for loop to go through the linked list and put each url in an index of an array
				urls[i] = (String) target.get(i);
			}
		}
		else {														//If it wasn't found then it makes urls null
			urls = null;
		}
		return urls;
	}

}
