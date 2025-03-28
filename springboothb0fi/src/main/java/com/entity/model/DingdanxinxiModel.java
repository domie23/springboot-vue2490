package com.entity.model;

import com.entity.DingdanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 订单信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
public class DingdanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电动车名称
	 */
	
	private String diandongchemingcheng;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 租赁日期
	 */
	
	private String zulinriqi;
		
	/**
	 * 还车日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date haicheriqi;
		
	/**
	 * 租赁天数
	 */
	
	private String zulintianshu;
		
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
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：租赁日期
	 */
	 
	public void setZulinriqi(String zulinriqi) {
		this.zulinriqi = zulinriqi;
	}
	
	/**
	 * 获取：租赁日期
	 */
	public String getZulinriqi() {
		return zulinriqi;
	}
				
	
	/**
	 * 设置：还车日期
	 */
	 
	public void setHaicheriqi(Date haicheriqi) {
		this.haicheriqi = haicheriqi;
	}
	
	/**
	 * 获取：还车日期
	 */
	public Date getHaicheriqi() {
		return haicheriqi;
	}
				
	
	/**
	 * 设置：租赁天数
	 */
	 
	public void setZulintianshu(String zulintianshu) {
		this.zulintianshu = zulintianshu;
	}
	
	/**
	 * 获取：租赁天数
	 */
	public String getZulintianshu() {
		return zulintianshu;
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
