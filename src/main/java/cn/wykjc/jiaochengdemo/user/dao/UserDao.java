package cn.wykjc.jiaochengdemo.user.dao;

import cn.wykjc.jiaochengdemo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author wystart
 * @create 2021-03-14-11:01
 */
@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content")Map map);

    void  delById(Integer id);
    public void save(UserEntity userEntity);
}
