package com.example.demo.response;

public class Rating {
	private Long userId;
	private Long ratingId;
	private Long hotelId;
	private Long rating;
	private String remarks;
	
	private Shop shop;
	
	
	
	public Rating(Long userId, Long ratingId, Long hotelId, Long rating, String remarks, Shop shop) {
		super();
		this.userId = userId;
		this.ratingId = ratingId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.remarks = remarks;
		this.shop = shop;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRatingId() {
		return ratingId;
	}
	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	public Long getRating() {
		return rating;
	}
	public void setRating(Long rating) {
		this.rating = rating;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
