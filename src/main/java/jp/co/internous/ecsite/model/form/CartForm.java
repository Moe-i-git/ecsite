package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

public class CartForm implements Serializable {

	//フィールドを設定
	private int userId;
	private List<Cart> cartList;
	
	//setterとgetterを作成
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return userId;
	}
	
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
	public List<Cart> getCartList() {
		return cartList;
	}

}
