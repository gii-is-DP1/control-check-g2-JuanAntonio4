package org.springframework.samples.petclinic.feeding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/feeding")
public class FeedingController {
	
	@Autowired
	private FeedingService feedingService;
	
	private static final String VIEWS_FEEDING_CREATE_OR_UPDATE_FORM= "feeding/createOrUpdateFeedingForm";
	
	@GetMapping(path="/create")
    public String initCreationForm(ModelMap modelMap) {
		String view=VIEWS_FEEDING_CREATE_OR_UPDATE_FORM;
		modelMap.addAttribute("feeding",new Feeding());
		modelMap.addAttribute("feedingType", feedingService.finAllFeedingTypes());
		return view;
	}
}
