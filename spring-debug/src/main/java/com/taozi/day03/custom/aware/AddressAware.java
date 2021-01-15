package com.taozi.day03.custom.aware;

import com.taozi.day03.entity.Address;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/15 15:24
 */
public interface AddressAware {

	void setAddress(Address address);
}
