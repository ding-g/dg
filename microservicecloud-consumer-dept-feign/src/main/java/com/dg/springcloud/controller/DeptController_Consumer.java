package com.dg.springcloud.controller;

import com.dg.springcloud.entities.Dept;
import com.dg.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

    @PostMapping("/consumer/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptClientService.add(dept);
    }

}
