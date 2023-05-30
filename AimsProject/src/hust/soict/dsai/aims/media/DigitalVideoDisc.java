package hust.soict.dsai.aims.media;



public class DigitalVideoDisc extends Disc implements Playable{
	
private static int nbDigitalVideoDiscs = 0;
public int getId() {
	return id;
}
public void setId() {
	this.id = nbDigitalVideoDiscs;
	nbDigitalVideoDiscs =nbDigitalVideoDiscs + 1 ;
}
public String getTitle() {
	return title;
}
public String getCategory() {
	return category;
}
public String getDirector() {
	return director;
}
public int getLength() {
	return length;
}
public float getCost() {
	return cost;
}



public DigitalVideoDisc(String title) {
	this.setId();
	this.title = title;
}
public DigitalVideoDisc(String title, String category, float cost) {
	this.setId();
	this.title = title;
	this.category = category;
	this.cost = cost;
}

public DigitalVideoDisc(String title, String category, String director, float cost) {
	this.setId();
	this.title = title;
	this.category = category;
	this.director = director;
	this.cost = cost;
}

public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	this.setId();
	this.title = title;
	this.category = category;
	this.director = director;
	this.length = length;
	this.cost = cost;
}

public void setTitle(String title) {
	this.title = title;
}
public void setCategory(String category) {
	this.category = category;
}
public void setDirector(String director) {
	this.director = director;
}
public void setLength(int length) {
	this.length = length;
}
public void setCost(float cost) {
	this.cost = cost;
}

public void setDvD(String title,String category,String directory, int length ,float cost ) {
	setTitle(title);
	setCategory(category);
	setDirector(directory);
	setLength(length);
	setCost(cost);
}

public String toString() {
	return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
}

public boolean isMatch(String title) {
	return title.equals(this.getTitle()) ;
}

public void play() {
	System.out.println("Playing DVD: " + this.getTitle());
	System.out.println("DVD length: " + this.getLength());
}


}
