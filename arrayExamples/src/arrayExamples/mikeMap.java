package arrayExamples;

public class mikeMap  {
private Object[] keyArray;
private Object[] valArray;
public int currentIndex=0;
public int size;
/**
 * mikeMap - my implementation of a map array using key-value pairs
 * @param size
 */
public mikeMap(int size){
	//initialise with required size
	keyArray = new Object[size];
	valArray = new Object[size];
	this.size=size;
}
//display all items in the map
public void showMap(){
	for(int i=0;i<currentIndex;i++){
		System.out.println(keyArray[i] + " is mapped to "+valArray[i]);
	}
}
//if key doesn't exist and map isn't full, add key-value pair
public void add(Object key,Object val){
	int keyHash = key.hashCode();
	Boolean foundit=false;
	if(currentIndex<size){
	for(int i=0;i<currentIndex;i++){
		
	
		if(keyArray[i].equals(key)){
			foundit=true;
		}}
	if(foundit){
		System.out.println("NO");
	}else{
	keyArray[currentIndex]=key;
	valArray[currentIndex]=val;
	currentIndex++;
	}
	}else{
		System.out.println("NO!, its full");
	}
	}
//remove item from map by key.
public void remove(Object key){
	int remIndex=0;
			for(int i=0;i<keyArray.length;i++){
				if(keyArray[i].equals(key)){
					remIndex = i;
				}
			}
			keyArray[remIndex]=0;
			valArray[remIndex]=0;
			currentIndex--;
}
//find item by key
public Object findByKey(Object key){
	int keyIndex=0;
	for(int i=0;i<currentIndex;i++){
		if(keyArray[i].equals(key)){
			keyIndex = i;
		}
	}
	return valArray[keyIndex];
}
//remap a particular key to a new value
public void mapKey(Object key,Object value){
	int keyIndex=0;
	for(int i=0;i<currentIndex;i++){
		if(keyArray[i].equals(key)){
			keyIndex = i;
		}
	}
	valArray[keyIndex]=value;
}
//search for a particular value, then return location or -1 if not found
public Object containsValue(Object value){
	int valIndex=-1;
	for(int i=0;i<currentIndex;i++){
		if(valArray[i].equals(value)){
			valIndex = i;
		}
	}
	return keyArray[valIndex];
}
}
