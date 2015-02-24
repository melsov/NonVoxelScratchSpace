import java.lang.reflect.Array;

/*
 * Not sure if this does everything that RingBuffers are supposed
 * to do. (Hence 'RingBufferish'). 
 * Writes 'T' type objects to a backing array
 * When the array is full, simply overwrites the oldest element 
 */
public class RingBufferishThing<T> {
	public final T[] elements; //the backing array
	int start; //the equivalent of index 0 in a traditional array
	int length; //the current number of elements in the buffer
	
	@SuppressWarnings("unchecked")
	public RingBufferishThing(Class<T> c, int size) {
		elements = (T[]) Array.newInstance(c, size); // new T[size];
	}
	
	public void add(T value) {
		// If length == elements.length, writeIndex
		// will end up being start,
		// otherwise it will end up being length
		elements[(start + length) % elements.length] = value;
		
		if (length < elements.length) {
			length++;
		} else {
			start = (start + 1) % elements.length;
		}
	}
	
	//this method imitates reading from a normal array: i.e. "someArray[index]" 
	public T get(int index) {
		if (length <= index) { 
			//We have a problem. Just get mad and die.
			System.out.println("what are you trying to do anyway? we don't have that many elements!"); 
			System.exit(1);
		}
		int readIndex = (start + index) % elements.length;
		return elements[readIndex];
	}
	
	public int currentLength() { return length; }
	
}
