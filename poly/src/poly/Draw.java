package poly;

public abstract class Draw {

	abstract public void draw();
	public void doDrawing(Draw x){
		x.draw();
	}
	abstract public void add(int a, int b);
}
