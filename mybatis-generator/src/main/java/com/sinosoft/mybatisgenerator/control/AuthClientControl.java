package com.sinosoft.mybatisgenerator.control;

import com.sinosoft.mybatisgenerator.entity.AuthClient;
import com.sinosoft.mybatisgenerator.service.AuthClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthClientControl {
    @Autowired
    private AuthClientServiceImpl mapper;

    @RequestMapping("/getAuthClient")
    public String getAuthClient(@RequestParam(value = "id") Integer id){
        System.out.println("===》》id："+id);
        AuthClient authClient = mapper.selectByPrimaryKey(id);

        return authClient.getSecret();
    }
}
