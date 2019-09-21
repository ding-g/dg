package com.dg.springcloud.service;

import com.dg.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    public Dept get(Long id);

    public boolean add(Dept dept);

    public List<Dept> list();

}
