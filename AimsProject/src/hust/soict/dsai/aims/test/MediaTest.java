package hust.soict.dsai.aims.test;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;

public class MediaTest {

	public static void main(String[] args) {
		List<Media> media = new ArrayList<Media>();
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book(1, "Harry Potter", "Science Fiction", 9.9f);
        CompactDisc cd = new CompactDisc(10, "Greatest Hits", "Rock", 11f, "Journey", "Micheal Jackson");

        media.add(cd);
        media.add(dvd);
        media.add(book);

        for (Media m : media) {
            System.out.println(m.toString());
        }

	}

}