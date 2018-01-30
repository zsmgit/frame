package cn.su.mapper;

import cn.su.po.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    public User getUserById(String id);
}
