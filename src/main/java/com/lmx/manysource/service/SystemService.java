package com.lmx.manysource.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.lmx.manysource.mapper.DwsPrsnInfDiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lmx
 * @create: 2021/1/12
 **/
@Service
public class SystemService {

    @Autowired
    private DwsPrsnInfDiMapper dwsPrsnInfDiMapper;

    @DS("ck")
    public void test() {

        Integer integer = dwsPrsnInfDiMapper.selectCount(null);
        System.out.println(integer);

    }
}
