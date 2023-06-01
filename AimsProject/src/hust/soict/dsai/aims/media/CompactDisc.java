package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
private String artist;
private List<Track> tracks =new ArrayList<Track>();  

public String getArtist() {
	return artist;
}

public int getTotalLength() {
	int total =0;
	for (Track track :tracks) {
		total = total + track.getLength();
	}
	return total;
}

public void addTrack(Track a) {
	if (!tracks.contains(a)) {
		tracks.add(a);
		System.out.println(a.getTitle() + " has been added");
	}
	else {
		System.out.println("Can not add");
	}
}

public void removeTrack(Track a) {
	if (tracks.contains(a)) {
		tracks.remove(a);
		System.out.println(a.getTitle() + " has been removed");
	}
	else {
		System.out.println("Can not remove");
	}
}

public CompactDisc(int id, String title, String category, float cost, String director, String artist, ArrayList<Track> tracks) {
	super(id, title, category, cost, director);
	this.artist = artist;
	this.tracks = tracks;
}

public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
	super(id, title, category, cost, director);
	this.artist = artist;
}

	
	public void play() {
		for(Track track: tracks) {
			track.play();
		}
	}
	
	public String toString() {
		return "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getArtist() + " - "+ this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
	}
}
