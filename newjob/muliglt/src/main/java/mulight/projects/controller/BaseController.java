package mulight.projects.controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.ExceptionHandler;

public abstract class BaseController {
	private final static Logger logger = LoggerFactory.getLogger(BaseController.class);
	 @ExceptionHandler(Throwable.class)
	 public ResponseEntity<Map<String, Object>> controllerExceptionHandler(HttpServletRequest req, Throwable t) {
		    logger.error("controller get exception", t);
			Map<String, Object> totalResult = new HashMap<String, Object>();
			totalResult.put("resultCode", 500);
			totalResult.put("errMsg", t.getMessage());
			totalResult.put("body", "");
			return new ResponseEntity<Map<String, Object>>(totalResult,HttpStatus.OK);
	 }
	protected ResponseEntity<Map<String, Object>> generateResult(Map<String, Object> bodyResult) {
		Map<String, Object> totalResult = new HashMap<String, Object>();
		totalResult.put("resultCode", 200);
		totalResult.put("errMsg", "");
		totalResult.put("body", bodyResult);
		return new ResponseEntity<Map<String, Object>>(totalResult, HttpStatus.OK);
	}
	
	protected ResponseEntity<Map<String, Object>> generateResult2(Map<String, Object> totalResult) {
		totalResult.put("resultCode", 200);
		totalResult.put("errMsg", "");
		return new ResponseEntity<Map<String, Object>>(totalResult, HttpStatus.OK);
	}
}
