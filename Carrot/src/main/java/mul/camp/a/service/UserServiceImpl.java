package mul.camp.a.service;

import org.springframework.beans.factory.annotation.Autowired;

import mul.camp.a.dao.UserDao;
import mul.camp.a.dto.UserDto;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDto userInfo(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAccount(int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDto[] userList() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
