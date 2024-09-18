package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {
	//フィールドを設定
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private Timestamp createdAt;
	
	//setterとgetterの設定
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return userId;
	}
	
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public int getItemCount() {
		return itemCount;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal() {
		return total;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
}
