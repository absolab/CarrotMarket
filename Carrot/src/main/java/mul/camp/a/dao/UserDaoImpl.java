package mul.camp.a.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import mul.camp.a.dto.UserDto;

public class UserDaoImpl implements UserDao {

    // 네임스페이스
    private final static String NAMESPACE = "User.";
    private final static String NAMESPACE_ADD_USER = NAMESPACE + "addUser";
    private final static String NAMESPACE_UPDATE_USER = NAMESPACE + "updateUser";
    private final static String NAMESPACE_DELETE_USER = NAMESPACE + "deleteUser";
    private final static String NAMESPACE_GET_USER = NAMESPACE + "getUser";
    private final static String NAMESPACE_GET_USER_ID = NAMESPACE + "getUserId";
    private final static String NAMESPACE_GET_USER_LIST = NAMESPACE + "getUserList";

    @Autowired
    SqlSession session;

    @Override
    public int addUser(UserDto dto) {
        
        return session.insert(NAMESPACE_ADD_USER, dto);
    }

    @Override
    public int updateUser(UserDto dto) {
        
        return session.update(NAMESPACE_UPDATE_USER, dto);
    }

    @Override
    public int deleteUser(int uid) {
        
        return session.delete(NAMESPACE_DELETE_USER, uid);
    }

    @Override
    public UserDto getUser(int uid) {
        
        return session.selectOne(NAMESPACE_GET_USER, uid);
    }

    @Override
    public UserDto getUser(String id) {
        
        return session.selectOne(NAMESPACE_GET_USER_ID, id);
    }

    @Override
    public List<UserDto> getUserList() {
        
        return session.selectList(NAMESPACE_GET_USER_LIST);
    }
    
}
