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
package org.springblade.energy.runningmanagement.standingbook.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springblade.core.mp.base.BaseService;
import org.springblade.energy.runningmanagement.standingbook.entity.EquipmentLog;
import org.springblade.energy.runningmanagement.standingbook.vo.EquipmentLogVO;

/**
 * 设备运行记录表 服务类
 *
 * @author bond
 * @since 2020-04-09
 */
public interface IEquipmentLogService extends BaseService<EquipmentLog> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param equipmentLog
	 * @return
	 */
	IPage<EquipmentLogVO> selectEquipmentLogPage(IPage<EquipmentLogVO> page, EquipmentLogVO equipmentLog);

}
