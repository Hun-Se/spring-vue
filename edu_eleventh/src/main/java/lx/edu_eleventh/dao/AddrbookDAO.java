package lx.edu_eleventh.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lx.edu_eleventh.vo.AddrbookVO;

@Component
public class AddrbookDAO {
	
	@Autowired
	SqlSession session;
	
	public List<AddrbookVO> getListAddrbook() {
		return session.selectList("getListAddrbook");
	}
	
	public void createAddrBook(AddrbookVO vo) {
		session.insert("createAddrBook", vo);
	}

	public AddrbookVO getAddrbookById(int abId) {
		return session.selectOne("getAddrbookById", abId);
	}

	public int deleteAddrbookById(int abId) {
		return session.delete("deleteAddrbookById", abId);
	}
}
