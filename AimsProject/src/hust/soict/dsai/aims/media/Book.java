package hust.soict.dsai.aims.media;
import java.util.*;  
public class Book extends Media {
private List<String> authors =new ArrayList<String>();  

public List<String> getAuthors() {
	return authors;
}
public void setAuthors(List<String> authors) {
	this.authors = authors;
}



public Book(){
	
}

public void addAuthors(String authorName) {
	if( authors.contains(authorName)) {
		return ;
	}
	else {authors.add(authorName);}
}

public void removeAuthors(String authorName) {
	if( authors.contains(authorName)) {
		authors.remove(authorName);
	}
	else {return;}
}


}
