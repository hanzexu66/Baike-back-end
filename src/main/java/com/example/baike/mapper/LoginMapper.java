package com.example.baike.mapper;

import com.example.baike.model.BKUser;
import com.example.baike.constant.state.UserState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LoginMapper {
    BKUser selectByAccount(@Param("account") String account);
    UserState selectStateByUID(@Param("uID") Integer uID);
}
