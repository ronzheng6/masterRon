package com.ronzheng.travel.entity;

import java.io.Serializable;

public class SpotInfo implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String spotName;

    private String spotIntroduce;

    private String createTime;

    private String createby;

    private String updateTime;

    private String updateby;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName == null ? null : spotName.trim();
    }

    public String getSpotIntroduce() {
        return spotIntroduce;
    }

    public void setSpotIntroduce(String spotIntroduce) {
        this.spotIntroduce = spotIntroduce == null ? null : spotIntroduce.trim();
    }

    public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

//	@Override
//	public String toString() {
//		return "[id=" + id + ",spotName=" +spotName + ",spotIntroduce=" +spotIntroduce + ",createTime="
//				+createTime + ", createby=" +createby + ", updateTime=" +updateTime + ", updateby=" +updateby + "]";
//	}

	@Override
	public String toString() {
		return id+","+spotName+","+spotIntroduce+","+createTime+","+createby+","+updateTime+","+updateby;
	}
}