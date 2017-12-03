package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("美女最爱",33);
        productCategoryRepository.save(productCategory);
    }

    @Test
    @Transactional
    public void updateTest(){
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        productCategory.setCategoryName("23323帅哥最爱");
        productCategoryRepository.save(productCategory);
    }

    @Test
    public void findBycategoryTypeTest(){
        List<Integer> list = Arrays.asList(3,33);
        List<ProductCategory> result = productCategoryRepository.findBycategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }



}