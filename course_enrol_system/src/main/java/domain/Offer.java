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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getClassSize() {
		return classSize;
	}

	public void setClassSize(int classSize) {
		this.classSize = classSize;
	}

	public int getAvailablePlaces() {
		return availablePlaces;
	}

	public void setAvailablePlaces(int availablePlaces) {
		this.availablePlaces = availablePlaces;
	}

	public int getNumOfEnrolStud() {
		return numOfEnrolStud;
	}

	public void setNumOfEnrolStud(int numOfEnrolStud) {
		this.numOfEnrolStud = numOfEnrolStud;
	}
}
