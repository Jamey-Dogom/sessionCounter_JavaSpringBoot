package com.jd.sessioncount.counter;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	// places session as an argument for the methods that need it
	@Autowired
	private HttpSession session;

	@RequestMapping("/")
	public String index() {
		Integer count = (Integer) session.getAttribute("count");
		if (count == null) {
			count = 0;
			count++;
			session.setAttribute("count", count);
		} else {
			count++;
			session.setAttribute("count", count);
		}

		return "home.jsp";
	}

	@RequestMapping("/counter")
	public String count(Model model) {
		Integer count = (Integer) session.getAttribute("count");
		model.addAttribute("count", count);
		return "counter.jsp";
	}

	@RequestMapping("/twos")
	public String twos(Model model) {
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			count = 0;
			count += 2;
			session.setAttribute("count",  count);
		} else {
			count += 2;
			session.setAttribute("count", count);
		}
		
		return "twos.jsp";
	}

	@RequestMapping("/reset")
	public String reset(Model model, HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		session.setAttribute("count", 0);
		model.addAttribute("count", count);
		return "home.jsp";
	}
}
