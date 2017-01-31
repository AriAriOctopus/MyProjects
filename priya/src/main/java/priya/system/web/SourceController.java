package priya.system.web;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//websites have multiple recipes
// need a website id in the recipe table
// websites - name, url, average rating of recipes, number of recipes
// preferred brand

// start adding this to github

// add tests, then move to TDD

// add build automation and jenkins


@RestController
@RequestMapping("source")
public class SourceController {	

	
	private Pageable createPageRequest() {
		return new PageRequest(0, 10, Sort.Direction.ASC, "name");
	}
	
}
