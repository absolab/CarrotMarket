package mul.camp.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mul.camp.a.dao.UserDao;
import mul.camp.a.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao;

	@Override
	public boolean login(UserDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean register(UserDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIdDup(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserInfo(UserDto dto) {
		int count = dao.upsdateUser(dto);
		return count > 0 ? true:false;
	}

	@Override
	public UserDto userInfo(int uid) {
		UserDto dto = dao.getUser(uid);
		return dto;
	}

	@Override
	public boolean deleteAccount(int uid) {
		
		return false;
	}

	@Override
	public UserDto[] userList() {
		// TODO Auto-generated method stub
		return null;
	}
    
}