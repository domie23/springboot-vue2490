package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiandongchezulinDao;
import com.entity.DiandongchezulinEntity;
import com.service.DiandongchezulinService;
import com.entity.vo.DiandongchezulinVO;
import com.entity.view.DiandongchezulinView;

@Service("diandongchezulinService")
public class DiandongchezulinServiceImpl extends ServiceImpl<DiandongchezulinDao, DiandongchezulinEntity> implements DiandongchezulinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiandongchezulinEntity> page = this.selectPage(
                new Query<DiandongchezulinEntity>(params).getPage(),
                new EntityWrapper<DiandongchezulinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiandongchezulinEntity> wrapper) {
		  Page<DiandongchezulinView> page =new Query<DiandongchezulinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiandongchezulinVO> selectListVO(Wrapper<DiandongchezulinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiandongchezulinVO selectVO(Wrapper<DiandongchezulinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiandongchezulinView> selectListView(Wrapper<DiandongchezulinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiandongchezulinView selectView(Wrapper<DiandongchezulinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
