package com.imooc.Service.imp;

import com.imooc.Service.CategoryService;
import com.imooc.dataobject.ProductCategory;
import com.imooc.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService{
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }

    @Override
    public List<ProductCategory> findBycategoryType(List<Integer> categoryTyeList) {
        return repository.findBycategoryTypeIn(categoryTyeList);
    }
}
