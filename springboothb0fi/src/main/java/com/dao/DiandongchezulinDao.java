package com.dao;

import com.entity.DiandongchezulinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiandongchezulinVO;
import com.entity.view.DiandongchezulinView;


/**
 * 电动车租赁
 * 
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
public interface DiandongchezulinDao extends BaseMapper<DiandongchezulinEntity> {
	
	List<DiandongchezulinVO> selectListVO(@Param("ew") Wrapper<DiandongchezulinEntity> wrapper);
	
	DiandongchezulinVO selectVO(@Param("ew") Wrapper<DiandongchezulinEntity> wrapper);
	
	List<DiandongchezulinView> selectListView(@Param("ew") Wrapper<DiandongchezulinEntity> wrapper);

	List<DiandongchezulinView> selectListView(Pagination page,@Param("ew") Wrapper<DiandongchezulinEntity> wrapper);
	
	DiandongchezulinView selectView(@Param("ew") Wrapper<DiandongchezulinEntity> wrapper);
	

}
