package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "StrawBerry";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("2243 US Highway 52 W. ");
        orderMaster.setBuyerName("美貌大王");
        orderMaster.setBuyerPhone("7654307466");
        orderMaster.setOrderAmount(new BigDecimal(233));
        orderMaster.setOrderId("002904647");
        orderMaster.setBuyerOpenid("StrawBerry");

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotEquals(null,result);
    }
    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(0,4);
        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID, request);
        System.out.println(result.getTotalElements());
    }
}