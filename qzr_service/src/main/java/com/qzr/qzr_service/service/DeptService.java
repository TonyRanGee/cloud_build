package com.qzr.qzr_service.service;

import com.qzr.qzr_service.dao.DeptDao;
import com.qzr.qzr_service.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    DeptDao deptDao;

    public List<Dept> deptList() {
        return deptDao.deptList();
    }
}
