package com.cps.client.mapper;

import com.cps.client.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Integer save(User user);

}
