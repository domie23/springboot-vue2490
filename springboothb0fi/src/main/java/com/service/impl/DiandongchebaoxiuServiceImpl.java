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


import com.dao.DiandongchebaoxiuDao;
import com.entity.DiandongchebaoxiuEntity;
import com.service.DiandongchebaoxiuService;
import com.entity.vo.DiandongchebaoxiuVO;
import com.entity.view.DiandongchebaoxiuView;

@Service("diandongchebaoxiuService")
public class DiandongchebaoxiuServiceImpl extends ServiceImpl<DiandongchebaoxiuDao, DiandongchebaoxiuEntity> implements DiandongchebaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiandongchebaoxiuEntity> page = this.selectPage(
                new Query<DiandongchebaoxiuEntity>(params).getPage(),
                new EntityWrapper<DiandongchebaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiandongchebaoxiuEntity> wrapper) {
		  Page<DiandongchebaoxiuView> page =new Query<DiandongchebaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiandongchebaoxiuVO> selectListVO(Wrapper<DiandongchebaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiandongchebaoxiuVO selectVO(Wrapper<DiandongchebaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiandongchebaoxiuView> selectListView(Wrapper<DiandongchebaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiandongchebaoxiuView selectView(Wrapper<DiandongchebaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
