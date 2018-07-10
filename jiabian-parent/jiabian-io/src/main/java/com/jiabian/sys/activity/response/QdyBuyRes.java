package com.jiabian.sys.activity.response;

import java.io.Serializable;
import java.util.Date;

public class QdyBuyRes implements Serializable{
	  private Long buyPartake_id;
	    private Long id;
	    private Date buyPartake_time;
	    private static final long serialVersionUID = 1L;

	    public Long getBuyPartake_id() {
	        return buyPartake_id;
	    }
	    public void setBuyPartake_id(Long buyPartake_id) {
	        this.buyPartake_id = buyPartake_id;
	    }
	    public Long getId() {
	        return id;
	    }
	    public void setId(Long id) {
	        this.id = id;
	    }
	    public Date getBuyPartake_time() {
	        return buyPartake_time;
	    }
	    public void setBuyPartake_time(Date buyPartake_time) {
	        this.buyPartake_time = buyPartake_time;
	    }
}
