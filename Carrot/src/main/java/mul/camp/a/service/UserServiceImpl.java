package mul.camp.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mul.camp.a.dao.UserDao;
import mul.camp.a.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	UserDao dao;
	
	@Override
	public List<UserDto> getTotal(String total) {
		return dao.getTotal(total);
	}
	
	public boolean deleteUser(int uid) {
		int n = dao.deleteUser(uid);
		return n>0 ? true:false;
	}
	
	// uid(유저)에 해당하는 유저 정보 반환 노승현 작성
    public UserDto getUser(int uid) {
    	return dao.getUser(uid);
    }
    
    // 입력받은 내용으로 DB에 수정 노승현 작성
    public boolean updateUser(UserDto dto) {
    	int n = dao.updateUser(dto);
    	return n>0 ? true:false;
    	
    }
}
