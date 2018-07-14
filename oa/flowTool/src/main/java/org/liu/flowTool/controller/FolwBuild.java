package org.liu.flowTool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/build")
public class FolwBuild {
	
	@RequestMapping("buildView")
	public String buildView() {
		return "index";
	}
}
