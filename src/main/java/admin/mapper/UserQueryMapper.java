package admin.mapper;

import admin.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("userQueryMapper")
public interface UserQueryMapper {
    @Select("SELECT * FROM tb_admin_user WHERE id = #{id}")
    public User getUser(int id) throws Exception;
}
