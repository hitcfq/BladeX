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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.core.mp.base.BaseEntity;

/**
 * 产品属性表实体类
 *
 * @author bond
 * @since 2020-03-24
 */
@Data
@TableName("t_product_property")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "ProductProperty对象", description = "产品属性表")
public class ProductProperty extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	* 产品id
	*/
		@ApiModelProperty(value = "产品id")
		@JsonSerialize(
			using = ToStringSerializer.class
		)
		private Long productId;
	/**
	* 属性
	*/
		@ApiModelProperty(value = "属性")
		private String propertyCode;
	/**
	* 属性中文名称
	*/
		@ApiModelProperty(value = "属性中文名称")
		private String propertyName;
	/**
	* 属性别名
	*/
		@ApiModelProperty(value = "属性别名")
		private String propertyAlias;
	/**
	* 单位
	*/
		@ApiModelProperty(value = "单位")
		private String unit;
	/**
	* 功能属性(四遥)
	*/
		@ApiModelProperty(value = "功能属性(四遥)")
		private String ftype;

		@ApiModelProperty(value = "业务类型)")
		private Integer btype;

	/**
	* 变比
	*/
		@ApiModelProperty(value = "变比")
		private Float ctratio;
	/**
	* 基值
	*/
		@ApiModelProperty(value = "基值")
		private Float basic;
	/**
	* 是否告警 0:不告警 1:告警
	*/
		@ApiModelProperty(value = "是否告警 0:不告警 1:告警")
		private Integer alarm;
	/**
	* 是否存储 0:不存储 1:存储
	*/
		@ApiModelProperty(value = "是否存储 0:不存储 1:存储")
		private Integer store;
	/**
	* 存储规则
	*/
		@ApiModelProperty(value = "存储规则")
		private Integer calcrule;
	/**
	* 告警上限
	*/
		@ApiModelProperty(value = "告警上限")
		private Float uplimit;
	/**
	* 告警下限
	*/
		@ApiModelProperty(value = "告警下限")
		private Float lowlimit;
	/**
	* 告警上上限
	*/
		@ApiModelProperty(value = "告警上上限")
		private Float upuplimit;
	/**
	* 告警下下限
	*/
		@ApiModelProperty(value = "告警下下限")
		private Float lowlowlimit;
	/**
	* 告警类型
	*/
		@ApiModelProperty(value = "告警类型")
		private Integer alarmType;
	/**
	* 持续时间
	*/
		@ApiModelProperty(value = "持续时间")
		private Integer duration;
	/**
	* 是否发送短信 0:不发 1:发送
	*/
		@ApiModelProperty(value = "是否发送短信 0:不发 1:发送")
		private Integer sendSms;
	/**
	* 是否发送邮件 0:不发 1:发送
	*/
		@ApiModelProperty(value = "是否发送邮件 0:不发 1:发送")
		private Integer sendEmail;
	/**
	* 告警推送地址
	*/
		@ApiModelProperty(value = "告警推送地址")
		private String alarmUrl;
	/**
	* 遥信告警值
	*/
		@ApiModelProperty(value = "遥信告警值")
		private Integer yxAlarmVal;
	/**
	* 遥信告警等级
	*/
		@ApiModelProperty(value = "遥信告警等级")
		private Integer yxAlarmLevel;
	/**
	* 最大值
	*/
		@ApiModelProperty(value = "最大值")
		private Float maxVal;
	/**
	* 最小值
	*/
		@ApiModelProperty(value = "最小值")
		private Float minVal;
	/**
	* 系数
	*/
		@ApiModelProperty(value = "系数")
		private Float ratio;
	/**
	* 显示状态（0显示 1隐藏）
	*/
		@ApiModelProperty(value = "显示状态（0显示 1隐藏）")
		private Boolean visible;
	/**
	* 历史曲线（0否   1是）
	*/
		@ApiModelProperty(value = "历史曲线（0否   1是）")
		private Boolean historyCurve;
	/**
	* 趋势分析（0否   1是）
	*/
		@ApiModelProperty(value = "趋势分析（0否   1是）")
		private Boolean trendAnalysis;
	/**
	* 备注
	*/
		@ApiModelProperty(value = "备注")
		private String remark;
	/**
	* 能耗分析（0否   1是）
	*/
		@ApiModelProperty(value = "能耗分析（0否   1是）")
		private Boolean energyAnalysis;
	@ApiModelProperty(value = "计算值规则，即JS脚本")
	private String formula;           //计算值规则，即JS脚本，数据项对应类别stype等于5或6





}
