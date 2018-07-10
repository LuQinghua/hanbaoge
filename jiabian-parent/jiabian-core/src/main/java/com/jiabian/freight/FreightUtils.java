/**
 * 家边网络科技有限公司
 * jiabian-core
 * com.jiabian.util
 * FreightUtils.java
 * 创建人:潇洒
 * 时间：2016-11-15-下午5:06:06 
 * 2016家边网络科技有限公司-版权所有
 */
package com.jiabian.freight;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 运费计算公式 FreightUtils 创建人:潇洒 时间：2016-11-15-下午5:06:06
 */
public class FreightUtils {

	public static  BigDecimal  getFreight(BigDecimal totalMoney,
			BigDecimal totalWeight, byte isStair, Integer floor) {

		if (totalMoney.compareTo(FreightEnum.OrderAmount.AMOUNT.value()) == -1) { // 订单金额小于规定值

			// ----------------------------------------订单金额小于,重量小
			// 于5KG---------------------------------------------------
			if (totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_5.value()
					.multiply(new BigDecimal(1000))) == -1
					|| totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_5
							.value().multiply(new BigDecimal(1000))) == 0) { // 商品重量小于等于规定的数目
				return FreightEnum.OrderBaseFee.FEE_6.value();
			}
			
			// ----------------------------------------订单金额小于,重量大于5KG---------------------------------------------------
			if (totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_5.value()
					.multiply(new BigDecimal(1000))) == 1) { // 商品重量大于规定的数目
				if (isStair == 1) { // 无电梯房，楼梯房
					if (floor < 4) {
						return FreightEnum.OrderBaseFee.FEE_6.value()
								.add(totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN).subtract(FreightEnum.OrderWeight.WEIGHT_5.value()));
					} else {
						return  FreightEnum.OrderBaseFee.FEE_6
								.value()
								.add(totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN).subtract(FreightEnum.OrderWeight.WEIGHT_5.value()))
								.add(FreightEnum.OrderUnelevatorFee.UNELEVATOR_3
										.value());
					}
				}
				
				if (isStair == 0) { // 电梯房
					if (floor < 10) { // 十层以下
						return FreightEnum.OrderBaseFee.FEE_6.value()
								.add(totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN).subtract(FreightEnum.OrderWeight.WEIGHT_5.value()));
					} else {
						return  FreightEnum.OrderBaseFee.FEE_6
								.value()
								.add(totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN).subtract(
										FreightEnum.OrderWeight.WEIGHT_5.value()))
								.add(FreightEnum.OrderElevatorFee.ELEVATOR_3
										.value());
					}
				}
			}
		}
		
		// ----------------------------------------订单金额大于等于,重量小于5KG---------------------------------------------------
		if (totalMoney.compareTo(FreightEnum.OrderAmount.AMOUNT.value()) == 1
				|| totalMoney.compareTo(FreightEnum.OrderAmount.AMOUNT.value()) == 0) { // 订单金额大于等于
			if (totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_5.value()
					.multiply(new BigDecimal(1000))) == -1
					|| totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_5
							.value().multiply(new BigDecimal(0.001))) == 0) {
				if (isStair == 1) { // 无电梯房，楼梯房
					if (floor < 4) { // 楼层小于4楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return FreightEnum.OrderBaseFee.FEE_6
									.value();
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_6
									.value().subtract((totalMoney.subtract(new BigDecimal(200))).divide(new BigDecimal(1000), 0, RoundingMode.DOWN));
						}
					} else { // 楼层大于4楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_6
									.value()
									.add(FreightEnum.OrderUnelevatorFee.UNELEVATOR_2
											.value());
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_6
									.value()
									.add(FreightEnum.OrderUnelevatorFee.UNELEVATOR_2
											.value())
									.subtract((totalMoney.subtract(new BigDecimal(200))).divide(new BigDecimal(1000), 0, RoundingMode.DOWN));
						}
					}
				}

				if (isStair == 0) { // 电梯房
					if (floor < 10) { // 楼层小于10楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_6
									.value();
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_6
									.value()
									.subtract(
											((totalMoney.subtract(new BigDecimal(200)).divide(new BigDecimal(1000),0,RoundingMode.DOWN))));
						}
					} else { // 楼层大于10楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_6
									.value()
									.add(FreightEnum.OrderElevatorFee.ELEVATOR_2
											.value());
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_6
									.value()
									.add(FreightEnum.OrderElevatorFee.ELEVATOR_2
											.value())
									.subtract(
											((totalMoney.subtract(new BigDecimal(200)).divide(new BigDecimal(1000),0,RoundingMode.DOWN))));
						}
					}
				}
			}
			// -------------------------------------------订单金额大于等于,重量大于5KG到20KG---------------------------------------------------

			if (totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_5.value()
					.multiply(new BigDecimal(1000))) == 1
					|| totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_20
							.value().multiply(new BigDecimal(1000))) == 0 || totalWeight
							.compareTo(FreightEnum.OrderWeight.WEIGHT_20
									.value().multiply(new BigDecimal(1000))) == -1) {
				if (isStair == 1) { // 无电梯房，楼梯房
					if (floor < 4) { // 楼层小于4楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return FreightEnum.OrderBaseFee.FEE_5.value()
	.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0.value().
			multiply(totalWeight.divide(new BigDecimal(1000)).subtract(FreightEnum.OrderWeight.WEIGHT_5.value())));
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.subtract(
											((totalMoney.subtract(new BigDecimal(200))).divide(new BigDecimal(1000),0,RoundingMode.DOWN)))
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN).subtract(FreightEnum.OrderWeight.WEIGHT_5.value())));
						}
					} else { // 楼层大于4楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value())))
									.add(FreightEnum.OrderUnelevatorFee.UNELEVATOR_3
											.value());
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderUnelevatorFee.UNELEVATOR_3
											.value())
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													);
						}
					}
				}

				if (isStair == 0) { // 电梯房
					if (floor < 10) { // 楼层小于10楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															));
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													);
						}
					} else { // 楼层大于10楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderElevatorFee.ELEVATOR_3
											.value());
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderElevatorFee.ELEVATOR_3
											.value())
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													);
						}
					}
				}
			}

			// -------------------------------------------订单金额大于等于,重量大于20KG到50KG---------------------------------------------------

			if (totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_20.value()
					.multiply(new BigDecimal(1000))) == 1
					&& (totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_50
							.value().multiply(new BigDecimal(1000))) == 0 || totalWeight
							.compareTo(FreightEnum.OrderWeight.WEIGHT_50
									.value().multiply(new BigDecimal(1000))) == -1)) {
				if (isStair == 1) { // 无电梯房，楼梯房
					if (floor < 4) { // 楼层小于4楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															));
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													)
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															));
						}
					} else { // 楼层大于4楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderUnelevatorFee.UNELEVATOR_5
											.value());
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderUnelevatorFee.UNELEVATOR_5
											.value())
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													);
						}
					}
				}

				if (isStair == 0) { // 电梯房
					if (floor < 10) { // 楼层小于10楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															));
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													);
						}
					} else { // 楼层大于10楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderElevatorFee.ELEVATOR_5
											.value());
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderElevatorFee.ELEVATOR_5
											.value())
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													);
						}
					}
				}
			}

			// -------------------------------------------订单金额大于等于,重量大于50KG---------------------------------------------------

			if (totalWeight.compareTo(FreightEnum.OrderWeight.WEIGHT_50.value()
					.multiply(new BigDecimal(1000))) == 1) {
				if (isStair == 1) { // 无电梯房，楼梯房
					if (floor < 4) { // 楼层小于4楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															));
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													)
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															));
						}
					} else { // 楼层大于4楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderUnelevatorFee.UNELEVATOR_10
											.value());
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderUnelevatorFee.UNELEVATOR_10
											.value())
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													.setScale(0));
						}
					}
				}

				if (isStair == 0) { // 电梯房
					if (floor < 10) { // 楼层小于10楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															));
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													.setScale(0));
						}
					} else { // 楼层大于10楼
						if (totalMoney.compareTo(new BigDecimal(200)) == -1) { // 总订单金额小于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderElevatorFee.ELEVATOR_10
											.value());
						} else { // 总订单金额大于200
							return  FreightEnum.OrderBaseFee.FEE_5
									.value()
									.add(FreightEnum.OrderOverWeightFee.OVERWEIGHT_0
											.value()
											.multiply(
													totalWeight.divide(new BigDecimal(1000),0,RoundingMode.DOWN)
															.subtract(
																	FreightEnum.OrderWeight.WEIGHT_5
																			.value()
																			)
															))
									.add(FreightEnum.OrderElevatorFee.ELEVATOR_10
											.value())
									.subtract(
											((totalMoney
													.subtract(new BigDecimal(
															200)))
													.divide(new BigDecimal(100),0,RoundingMode.DOWN))
													);
						}
					}
				}
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		BigDecimal totalMoney = new BigDecimal("39");
		BigDecimal totalWeight = new BigDecimal("0"); 
		byte isStair = 0; 
		Integer floor =3;
		BigDecimal freight = getFreight(totalMoney, totalWeight, isStair, floor);
		System.out.println(freight);
		
	}
}
