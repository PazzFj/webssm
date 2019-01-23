package com.pazz.dao;

import com.pazz.entity.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Peng Jian
 * @create: 2018/10/16 16:18
 * @description:
 */
@Repository
public interface ITestDao {

    List<Test> getTests();

}
