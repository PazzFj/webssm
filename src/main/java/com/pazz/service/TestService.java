package com.pazz.service;

import com.pazz.dao.ITestDao;
import com.pazz.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Peng Jian
 * @create: 2018/10/16 16:20
 * @description:
 */
@Service
public class TestService {

    @Autowired
    private ITestDao testDao;

    public List<Test> getTests(){
        return testDao.getTests();
    }

}
