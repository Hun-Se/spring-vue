package lx.edu_eleventh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lx.edu_eleventh.dao.AddrbookDAO;
import lx.edu_eleventh.vo.AddrbookVO;

@RestController
public class AddrbookRestController {
	
	@Autowired
	AddrbookDAO dao;
	
	// abId를 전달받아서 해당 방명록을 json data로 리턴함
	@RequestMapping(value = "/addrbook/{abId}", produces = "application/json")
	public @ResponseBody AddrbookVO getById(@PathVariable int abId) {
		// 방명록 데이터를 가져오는 메서드를 실행
		AddrbookVO vo = dao.getAddrbookById(abId);
		System.out.println(vo);
		return vo;
	} 
}
