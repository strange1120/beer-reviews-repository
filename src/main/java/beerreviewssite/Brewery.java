package beerreviewssite;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Brewery {

	@Id
	@GeneratedValue
	private Long id;

	private String breweryName;

	@ManyToMany(mappedBy = "breweries")
	private Set<Review> reviewList;

	public Long getId() {
		return id;
	}

	public String getBreweryName() {
		return breweryName;
	}

	public Set<Review> getReviewList() {
		return reviewList;
	}

	protected Brewery() {

	}

	public Brewery(String breweryName) {
		this.breweryName = breweryName;
	}

}
