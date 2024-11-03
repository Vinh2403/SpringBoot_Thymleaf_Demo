package vn.iotstar.thymleaf_Task.controllers;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminHomeController {
	
	@GetMapping("/home")
	public String index() {
		System.out.println("Current Locale: " + LocaleContextHolder.getLocale());
		return "admin/layout_admin";
	}
}
