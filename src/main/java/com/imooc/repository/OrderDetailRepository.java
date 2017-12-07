package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.OrderMaster;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
