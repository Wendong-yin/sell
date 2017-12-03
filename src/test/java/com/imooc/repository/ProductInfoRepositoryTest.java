package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("蟹黄包");
        productInfo.setProductPrice(new BigDecimal(22.99));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的包子");
        productInfo.setProductIcon("http://");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(2);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotEquals(null, result);

    }

    @Test
    public void findByproductStatus() {
        List<ProductInfo> result = repository.findByproductStatus(1);
        Assert.assertNotEquals(0,result.size());
    }
}