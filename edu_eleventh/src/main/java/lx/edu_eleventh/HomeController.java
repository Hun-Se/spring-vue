package lx.edu_eleventh;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lx.edu_eleventh.dao.AddrbookDAO;
import lx.edu_eleventh.vo.AddrbookVO;

@Controller
public class HomeController {

  @RequestMapping("/home.do")
  public String home() {
	  System.out.println("home.do!");
    return "home";
  }

  @RequestMapping("/login_form.do")
  public String getLoginForm() {
    return "addrbook/login_form";
  }
  
  @RequestMapping("/login.do")
  public String login(String userId, String password, HttpSession session) throws IOException {
	  String page = "login_form.do";
	  if(userId.equals(password)) {
		  session.setAttribute("userId", userId);
		  page = "list.do";
	  }
	  
	  return "redirect:/" + page;
  }
  
  @RequestMapping("/logout.do")
  public String login(HttpSession session) {

	  session.setAttribute("userId", null);
	  return "redirect:/login_form.do";
  }
  
  

}
