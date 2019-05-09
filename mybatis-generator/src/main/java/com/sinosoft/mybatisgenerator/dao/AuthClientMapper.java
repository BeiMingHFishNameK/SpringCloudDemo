package com.sinosoft.mybatisgenerator.dao;

import com.sinosoft.mybatisgenerator.entity.AuthClient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AuthClientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthClient record);

    AuthClient selectByPrimaryKey(Integer id);

    List<AuthClient> selectAll();

    int updateByPrimaryKey(AuthClient record);
}