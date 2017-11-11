package beerreviewssite;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeerPopulator implements CommandLineRunner {

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private StyleRepository styleRepo;

	@Resource
	private BreweryRepository breweryRepo;

	@Override
	public void run(String... args) throws Exception {
		Style ipa = new Style("IPA");
		styleRepo.save(ipa);
		Style stout = new Style("Stout");
		styleRepo.save(stout);
		Style sour = new Style("Sour");
		styleRepo.save(sour);
		Style saison = new Style("Saison");
		styleRepo.save(saison);
		Brewery platform = new Brewery("Platform");
		breweryRepo.save(platform);
		Brewery landGrant = new Brewery("Land Grant");
		breweryRepo.save(landGrant);
		Brewery stillwater = new Brewery("Stillwater Artisanal");
		breweryRepo.save(stillwater);
		Brewery twoRoads = new Brewery("Two Road's");
		breweryRepo.save(twoRoads);
		Brewery jackieOs = new Brewery("Jackie O's");
		breweryRepo.save(jackieOs);
		Brewery evilTwin = new Brewery("Evil Twin");
		breweryRepo.save(evilTwin);
		Review review1 = new Review("Darn Putin", " ", stout, platform);
		reviewRepo.save(review1);
		Review review2 = new Review("You're in the Jungle Baby", " ", stout, jackieOs, evilTwin);
		reviewRepo.save(review2);
		// Review review3 = new Review("Ground Loop", "", sour, saison, stillwater,
		// twoRoads);
		// reviewRepo.save(review3);

	}
}
