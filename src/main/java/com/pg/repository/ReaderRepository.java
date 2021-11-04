package com.pg.repository;

import com.pg.entity.Reader;

public interface ReaderRepository {
    public Reader login(String username,String password);
}
