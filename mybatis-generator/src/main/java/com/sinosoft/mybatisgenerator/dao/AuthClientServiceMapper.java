package com.sinosoft.mybatisgenerator.dao;

import com.sinosoft.mybatisgenerator.entity.AuthClientService;
import java.util.List;

public interface AuthClientServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthClientService record);

    AuthClientService selectByPrimaryKey(Integer id);

    List<AuthClientService> selectAll();

    int updateByPrimaryKey(AuthClientService record);
}