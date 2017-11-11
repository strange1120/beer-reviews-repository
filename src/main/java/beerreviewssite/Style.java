package beerreviewssite;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Style {

	@Id
	@GeneratedValue
	private Long id;
	private String style;

	public Long getId() {
		return id;
	}

	public String getStyle() {
		return style;
	}

	@OneToMany(mappedBy = "style")
	private Set<Review> reviewList;

	public Set<Review> getReviewList() {
		return reviewList;
	}

	protected Style() {

	}

	public Style(String style) {
		this.style = style;
	}
}
