package com.pazz.service;

import com.pazz.vo.PersonVo;

import java.util.List;

public interface IPersonService<T> {

    List<PersonVo> selectByParam(PersonVo param);

    void updateByParam(int pid, String name);

}
