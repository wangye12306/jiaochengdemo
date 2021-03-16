package cn.wykjc.jiaochengdemo.user.service;

import cn.wykjc.jiaochengdemo.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * @author wystart
 * @create 2021-03-14-10:58
 */
public interface UserService {
    List<UserEntity> getAll(Map map);

    void delById(Integer id);
    public void save(UserEntity userEntity);
}
