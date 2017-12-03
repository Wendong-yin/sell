package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    // 创建完成之后，要明确这里要干什么？究竟要查询什么？

    // 第一个想到的就是，查询商家的商品。
    List<ProductInfo> findByproductStatus(Integer productStatus);
}
