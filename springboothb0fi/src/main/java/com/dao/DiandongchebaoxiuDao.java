package com.dao;

import com.entity.DiandongchebaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiandongchebaoxiuVO;
import com.entity.view.DiandongchebaoxiuView;


/**
 * 电动车报修
 * 
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
public interface DiandongchebaoxiuDao extends BaseMapper<DiandongchebaoxiuEntity> {
	
	List<DiandongchebaoxiuVO> selectListVO(@Param("ew") Wrapper<DiandongchebaoxiuEntity> wrapper);
	
	DiandongchebaoxiuVO selectVO(@Param("ew") Wrapper<DiandongchebaoxiuEntity> wrapper);
	
	List<DiandongchebaoxiuView> selectListView(@Param("ew") Wrapper<DiandongchebaoxiuEntity> wrapper);

	List<DiandongchebaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<DiandongchebaoxiuEntity> wrapper);
	
	DiandongchebaoxiuView selectView(@Param("ew") Wrapper<DiandongchebaoxiuEntity> wrapper);
	

}
