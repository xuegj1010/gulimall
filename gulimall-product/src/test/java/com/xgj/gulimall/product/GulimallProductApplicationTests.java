package com.xgj.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xgj.gulimall.product.entity.BrandEntity;
import com.xgj.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    //    @Test
//    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保持成功...");
//    }
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setBrandId(6L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);
        System.out.println("更新成功...");
    }
//    @Test
//    void contextLoads() {
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//
//        list.forEach(System.out::println);
//        System.out.println("查询成功...");
//
//    }


}
