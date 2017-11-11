package beerreviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BeerController {

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	StyleRepository styleRepo;

	@Resource
	BreweryRepository breweryRepo;

	@RequestMapping("/styles")
	public String showAllStyles(Model model) {
		model.addAttribute("styles", styleRepo.findAll());
		return "styles";
	}

	@RequestMapping("/breweries")
	public String showAllBreweries(Model model) {
		model.addAttribute("breweries", breweryRepo.findAll());
		return "breweries";
	}

	@RequestMapping("/reviews")
	public String showAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("/style")
	public String showOneStyle(@RequestParam Long id, Model model) {
		model.addAttribute("style", styleRepo.findOne(id));
		return "style";

	}

	@RequestMapping("/brewery")
	public String showOneBrewery(@RequestParam Long id, Model model) {
		model.addAttribute("brewery", breweryRepo.findOne(id));
		return "brewery";

	}

	@RequestMapping("/review")
	public String showOneBook(@RequestParam Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}

	@RequestMapping("/")
	public String showAllClasses(Model model) {
		model.addAttribute("breweries", breweryRepo.findAll());
		model.addAttribute("styles", styleRepo.findAll());
		model.addAttribute("reviews", reviewRepo.findAll());
		return "splashPage";
	}
}
