package com.example.dianping_learn_1.service.impl;

import com.example.dianping_learn_1.dal.UserModelDAO;
import com.example.dianping_learn_1.model.UserModel;
import com.example.dianping_learn_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserModelDAO userModelDAO;

    @Override
    public UserModel getUser(Integer id) {
        return userModelDAO.selectByPrimaryKey(id);
    }
}
