package newpack;


public class DigitalVideoDisc {
	

private String title;
private String category;
private String directory;
private int length;
private float cost;
private int id;
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
public String getDirectory() {
	return directory;
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

public DigitalVideoDisc(String title, String category, String directory, float cost) {
	this.setId();
	this.title = title;
	this.category = category;
	this.directory = directory;
	this.cost = cost;
}

public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
	this.setId();
	this.title = title;
	this.category = category;
	this.directory = directory;
	this.length = length;
	this.cost = cost;
}

public void setTitle(String title) {
	this.title = title;
}
public void setCategory(String category) {
	this.category = category;
}
public void setDirectory(String directory) {
	this.directory = directory;
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
	setDirectory(directory);
	setLength(length);
	setCost(cost);
}

public String toString() {
	return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirectory() + " - " + this.getLength() + " : " + this.getCost() + " $";
}


}

