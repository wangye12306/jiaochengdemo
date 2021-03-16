package cn.wykjc.jiaochengdemo.user.service;

import cn.wykjc.jiaochengdemo.user.dao.UserDao;
import cn.wykjc.jiaochengdemo.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wystart
 * @create 2021-03-14-10:58
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void  delById(Integer id) {
        userDao.delById(id);

    }

    @Override
    public void save(UserEntity userEntity) {
        userEntity.setCreatetime(new Date());
        userEntity.setStatus(1);
        userDao.save(userEntity);

    }
}
