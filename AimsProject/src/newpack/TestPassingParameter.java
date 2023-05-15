package newpack;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
	
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {		
		String title = dvd1.getTitle();
		String category = dvd1.getCategory();
		String director = dvd1.getDirectory();
		int length = dvd1.getLength();
		float cost = dvd1.getCost();
		
		dvd2.setDvD(title, category, director, length, cost);
		dvd1.setDvD(dvd2.getTitle(), dvd2.getCategory(), dvd2.getDirectory(),dvd2.getLength(),dvd2.getCost() );
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
	dvd.setTitle(title);
	dvd = new DigitalVideoDisc (oldTitle);

		}
	
public static void main(String[] args) {


DigitalVideoDisc jungleDVD = new DigitalVideoDisc ("Jungle"); DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc ("Cinderella");
swap(jungleDVD, cinderellaDVD);
System.out.println("jungle dvd title: " + jungleDVD.getTitle()); System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
changeTitle(jungleDVD, cinderellaDVD.getTitle());
System.out.println("jungle dvd title: " + jungleDVD.getTitle());

}


}

