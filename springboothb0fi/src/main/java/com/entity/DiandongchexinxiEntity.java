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
 * 电动车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
@TableName("diandongchexinxi")
public class DiandongchexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiandongchexinxiEntity() {
		
	}
	
	public DiandongchexinxiEntity(T t) {
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
	 * 电动车名称
	 */
					
	private String diandongchemingcheng;
	
	/**
	 * 电动车品牌
	 */
					
	private String diandongchepinpai;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 电动车型号
	 */
					
	private String diandongchexinghao;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 电动车详情
	 */
					
	private String diandongchexiangqing;
	
	/**
	 * 日租价格
	 */
					
	private Integer rizujiage;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：电动车型号
	 */
	public void setDiandongchexinghao(String diandongchexinghao) {
		this.diandongchexinghao = diandongchexinghao;
	}
	/**
	 * 获取：电动车型号
	 */
	public String getDiandongchexinghao() {
		return diandongchexinghao;
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
	 * 设置：电动车详情
	 */
	public void setDiandongchexiangqing(String diandongchexiangqing) {
		this.diandongchexiangqing = diandongchexiangqing;
	}
	/**
	 * 获取：电动车详情
	 */
	public String getDiandongchexiangqing() {
		return diandongchexiangqing;
	}
	/**
	 * 设置：日租价格
	 */
	public void setRizujiage(Integer rizujiage) {
		this.rizujiage = rizujiage;
	}
	/**
	 * 获取：日租价格
	 */
	public Integer getRizujiage() {
		return rizujiage;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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

}
