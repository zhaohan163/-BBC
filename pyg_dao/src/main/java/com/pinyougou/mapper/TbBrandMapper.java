package com.pinyougou.mapper;

import com.github.pagehelper.Page;
import com.pinyougou.pojo.TbBrand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbBrandMapper {

    @Select(" SELECT id, NAME, first_char AS firstChar FROM tb_brand ")
    public List<TbBrand> findAll();

    //保存操作
    public void add(TbBrand tbBrand);

    //根据id查询
    public TbBrand findOne(Long id);

    //修改操作
    public void update(TbBrand tbBrand);

    //删除操作
    public void dele(Long id);

    //分页 + 条件查询
    public Page<TbBrand> search(TbBrand tbBrand);
}
