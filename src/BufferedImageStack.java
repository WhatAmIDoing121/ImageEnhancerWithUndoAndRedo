import java.awt.image.BufferedImage;

public class BufferedImageStack {
	
	BufferedImage[] array;
	
	public BufferedImageStack(int size) {
		array = new BufferedImage[size];
	}
	
	public BufferedImageStack() {
		array = new BufferedImage[2];
	}
	
	public BufferedImage get(int index) {
		return array[index];
	}
	
	public void push(BufferedImage someBufferedImage) {
		int i = 0;
		while (array[i] != null) {
			i++;
		}
		array[i] = someBufferedImage;
	}
	
	public BufferedImage pop() {
		if (isEmpty()) throw new IllegalStateException("List is empty");
		BufferedImage temp = array[getSize() - 1];
		array[getSize() - 1] = null;
		return temp;
	}
	
	public int getSize() {
		int i = 0;
		while (i < array.length) {
			if (array[i] != null) {
				i++;
			} else break;
		}
		return i;
	}
	
	public Boolean isEmpty() {
		if (getSize() == 0) return true;
		return false;
	}
	
	public int getArraySize() {
		return array.length;
	}
}
