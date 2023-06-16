package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media implements Comparable<Media>{
	
	private static int nbMedia = 0;
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	
	public Media() {
		// TODO Auto-generated constructor stub
	}


	Media(String title) {
		super();
		this.title = title;
		this.id = ++nbMedia;
	}

	public String getTitle() {
		return title;
	}


	public String getCategory() {
		return category;
	}


	public float getCost() {
		return cost;
	}
	
	public int getId() {
		return id;
	}


	Media(String title, String category) {
		super();
		this.title = title;
		this.category = category;
		this.id = ++nbMedia;
	}

	Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nbMedia;
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj) {
			return true;
		}
		if(!(obj instanceof Track)) {
			return false;
		}
		return ((Track)obj).getTitle() == this.getTitle();
	}
	
	@Override
	public String toString() {
		return this.getId() +". Media: " + this.title 
				+ " - "  + this.category 
				+ ": " + this.cost + "$";
	};
	
	@Override
    public int compareTo(Media other) {
        int titleComparison = this.getTitle().compareTo(other.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        } else {
            return Double.compare(this.getCost(), other.getCost());
        }
    }
	
    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }

    public void play() {
        System.out.println("Playing media");
    }

}

