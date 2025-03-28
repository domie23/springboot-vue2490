package com.entity.model;

import com.entity.DiandongchexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电动车信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
public class DiandongchexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
