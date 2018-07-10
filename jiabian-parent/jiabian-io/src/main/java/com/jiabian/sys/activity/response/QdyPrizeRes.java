package com.jiabian.sys.activity.response;

import java.io.Serializable;

public class QdyPrizeRes implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 奖项id
	 */
	private Long prize_id;
	/**
	 * 奖项名称 1.(终极大奖) 2. （幸运奖）3.（幸运号）4（终极幸运号）
	 */
	private Byte prize_name;
	/**
	 * 商品名
	 */
	private String prodname;
	/**
	 * 商品图片
	 */
	private String prodimg;

	public Long getPrize_id() {
		return prize_id;
	}

	public void setPrize_id(Long prize_id) {
		this.prize_id = prize_id;
	}

	public Byte getPrize_name() {
		return prize_name;
	}

	public void setPrize_name(Byte prize_name) {
		this.prize_name = prize_name;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname == null ? null : prodname.trim();
	}

	public String getProdimg() {
		return prodimg;
	}

	public void setProdimg(String prodimg) {
		this.prodimg = prodimg == null ? null : prodimg.trim();
	}
}
