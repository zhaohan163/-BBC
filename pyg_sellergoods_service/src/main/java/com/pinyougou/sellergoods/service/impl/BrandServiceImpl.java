package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import entity.PageResult;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName BrandServiceImpl
 * @Author 123456
 * @Description TODO
 * @Version 1.0
 * @Date 2018/11/23 17:32
 **/

@Service
public class BrandServiceImpl implements BrandService {


    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.findAll();
    }

    @Override
    public void add(TbBrand tbBrand) {
        tbBrandMapper.add(tbBrand);
    }

    @Override
    public TbBrand fondOne(Long id) {
        return tbBrandMapper.findOne(id);
    }

    @Override
    public void update(TbBrand tbBrand) {
        tbBrandMapper.update(tbBrand);
    }

    @Override
    public void dele(Long[] ids) {
        for (Long id : ids) {
            tbBrandMapper.dele(id);
        }
    }

    @Override
    public PageResult search(TbBrand tbBrand, int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        Page<TbBrand> search = tbBrandMapper.search(tbBrand);
        return new PageResult(search.getTotal(),search.getResult());
    }

}
