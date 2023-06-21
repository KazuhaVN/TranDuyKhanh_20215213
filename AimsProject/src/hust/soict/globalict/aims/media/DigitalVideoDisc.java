package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost,length,director);
	}
	
	public DigitalVideoDisc(String oldTitle) {
		this.setTitle(oldTitle);
	}

	public DigitalVideoDisc(String title, String category, float f) {
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(f);
	}

	public String toString() {
		return "ID:"+this.getId()+"-DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
	}

	public void play() throws PlayerException { 
		if(this.getLength()>0) {

		System.out.println("Playing DVD: " + this.getTitle()); 

		System.out.println("DVD length: " + this.getLength()); 
		}
		else throw new PlayerException("ERROR: Track length is non-positive!");
	}

	public void setDvD(String title, String category, String director, int length, float cost) {
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
        this.setCost(cost);		
	} 

}
