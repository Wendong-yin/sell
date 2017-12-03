package com.imooc.Service.imp;

import com.imooc.Service.ProductService;
import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImpTest {

    @Autowired
    private ProductServiceImp productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findShelf() {
        List<ProductInfo> result = productService.findShelf();
        Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void findAll() {
        // 第0页，现实2条信息
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> result = productService.findAll(request);
        System.out.println(result.getTotalElements());
        Assert.assertNotEquals(0,result.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345678");
        productInfo.setProductName("巨无霸");
        productInfo.setProductPrice(new BigDecimal(22.99));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的汉堡包");
        productInfo.setProductIcon("http://");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);
        ProductInfo result = productService.save(productInfo);

        Assert.assertNotEquals(null, result);
    }
}