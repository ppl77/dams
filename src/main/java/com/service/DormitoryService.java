package com.service;

import com.pojo.Dormitory;
import com.pojo.PageBean;

public interface DormitoryService {
    PageBean<Dormitory> selectByPageAndCondition(int currentPage, int pageSize, Dormitory dormitory);

    void add(Dormitory dormitory);

    void deleteByIds(int[] ids);

    void deleteById(int id);

    void update(Dormitory dormitory);
}