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
 * 电动车租赁
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
@TableName("diandongchezulin")
public class DiandongchezulinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiandongchezulinEntity() {
		
	}
	
	public DiandongchezulinEntity(T t) {
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
	 * 日租价格
	 */
					
	private Integer rizujiage;
	
	/**
	 * 租赁天数
	 */
					
	private Integer zulintianshu;
	
	/**
	 * 总价格
	 */
					
	private Integer zongjiage;
	
	/**
	 * 租赁日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zulinriqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：租赁天数
	 */
	public void setZulintianshu(Integer zulintianshu) {
		this.zulintianshu = zulintianshu;
	}
	/**
	 * 获取：租赁天数
	 */
	public Integer getZulintianshu() {
		return zulintianshu;
	}
	/**
	 * 设置：总价格
	 */
	public void setZongjiage(Integer zongjiage) {
		this.zongjiage = zongjiage;
	}
	/**
	 * 获取：总价格
	 */
	public Integer getZongjiage() {
		return zongjiage;
	}
	/**
	 * 设置：租赁日期
	 */
	public void setZulinriqi(Date zulinriqi) {
		this.zulinriqi = zulinriqi;
	}
	/**
	 * 获取：租赁日期
	 */
	public Date getZulinriqi() {
		return zulinriqi;
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
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：身份证号
	 */
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
