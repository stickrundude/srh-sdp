package de.srh.library.mapper.users;

import de.srh.library.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUserByEmail(String email);

    int insertUser(User user);

    User getUserById(Long userId);
    Long getIdByEmail(String email);
    void updateUserPassword(@Param("password") String password, @Param("email") String email);
    int updateUserInfo(User user);
}