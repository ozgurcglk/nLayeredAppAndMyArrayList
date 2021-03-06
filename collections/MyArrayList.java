package collections;

public class MyArrayList<T> {
	private int defaultSize = 2;
	private Object[] array;
	private int nextSize = 0;
	
	public boolean add(T newElement) {
		array = new Object[defaultSize];
		defaultSize++;
		if(nextSize >= array.length) {
			Object[] array2 = new Object[nextSize];
			array2 = array;
		}
		array[nextSize++] = newElement;
		return true;
	}
	
	public int size() {
		return nextSize;
	}
	
	public boolean contains(T element) {
		for (Object object : array) {
			if(object == element) {
				System.out.println("Contains the data entered");
				return true;
			}		
		}
		return false;
	} 
}
