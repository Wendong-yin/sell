package com.imooc.Service;

import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    /** 创建订单 */
    OrderDTO create (OrderDTO orderDTO);
    /** 根据订单id，查询单个订单 */
    OrderDTO findOne (String orderId);
    /** 根据用户id，查询所有订单 */
    Page<OrderDTO> findList (String buyerOpenid, Pageable pageable);

    /** 取消订单 */
    OrderDTO cancel (OrderDTO orderDTO);
    /** 接单-完结订单 */
    OrderDTO finish (OrderDTO orderDTO);
    /** 支付订单 */
    OrderDTO paid (OrderDTO orderDTO);

}
