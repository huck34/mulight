package mulight.projects.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mulight.projects.service.WatchService;

@RestController
@RequestMapping(path = "/watch")
public class WatchController extends BaseController {
	@Autowired
	WatchService watchService;
	
	@RequestMapping(value="/calculateprice", method = RequestMethod.GET)
	ResponseEntity<Map<String, Object>> calculatePrice(@RequestParam(required = true, value = "watchlists") List<String> watchlists,HttpServletRequest request) throws Exception {		
		HashMap<String,Object> hm=new HashMap<String,Object>();
		hm.put("totalprice", watchService.calculatePrice(watchlists));
		return generateResult(hm);
	}
}
