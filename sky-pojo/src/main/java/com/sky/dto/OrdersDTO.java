package com.sky.dto;

import com.sky.entity.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 订单数据传输类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDTO implements Serializable {
    //订单Id
    private Long id;
    //订单号
    private String number;
    //订单状态 1:待付款 2:待派送 3:已派送 4:已完成 5:已取消
    private Integer status;
    //下单用户id
    private Long userId;
    //地址id
    private Long addressBookId;
    //下单时间
    private LocalDateTime orderTime;
    //结账时间
    private LocalDateTime checkoutTime;
    //支付方式 1微信，2支付宝
    private Integer payMethod;
    //实收金额
    private BigDecimal amount;
    //备注
    private String remark;
    //用户名
    private String userName;
    //手机号
    private String phone;
    //地址
    private String address;
    //收货人
    private String consignee;
    //订单详细描述信息List集合
    private List<OrderDetail> orderDetails;
}
