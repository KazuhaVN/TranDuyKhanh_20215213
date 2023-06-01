package hust.soict.dsai.aims.media;

public class Track implements Playable{

private String title;
private int length;

public String getTitle() {
	return title;
}
public int getLength() {
	return length;
}

public Track(String title, int length) {
	super();
	this.title = title;
	this.length = length;
}
	
public void play() {
	System.out.println("Playing DVD: " + this.getTitle());
	System.out.println("DVD length: " + this.getLength());
}

public boolean equals(Object o) {
    if (o == null || !(o instanceof Track)) {
        return false;
    }
    Track track = (Track) o;
    return title.equals(track.title) && (length == track.length);
}

}
