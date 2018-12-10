package com.pinyougou.sellergoods.service;

import entity.PageResult;
import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandService {

    public List<TbBrand> findAll();

    public void add(TbBrand tbBrand);

    public TbBrand fondOne(Long id);

    public void update(TbBrand tbBrand);

    public void dele(Long[] ids);

    public PageResult search(TbBrand tbBrand, int pageNumber, int pageSize);
}
