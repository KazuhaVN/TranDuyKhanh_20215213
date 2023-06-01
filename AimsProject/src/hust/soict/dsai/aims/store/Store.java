package hust.soict.dsai.aims.store;
import java.util.*; 
import hust.soict.dsai.aims.media.Media;

public class Store {
	private int capacity;
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public Store(int capacity) {
        this.capacity = capacity;
    }
    
    public void print() {
		System.out.println("Items available in store:");
		for (int i=1; i<=itemsInStore.size(); i++) {
			System.out.println(i + ". " + itemsInStore.get(i-1).toString());
		}
		System.out.println("");
	}
    
    public void addMedia(Media media) {
		if (itemsInStore.size() < capacity) {
			itemsInStore.add(media);
			System.out.println("added");
		}
		else {
			System.out.println("full store");
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsInStore.isEmpty()) {
			System.out.println("empty store");
		}
		else if (!itemsInStore.contains(media)) {
			System.out.println("Media is not found ");
		}
		else {
			itemsInStore.remove(media);
			System.out.println("removed");
		}
	}
	public Media searchByTitle(String title) {
		for (Media media : itemsInStore) {
			if (media.getTitle().equals(title))
				return media;
		}
		return null;
	}
}
	