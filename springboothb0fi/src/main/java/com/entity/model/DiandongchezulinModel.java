package com.entity.model;

import com.entity.DiandongchezulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电动车租赁
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
public class DiandongchezulinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
