package com.xgj.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xgj.gulimall.product.entity.BrandEntity;
import com.xgj.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    OSSClient ossClient;

    //    @Test
//    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保持成功...");
//    }
//    @Test
//    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//
//        brandEntity.setBrandId(6L);
//        brandEntity.setDescript("华为");
//        brandService.updateById(brandEntity);
//        System.out.println("更新成功...");
//    }
//    @Test
//    void contextLoads() {
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//
//        list.forEach(System.out::println);
//        System.out.println("查询成功...");
//
//    }
//    @Test
//    public void testUpload() throws FileNotFoundException {
//        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
//        String endpoint = "oss-cn-shanghai.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tLB9EYMYrTiNbmVJ5Mw";
//        String accessKeySecret = "PoJWce33aPSigKiVUXLRC2cwj9nLty";
//
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        // 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
//        InputStream inputStream = new FileInputStream("C:\\Users\\xuegj1010\\Pictures\\Saved Pictures\\头像\\2ba12750f41a534167644a287325aa32.jpg");
//        // 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
//        ossClient.putObject("gulimall-xgj", "头像/2ba12750f41a534167644a287325aa32.jpg", inputStream);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//
//        System.out.println("上传成功...");
//    }

//    @Test
//    public void testUpload2() throws FileNotFoundException {
//        InputStream inputStream = new FileInputStream("C:\\Users\\xuegj1010\\Pictures\\Saved Pictures\\头像\\3956189fe12dea4dffb4b2fa1c855757.jpg");
//        ossClient.putObject("gulimall-xgj", "头像/3956189fe12dea4dffb4b2fa1c855757.jpg", inputStream);
//        ossClient.shutdown();
//        System.out.println("上传成功...");
//    }

}
