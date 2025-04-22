package pack;

public class Box {

	int width;
	public Box(int length) {
		super();
		this.length = length;
		this.width = length;
		this.height = length;
	}

	int length;
	int height;
	float w;
	float l;
	float h;
	public Box(int width, int length, int height, float w, float l, float h) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
		this.w = w;
		this.l = l;
		this.h = h;
	}

	public Box(int width, int length, int height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}

   public void Volume()
   {
	   System.out.println(length*width*height);
   }
 
}

