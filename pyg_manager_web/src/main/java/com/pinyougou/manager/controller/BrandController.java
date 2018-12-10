package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.PageResult;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName BrandController
 * @Author 123456
 * @Description TODO
 * @Version 1.0
 * @Date 2018/11/23 17:40
 **/


@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }


    @RequestMapping("/search")
    public PageResult search(@RequestBody TbBrand tbBrand,Integer pageNumber,Integer pageSize){
        //System.out.println(tbBrand.getName());

        return brandService.search(tbBrand,pageNumber,pageSize);
    }


    @RequestMapping("/add")
    public Result add(@RequestBody TbBrand tbBrand){
        try {
            //System.out.println(tbBrand.getName());
            brandService.add(tbBrand);
            return new Result(true,"新增成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"新增失败！");
        }
    }

    @RequestMapping("/findOne")
    public TbBrand findOne(Long id){
        //System.out.println(id);
        return brandService.fondOne(id);
    }


    @RequestMapping("/update")
    public Result update(@RequestBody TbBrand tbBrand){
        try {
            //System.out.println(tbBrand.getName());
            brandService.update(tbBrand);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }


    @RequestMapping("/dele")
    public Result dele(Long[] ids){
        try {
            //System.out.println(ids);
            brandService.dele(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }









}
