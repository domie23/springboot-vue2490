package com.dao;

import com.entity.DiandongchexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiandongchexinxiVO;
import com.entity.view.DiandongchexinxiView;


/**
 * 电动车信息
 * 
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
public interface DiandongchexinxiDao extends BaseMapper<DiandongchexinxiEntity> {
	
	List<DiandongchexinxiVO> selectListVO(@Param("ew") Wrapper<DiandongchexinxiEntity> wrapper);
	
	DiandongchexinxiVO selectVO(@Param("ew") Wrapper<DiandongchexinxiEntity> wrapper);
	
	List<DiandongchexinxiView> selectListView(@Param("ew") Wrapper<DiandongchexinxiEntity> wrapper);

	List<DiandongchexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiandongchexinxiEntity> wrapper);
	
	DiandongchexinxiView selectView(@Param("ew") Wrapper<DiandongchexinxiEntity> wrapper);
	

}
