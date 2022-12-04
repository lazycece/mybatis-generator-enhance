package dao;

import po.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User row);

    int insertSelective(User row);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User row);

    int updateByPrimaryKey(User row);
}