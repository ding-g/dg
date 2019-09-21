package com.dg.springcloud.service.impl;

import com.dg.springcloud.dao.DeptDao;
import com.dg.springcloud.entities.Dept;
import com.dg.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
