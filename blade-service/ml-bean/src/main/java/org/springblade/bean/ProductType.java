/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.springblade.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.core.mp.base.BaseEntity;

/**
 * 产品分类实体类
 *
 * @author bond
 * @since 2020-03-24
 */
@Data
@TableName("t_product_type")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "ProductType对象", description = "产品分类")
public class ProductType extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String name;
	/**
	* 排序
	*/
		@ApiModelProperty(value = "排序")
		private Integer sort;

	@ApiModelProperty(value = "备注")
	private String remark;
}
