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
package org.springblade.energy.runningmanagement.standingbook.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springblade.core.boot.ctrl.BladeController;
import org.springblade.core.log.annotation.ApiLog;
import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springblade.energy.diagram.entity.DiagramProduct;
import org.springblade.energy.diagram.service.IDiagramProductService;
import org.springblade.energy.runningmanagement.standingbook.entity.EquipmentTransformer;
import org.springblade.energy.runningmanagement.standingbook.service.IEquipmentTransformerService;
import org.springblade.energy.runningmanagement.standingbook.vo.EquipmentTransformerVO;
import org.springblade.energy.runningmanagement.standingbook.wrapper.EquipmentTransformerWrapper;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 台账--变压器 控制器
 *
 * @author bond
 * @since 2020-04-03
 */
@RestController
@AllArgsConstructor
@RequestMapping("/equipmenttransformer")
@Api(value = "台账--变压器", tags = "台账--变压器接口")
public class EquipmentTransformerController extends BladeController {

	private IEquipmentTransformerService equipmentTransformerService;
	private IDiagramProductService iDiagramProductService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入equipmentTransformer")
	public R<EquipmentTransformerVO> detail(EquipmentTransformer equipmentTransformer) {
		EquipmentTransformer detail = equipmentTransformerService.getOne(Condition.getQueryWrapper(equipmentTransformer));
		return R.data(EquipmentTransformerWrapper.build().entityVO(detail));
	}

	/**
	 * 分页 台账--变压器
	 */
//	@GetMapping("/list")
//	@ApiOperationSupport(order = 2)
//	@ApiOperation(value = "分页", notes = "传入equipmentTransformer")
//	public R<IPage<EquipmentTransformerVO>> list(EquipmentTransformer equipmentTransformer, Query query) {
//		IPage<EquipmentTransformer> pages = equipmentTransformerService.page(Condition.getPage(query), Condition.getQueryWrapper(equipmentTransformer));
//		return R.data(EquipmentTransformerWrapper.build().pageVO(pages));
//	}


	/**
	 * 自定义分页 台账--变压器
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入equipmentTransformer")
	public R<IPage<EquipmentTransformerVO>> page(EquipmentTransformerVO equipmentTransformer, Query query) {
		IPage<EquipmentTransformerVO> pages = equipmentTransformerService.selectEquipmentTransformerPage(Condition.getPage(query), equipmentTransformer);
		return R.data(pages);
	}

	/**
	 * 新增 台账--变压器
	 */
	@ApiLog("新增 台账--变压器")
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入equipmentTransformer")
	public R save(@Valid @RequestBody EquipmentTransformer equipmentTransformer) {
//		if(Func.isEmpty(equipmentTransformer.getCode())){
//			R.fail("变压器code不能为空");
//		}
		DiagramProduct diagramProduct=iDiagramProductService.getById(equipmentTransformer.getCode());
		if(Func.isNotEmpty(diagramProduct)){
			equipmentTransformer.setName(diagramProduct.getProductcname());
			equipmentTransformer.setDiagramId(diagramProduct.getDiagramId());
		}
		return R.status(equipmentTransformerService.save(equipmentTransformer));
	}

	/**
	 * 修改 台账--变压器
	 */
	@ApiLog("修改 台账--变压器")
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入equipmentTransformer")
	public R update(@Valid @RequestBody EquipmentTransformer equipmentTransformer) {
//		if(Func.isEmpty(equipmentTransformer.getCode())){
//			R.fail("变压器code不能为空");
//		}
		DiagramProduct diagramProduct=iDiagramProductService.getById(equipmentTransformer.getCode());
		if(Func.isEmpty(diagramProduct)){
			equipmentTransformer.setDiagramId(diagramProduct.getDiagramId());
		}
		return R.status(equipmentTransformerService.updateById(equipmentTransformer));
	}

	/**
	 * 新增或修改 台账--变压器
	 */
	@ApiLog("新增或修改 台账--变压器")
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入equipmentTransformer")
	public R submit(@Valid @RequestBody EquipmentTransformer equipmentTransformer) {
//		if(Func.isEmpty(equipmentTransformer.getCode())){
//			R.fail("变压器code不能为空");
//		}
		DiagramProduct diagramProduct=iDiagramProductService.getById(equipmentTransformer.getCode());
		if(Func.isEmpty(diagramProduct)){
		equipmentTransformer.setDiagramId(diagramProduct.getDiagramId());
		}
		return R.status(equipmentTransformerService.saveOrUpdate(equipmentTransformer));
	}


	/**
	 * 删除 台账--变压器
	 */
	@ApiLog("删除 台账--变压器")
	@PostMapping("/remove")
	@ApiOperationSupport(order = 7)
	@ApiOperation(value = "逻辑删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(equipmentTransformerService.deleteLogic(Func.toLongList(ids)));
	}


}
