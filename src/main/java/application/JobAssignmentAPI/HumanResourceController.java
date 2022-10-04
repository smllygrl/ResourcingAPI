package application.JobAssignmentAPI;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resources")
public class HumanResourceController {
	@Autowired
	private HumanResourceService humanResourceService;
	
	@GetMapping
	public List<HumanResource> getHumanResources() {
		return humanResourceService.all();
	}
	
	@PostMapping()
	@ResponseStatus(value = HttpStatus.CREATED)
	public void saveHumanResource(@Valid @RequestBody HumanResourceDTO humanResource) {
		humanResourceService.create(humanResource);
	}

}
