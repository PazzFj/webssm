package com.pazz.service;

import com.pazz.vo.PersonVo;

import java.util.List;

public interface IPersonService {

    List<PersonVo> selectByParam(PersonVo param);

    void updateByParam(int pid, String name);

}
