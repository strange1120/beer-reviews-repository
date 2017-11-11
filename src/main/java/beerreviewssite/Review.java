package beerreviewssite;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;
	private String beerName;
	private String beerReview;

	@ManyToOne
	private Style style;

	@ManyToMany
	private Set<Brewery> breweries;

	protected Review() {

	}

	public Long getId() {
		return id;
	}

	public Style getStyle() {
		return style;
	}

	public String getBeerName() {
		return beerName;
	}

	public String getBeerReview() {
		return beerReview;
	}

	public Set<Brewery> getBreweries() {
		return breweries;
	}

	public Review(String beerName, String beerReview, Style style, Brewery... brewery) {
		this.beerName = beerName;
		this.beerReview = beerReview;
		this.style = style;
		this.breweries = new HashSet<Brewery>(Arrays.asList(brewery));
	}

}
