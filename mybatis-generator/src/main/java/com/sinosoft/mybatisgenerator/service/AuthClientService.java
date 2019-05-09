package com.sinosoft.mybatisgenerator.service;

import com.sinosoft.mybatisgenerator.entity.AuthClient;

import java.util.List;

public interface AuthClientService {

    int deleteByPrimaryKey(Integer id);

    int insert(AuthClient record);

    AuthClient selectByPrimaryKey(Integer id);

    List<AuthClient> selectAll();

    int updateByPrimaryKey(AuthClient record);

}
