package com.tech.ssm.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 占用资源
 * 
 * @author Using
 *
 */

public class Using {
	private String using_id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date using_strat;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date using_end;

	public String getUsing_id() {
		return using_id;
	}

	public void setUsing_id(String using_id) {
		this.using_id = using_id;
	}

	public Date getUsing_strat() {
		return using_strat;
	}

	public void setUsing_strat(Date using_strat) {
		this.using_strat = using_strat;
	}

	public Date getUsing_end() {
		return using_end;
	}

	public void setUsing_end(Date using_end) {
		this.using_end = using_end;
	}

	@Override
	public String toString() {
		return "Using [using_id=" + using_id + ", using_strat=" + using_strat + ", using_end=" + using_end + "]";
	}

}
