package domain;

public class Offer {
	
	private String year;
	
	private int classSize;
	
	private int availablePlaces;
	
	private int numOfEnrolStud;
	
	public Offer() {}

    public Offer(String year, int classSize, int availablePlaces, int numOfEnrolStud) {
        this.year = year;
        this.classSize = classSize;
        this.availablePlaces = availablePlaces;
        this.numOfEnrolStud = numOfEnrolStud;
    }
}
