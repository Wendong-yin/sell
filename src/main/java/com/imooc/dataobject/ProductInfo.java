package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {

    @Id
    //`product_id` varchar(32)
    private String productId;
    //`product_name`
    private String productName;

    //`product_price` decimal(8,2)
    private BigDecimal productPrice;

    //`product_stock` int
    private  Integer productStock;

    // `product_description` varchar(64)
    private String productDescription;

    // `product_icon` varchar(512)
    private String productIcon;

    // `product_status` tinyint(3) DEFAULT '0' COMMENT '商品状态,0正常1下架',
    private Integer productStatus;

    //  `category_type` int not null comment '类目编号',
    private Integer categoryType;
    // `create_time` timestamp 创建时间',
    //  `update_time` timestamp

}
