package io.renren.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import io.renren.dao.MwsSellerDao;
import io.renren.entity.MwsSellerEntity;
import io.renren.service.MwsSellerService;



@Service("mwsSellerService")
public class MwsSellerServiceImpl implements MwsSellerService {
	@Autowired
	private MwsSellerDao mwsSellerDao;
	
	@Override
	public MwsSellerEntity queryObject(String id){
		return mwsSellerDao.queryObject(id);
	}
	
	@Override
	public List<MwsSellerEntity> queryList(Map<String, Object> map){
		return mwsSellerDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return mwsSellerDao.queryTotal(map);
	}
	
	@Override
	public void save(MwsSellerEntity mwsSeller){
		mwsSellerDao.save(mwsSeller);
	}
	
	@Override
	public void update(MwsSellerEntity mwsSeller){
		mwsSellerDao.update(mwsSeller);
	}
	
	@Override
	public void delete(String id){
		mwsSellerDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		mwsSellerDao.deleteBatch(ids);
	}
	
}
