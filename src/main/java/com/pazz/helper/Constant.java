package com.pazz.helper;

/**
 * @author: 彭坚
 * @create: 2019/4/8 21:13
 * @description:
 */
public interface Constant {

    //分页的id后缀
    String SUFFIX_PAGE = "_PageHelper";
    //count查询的id后缀
    String SUFFIX_COUNT = SUFFIX_PAGE + "_Count";
    //第一个分页参数
    String PAGEPARAMETER_FIRST = "First" + SUFFIX_PAGE;
    //第二个分页参数
    String PAGEPARAMETER_SECOND = "Second" + SUFFIX_PAGE;

}
