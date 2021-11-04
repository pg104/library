package com.pg.service.impl;

import com.pg.repository.AdminRepository;
import com.pg.repository.ReaderRepository;
import com.pg.repository.impl.AdminRepositoryImpl;
import com.pg.repository.impl.ReaderRepositoryImpl;
import com.pg.service.LoginService;

public class LoginServiceImpl implements LoginService {

    private ReaderRepository readerRepository = new ReaderRepositoryImpl();
    private AdminRepository adminRepository = new AdminRepositoryImpl();
    @Override
    public Object login(String username, String password,String type) {
        Object object = null;
        switch (type){
            case "reader":
                object = readerRepository.login(username,password);
                break;
            case "admin":
                object = adminRepository.login(username,password);
                break;
        }
        return object;
    }
}
