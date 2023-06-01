package hust.soict.dsai.aims.media;

public class Disc extends Media{

protected int length;
protected String director;
public int getLength() {
	return length;
}


public Disc(int id, String title) {
	super(id, title);
}

public Disc(int id, String title, String category, float cost) {
	super(id, title, category, cost);
}

public Disc(int id, String title, String category, float cost, String director) {
	super(id, title, category, cost);
	this.director = director;
}

public Disc(int id, String title, String category, float cost, String director, int length) {
	super(id, title, category, cost);
	this.length = length;
	this.director = director;
}

public String getDirector() {
	return director;
}
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Disc - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
	}

}
