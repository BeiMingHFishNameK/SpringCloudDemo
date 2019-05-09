package com.sinosoft.mybatisgenerator.service;

import com.sinosoft.mybatisgenerator.dao.AuthClientMapper;
import com.sinosoft.mybatisgenerator.entity.AuthClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthClientServiceImpl implements AuthClientService {

    @Autowired
    private AuthClientMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(AuthClient record) {
        return 0;
    }

    @Override
    public AuthClient selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AuthClient> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(AuthClient record) {
        return 0;
    }
}
