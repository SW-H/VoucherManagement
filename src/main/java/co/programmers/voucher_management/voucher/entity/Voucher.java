package co.programmers.voucher_management.voucher.entity;

import lombok.Builder;

public class Voucher {
	private final int id;
	private final DiscountStrategy discountStrategy;

	@Builder
	public Voucher(int id, DiscountStrategy discountStrategy) {
		this.id = id;
		this.discountStrategy = discountStrategy;
	}

	public int getId() {
		return id;
	}

	public DiscountStrategy getDiscountStrategy() {
		return discountStrategy;
	}
}
