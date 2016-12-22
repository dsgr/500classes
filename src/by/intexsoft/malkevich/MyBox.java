package by.intexsoft.malkevich;

public class MyBox {

	private int width;
	private int height;
	private int depth;
	private String color;
	private boolean isFull;
	private boolean isOpened;

	MyBox() {
		width = 10;
		height = 10;
		depth = 10;
		color = "white";
		isFull = false;
		isOpened = false;
	}

	MyBox(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
		isFull = false;
		isOpened = false;
	}

	MyBox(int a) {
		width = a;
		height = a;
		depth = a;
		isFull = false;
		isOpened = false;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public boolean isOpened() {
		return isOpened;
	}

	public void setOpened(boolean isOpened) {
		this.isOpened = isOpened;
	}

	public void printWidth() {
		System.out.println("Width of the box is " + width);
	}

	public void printHeight() {
		System.out.println("Height of the box is " + height);
	}

	public void printDepth() {
		System.out.println("Depth of the box is " + depth);
	}

	public void printColor() {
		System.out.println("Color of the box is " + color);
	}

	public void printIsOpened() {
		System.out.println("Box is opened: " + isOpened);
	}

	public void printIsFull() {
		System.out.println("Box is full: " + isFull);
	}

	public int getWidthAndHeightSumm() {
		return width+height;		
	}
	
	public int getWidthAndDepthtSumm() {
		return width+depth;		
	}

}
