import java.util.ArrayList;

public class HashFunction{
	String[] hashTable;
	int hashTableSize;
	int itemsInHash;

	public HashFunction(int size){
		this.hashTableSize = getNextPrime(size);
		this.hashTable = new String[hashTableSize];
		this.itemsInHash = 0;
	}

	public void hashFunction1(String[] inputValues){
		int hashLocation;
		for(int i = 0; i < inputValues.length; i++){
			hashLocation = Integer.parseInt(inputValues[i]) % hashTableSize;
			hashTable[hashLocation] = inputValues[i];
			itemsInHash++;
		}
	}

	public void hashFunction2(String[] inputValues){
		int hashLocation;
		for(int i = 0; i< inputValues.length;i++){
			hashLocation = Integer.parseInt(inputValues[i]); 
			hashTable[hashLocation] = inputValues[i];
			itemsInHash++;
		}
	}

	public int getNextPrime(int minValue){
		for(int i = minValue+2; true; i = i+2){
			if(isPrime(i)) return i;
		}
	}

	public boolean isPrime(int value){
		if(value % 2 == 0)
			return false;
		for(int i = 3; i * i < value; i = i+2){
			if(value % i == 0){
				return false;
			}
		}
		return true;
	}

	public void resizeHashTable(int minHashTableSize){
		int newHashTableSize = getNextPrime(minHashTableSize);
		createNewArray(newHashTableSize);
	}

	public void createNewArray(int newHashTableSize){
		String[] currentHashTableData = getValuesFromCurrentTable(hashTable);
		hashTable = new String[newHashTableSize];
		hashTableSize = newHashTableSize;
		hashFunction2(currentHashTableData);
	}

	public String[] getValuesFromCurrentTable(String[] currentHashTable){
		ArrayList<String> cleanHashTable = new ArrayList<String>();
		for(int i = 0; i < currentHashTable.length; i++){
			if(currentHashTable[i] != null && currentHashTable[i] != ""){
				cleanHashTable.add(currentHashTable[i]);
			}
		}
		return cleanHashTable.toArray(new String[cleanHashTable.size()]);
	}

}