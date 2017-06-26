package arrayExamples;

import java.util.*;

public class arrays implements ArrayInterface {
	static int[] integerArray = new int[1000];
public static void getNumbers(int[] arr, int quant,Boolean highestNums){
	
	int[] resultArray = new int[quant];
	int highest=0;
	int workingHighest=0;
	if(!highestNums)workingHighest=1000;

	for(int a=0;a<quant;a++){
		highest=workingHighest;
	for (int i : arr) {
		if(highestNums){
		if((arr[i]>highest)&&(searchArray(resultArray, arr[i])<0)){
			highest=arr[i];
		}
		
	}else{
		if((arr[i]<highest)&&(searchArray(resultArray, arr[i])<0)){
			highest=arr[i];
		}
	}
		
	
	}
	resultArray[a]=highest;
	}
	showArray(resultArray);
}
	public static void getTopThree(int[] arr) {
		long starttime = System.nanoTime();
		//
		int[] arr2 = arr.clone();
		int highest = max(arr2);
		int highindex = arrays.searchArray(arr2, highest);
		// System.out.println(highindex);
		arr2[highindex] = 0;
		int secHighest = max(arr2);
		arr2[arrays.searchArray(arr2, secHighest)] = 0;
		int thiHighest = max(arr2);
		arr2[arrays.searchArray(arr2, thiHighest)] = 0;
		long endtime = System.nanoTime() - starttime;
		System.out.println(endtime);
		System.out.println("First highest: " + highest);
		System.out.println("Second highest: " + secHighest);
		System.out.println("Third highest: " + thiHighest);

	}

	public static void getTopThree2(int[] arr) {
		long starttime = System.nanoTime();
		int highest = 0;
		int highest2 = 0;
		int highest3 = 0;
		for (int i : arr) {
			if (i > highest) {
				highest3=highest2;
				highest2=highest;
				highest = i;
				
			}
			if (i > highest2 && i != highest) {
				highest3=highest2;
				highest2 = i;
			}
			if (i > highest3 && (i != highest2 && i != highest)) {
				highest3 = i;
			}
		}
		long endtime = System.nanoTime() - starttime;
		System.out.println(endtime);
		System.out.println("one: " + highest + " Two: " + highest2 + " Three: " + highest3);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList al = new ArrayList();
		//
		// // Testing iterator class
		// al.add("C");
		// al.add("A");
		// al.add("E");
		// al.add("B");
		// al.add("D");
		// al.add("F");
		// Iterator itr =al.iterator();
		// //iterate forwards
		// while(itr.hasNext()) {
		// Object element = itr.next();
		// System.out.print(element + " ");
		// }
		// ListIterator litr = al.listIterator();
		// //iterate through and change each
		// while(litr.hasNext()) {
		// Object element = litr.next();
		// litr.set(element + "+");
		// }
		//
		// itr = al.iterator();
		// //iterate again
		// while(itr.hasNext()) {
		// Object element = itr.next();
		// System.out.print(element + " ");
		// }
		// //iterate in reverse
		// while(litr.hasPrevious()) {
		// Object element = litr.previous();
		// System.out.print(element + " ");
		// }
		for (int i = 0; i < 1000; i++) {
			integerArray[i] = (int) (Math.random() * 1000);
		}
		showArray(integerArray);
		getTopThree2(integerArray);
		getNumbers(integerArray, 10,true);
		getNumbers(integerArray, 10,false);
		// sort(integerArray);
		showArray(integerArray);
		// Mns mns = new Mns(10);
		// mns.push(8);
		// System.out.println(mns.peek());
		// System.out.println(mns.pop());
		// mns.push("Mike");
		// mns.push("Mikemike");
		// mns.push("Mike");
		// mns.push("Mikemike");
		// System.out.println(mns.peek());
		// mns.viewStack();
		// mns.clear();
		// mns.viewStack();
		// System.out.println(mns.pop());
		// mns.push("Mike");
		// mns.push("Mikemike");
		// mns.push("Mike");
		// mns.push("Mikemike");
		// mns.drawStack();
		// showArray(integerArray);
		// max(integerArray);
		// min(integerArray);
		// mikeMap MM = new mikeMap(10);
		//// testing mikeMap
		// MM.add("mike", "is Awesome");
		// MM.add("notmike", "isnt Awesome");
		// MM.add("mike", "is Awesome");
		// MM.add("mike2", "is Awesome");
		// MM.add("notmike2", "isnt Awesome");
		// MM.add("mike3", "is Awesome");
		// MM.add("mike4", "is Awesome");
		// MM.add("notmike3", "isnt Awesome");
		// MM.add("mike5", "is Awesome");
		// MM.add("mike6", "is Awesome");
		// MM.add(7, "is Awesome");
		// MM.add("mike8", "is Awesome");
		// System.out.println(MM.findByKey("mike"));
		// System.out.println(MM.containsValue("isnt Awesome"));
		// MM.mapKey("mike", "is still awesome");
		// System.out.println(MM.findByKey("mike"));
		// MM.showMap();

	}

	public static void showArray(int[] integerArray2) {
		System.out.println();
		String arrayString = "[";
		for (int i = 0; i < integerArray2.length; i++) {
			arrayString = arrayString + integerArray2[i] + " ";
		}
		arrayString = arrayString + "]";
		System.out.println(arrayString);
	}

	public static int max(int[] integerArray2) {
		int highest = 0;

		for (int i = 0; i < 20; i++) {
			if (integerArray2[i] > highest)
				highest = integerArray2[i];
		}
		// System.out.println("Highest number= "+highest);
		return highest;
	}

	public static void min(int[] integerArray2) {
		int lowest = 10;

		for (int i = 0; i < 20; i++) {
			if (integerArray2[i] < lowest)
				lowest = integerArray2[i];
		}
		System.out.println("Lowest number= " + lowest);
	}

	public static int searchArray(int[] array, int term) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == term) {
				index = i;
			}
		}
		return index;
	}

	public static void sort2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		showArray(arr);
	}

	public static void sort(int[] array) {
		int lowest = 500;
		int lowestIndex = 50;
		int[] indexArray = new int[20];
		int[] outputArray = new int[20];
		for (int i = 0; i < 20; i++) {

			if (array[i] < lowest)
				lowest = array[i];
			for (int j = 0; j < 20; j++) {
				// System.out.println(searchArray(indexArray,j));
				if ((array[j] < lowest) && (searchArray(indexArray, j) < 0)) {
					lowest = array[j];
					lowestIndex = j;

				}
			}
			if (lowestIndex > 49)
				lowestIndex = 0;
			indexArray[i] = lowestIndex;
			outputArray[i] = lowest;
			lowest = 500;
			// lowestIndex=50;
		}
		showArray(outputArray);
	}

	@Override
	public void max() {
		// TODO Auto-generated method stub

	}

	@Override
	public void min() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}
}
