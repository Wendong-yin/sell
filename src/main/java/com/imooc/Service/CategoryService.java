package com.imooc.Service;


import com.imooc.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {
    // 卖家后台管理
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    ProductCategory save (ProductCategory productCategory);

    // 买家查询
    List<ProductCategory> findBycategoryType(List<Integer> categoryTyeList);


}
