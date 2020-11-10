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
package org.springblade.energy.diagram.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.core.tenant.mp.TenantEntity;

/**
 * 系统图基本信息实体类
 *
 * @author bond
 * @since 2020-03-26
 */
@Data
@TableName("t_diagram")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Diagram对象", description = "系统图基本信息")
public class Diagram extends TenantEntity {

	private static final long serialVersionUID = 1L;

	/**
	* 站点ID
	*/
		@ApiModelProperty(value = "站点ID")
		@JsonSerialize(using = ToStringSerializer.class)
		private Long stationId;
	/**
	* 位置ID
	*/
		@ApiModelProperty(value = "位置ID")
		@JsonSerialize(using = ToStringSerializer.class)
		private Long siteId;
	/**
	* 图形分类
	*/
		@ApiModelProperty(value = "图形分类")
		private String diagramType;

	@ApiModelProperty(value = "图形TM分类")
	private String tmType;

	/**
	* 图名称
	*/
		@ApiModelProperty(value = "图名称")
		private String diagramName;
	/**
	* 网关
	*/
		@ApiModelProperty(value = "网关")
		private String did;
	/**
	* 图形json数据
	*/
		@ApiModelProperty(value = "图形json数据")
		private String diagramData;

		@ApiModelProperty(value = "背景图片")
		private String bkImage;

}
