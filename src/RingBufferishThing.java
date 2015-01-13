/*
 * Not sure if this does everything that RingBuffers are supposed
 * to do. (Hence 'RingBufferish'). 
 * 
 */
public class RingBufferishThing {
	public final int[] elements; //the backing array
	int start; //the equivalent of index 0 in a traditional array
	int length; //the current number of elements in the buffer
	
	public RingBufferishThing(int size) {
		elements = new int[size];
	}
	
	public void add(int value) {
		int writeIndex = (start + length) % elements.length;
//		if (writeIndex >= elements.length) {
//			writeIndex -= elements.length;
//		}
		elements[writeIndex] = value;
		
		if (length < elements.length) {
			length++;
		} else {
			start = (start + 1) % elements.length;
		}
	}
	
	public int get(int index) {
		if (length <= index) { //Get mad
			System.out.println("what are you trying to do anyway? we don't have that many elements!"); 
			System.exit(12345);
		}
		int readIndex = (start + index) % elements.length;
		return elements[readIndex];
	}
	
	public int currentLength() { return length; }

	
}
