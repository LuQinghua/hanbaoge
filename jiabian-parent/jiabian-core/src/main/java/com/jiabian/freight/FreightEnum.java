/**
 * 家边网络科技有限公司
 * jiabian-io
 * com.jiabian.base
 * FreightEnum.java
 * 创建人:潇洒
 * 时间：2016-11-15-下午4:25:23 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.freight;

import java.math.BigDecimal;

/**
 * FreightEnum
 * 创建人:潇洒
 * 时间：2016-11-15-下午4:25:23 
 */
public class FreightEnum {
	
	/**
	 * 订单金额
	 * OrderAmount
	 * 创建人:潇洒
	 * 时间：2016-11-15-下午4:29:19
	 */
	public enum OrderAmount{
		AMOUNT(new BigDecimal("39"));
		private final BigDecimal vaule;
	    
	    OrderAmount(BigDecimal vaule) {
	        this.vaule = vaule;
	    }
	    
	    public BigDecimal value() {
	        return vaule;
	    }

	}
	
	/**
	 * 
	 * OrderAmount
	 * 创建人:潇洒
	 * 时间：2016-11-15-下午4:29:19
	 */
	public enum OrderWeight{
		WEIGHT_5(new BigDecimal("5")),
		WEIGHT_20(new BigDecimal("20")),
		WEIGHT_50(new BigDecimal("50"));
		private final BigDecimal vaule;
	    
		OrderWeight(BigDecimal vaule) {
	        this.vaule = vaule;
	    }
	    
	    public BigDecimal value() {
	        return vaule;
	    }

	}
	

	/**
	 * 基础配送费
	 * OrderAmount
	 * 创建人:潇洒
	 * 时间：2016-11-15-下午4:29:19
	 */
	public enum OrderBaseFee{
		FEE_5(new BigDecimal("5")),
		FEE_6(new BigDecimal("6")),
		FEE_10(new BigDecimal("10"));
		private final BigDecimal vaule;
	    
		OrderBaseFee(BigDecimal vaule) {
	        this.vaule = vaule;
	    }
	    
	    public BigDecimal value() {
	        return vaule;
	    }
	}
	
	
	/**
	 * 超重增加费
	 * OrderAmount
	 * 创建人:潇洒
	 * 时间：2016-11-15-下午4:29:19
	 */
	public enum OrderOverWeightFee{
		OVERWEIGHT_0(new BigDecimal("0.5")),
		OVERWEIGHT_1(new BigDecimal("1"));
		private final BigDecimal vaule;
	    
		OrderOverWeightFee(BigDecimal vaule) {
	        this.vaule = vaule;
	    }
	    
	    public BigDecimal value() {
	        return vaule;
	    }
	}
	
	
	/**
	 * 无电梯上四楼及以上搬运费
	 * OrderAmount
	 * 创建人:潇洒
	 * 时间：2016-11-15-下午4:29:19
	 */
	public enum OrderUnelevatorFee{
		UNELEVATOR_2(new BigDecimal("2")),
		UNELEVATOR_3(new BigDecimal("3")),
		UNELEVATOR_5(new BigDecimal("5")),
		UNELEVATOR_10(new BigDecimal("10"));
		private final BigDecimal vaule;
	    
		OrderUnelevatorFee(BigDecimal vaule) {
	        this.vaule = vaule;
	    }
	    
	    public BigDecimal value() {
	        return vaule;
	    }
	}
	
	
	/**
	 * 有电梯上十楼及以上搬运费
	 * OrderAmount
	 * 创建人:潇洒
	 * 时间：2016-11-15-下午4:29:19
	 */
	public enum OrderElevatorFee{
		ELEVATOR_2(new BigDecimal("2")),
		ELEVATOR_3(new BigDecimal("3")),
		ELEVATOR_5(new BigDecimal("5")),
		ELEVATOR_10(new BigDecimal("10"));
		private final BigDecimal vaule;
	    
		OrderElevatorFee(BigDecimal vaule) {
	        this.vaule = vaule;
	    }
	    
	    public BigDecimal value() {
	        return vaule;
	    }
	}
	
	
	/**
	 * 超限增加费
	 * OrderAmount
	 * 创建人:潇洒
	 * 时间：2016-11-15-下午4:29:19
	 */
	public enum OrderOverRestrictFee{
		OVERRESTRICT_10(new BigDecimal("10")),
		OVERRESTRICT_15(new BigDecimal("15")),
		OVERRESTRICT_20(new BigDecimal("20"));
		private final BigDecimal vaule;
	    
		OrderOverRestrictFee(BigDecimal vaule) {
	        this.vaule = vaule;
	    }
	    
	    public BigDecimal value() {
	        return vaule;
	    }
	}


}
