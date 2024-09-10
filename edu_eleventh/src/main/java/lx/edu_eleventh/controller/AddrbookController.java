package lx.edu_eleventh.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lx.edu_eleventh.dao.AddrbookDAO;
import lx.edu_eleventh.vo.AddrbookVO;

@RestController
@CrossOrigin(origins = "*")
public class AddrbookController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	AddrbookDAO dao;
	

	@GetMapping("/list")
	public List<AddrbookVO> list(HttpServletRequest req) {
		System.out.println("list()");
		List<AddrbookVO> memberlist = dao.getListAddrbook();
		//result.setViewName("");
		return memberlist;
	}
	
	
}
