package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 电动车报修
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
@TableName("diandongchebaoxiu")
public class DiandongchebaoxiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiandongchebaoxiuEntity() {
		
	}
	
	public DiandongchebaoxiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 电动车名称
	 */
					
	private String diandongchemingcheng;
	
	/**
	 * 电动车品牌
	 */
					
	private String diandongchepinpai;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 报修原因
	 */
					
	private String baoxiuyuanyin;
	
	/**
	 * 报修地点
	 */
					
	private String baoxiudidian;
	
	/**
	 * 报修时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date baoxiushijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：电动车名称
	 */
	public void setDiandongchemingcheng(String diandongchemingcheng) {
		this.diandongchemingcheng = diandongchemingcheng;
	}
	/**
	 * 获取：电动车名称
	 */
	public String getDiandongchemingcheng() {
		return diandongchemingcheng;
	}
	/**
	 * 设置：电动车品牌
	 */
	public void setDiandongchepinpai(String diandongchepinpai) {
		this.diandongchepinpai = diandongchepinpai;
	}
	/**
	 * 获取：电动车品牌
	 */
	public String getDiandongchepinpai() {
		return diandongchepinpai;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
	/**
	 * 设置：报修原因
	 */
	public void setBaoxiuyuanyin(String baoxiuyuanyin) {
		this.baoxiuyuanyin = baoxiuyuanyin;
	}
	/**
	 * 获取：报修原因
	 */
	public String getBaoxiuyuanyin() {
		return baoxiuyuanyin;
	}
	/**
	 * 设置：报修地点
	 */
	public void setBaoxiudidian(String baoxiudidian) {
		this.baoxiudidian = baoxiudidian;
	}
	/**
	 * 获取：报修地点
	 */
	public String getBaoxiudidian() {
		return baoxiudidian;
	}
	/**
	 * 设置：报修时间
	 */
	public void setBaoxiushijian(Date baoxiushijian) {
		this.baoxiushijian = baoxiushijian;
	}
	/**
	 * 获取：报修时间
	 */
	public Date getBaoxiushijian() {
		return baoxiushijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}

}
