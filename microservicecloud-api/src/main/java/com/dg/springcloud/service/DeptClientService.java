package com.dg.springcloud.service;

import com.dg.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@FeignClient(value="MICROSERVICECLOUD-DEPT")*/
@FeignClient(value="MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);

    @GetMapping("dept/list")
    public List<Dept> list();

    @PostMapping("dept/add")
    public boolean add(@RequestBody Dept dept);

}

