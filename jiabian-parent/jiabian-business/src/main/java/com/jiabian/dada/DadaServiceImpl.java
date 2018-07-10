package com.jiabian.dada;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.dada.Address;
import com.jiabian.beans.basic.dada.AddressQueryHelper;
import com.jiabian.beans.basic.dada.DadaNews;
import com.jiabian.beans.basic.dada.DadaNewsQueryHelper;
import com.jiabian.beans.basic.dada.DadaNewsQueryHelper.Criteria;
import com.jiabian.beans.basic.dada.DadaUser;
import com.jiabian.beans.basic.dada.Gift;
import com.jiabian.beans.basic.dada.Homepage;
import com.jiabian.dada.request.AwardReq;
import com.jiabian.dada.request.DadaNewsReq;
import com.jiabian.dada.request.DadaUserReq;
import com.jiabian.dada.request.ScoreReq;
import com.jiabian.dada.response.AwardRes;
import com.jiabian.dada.response.DadaNewsRes;
import com.jiabian.dada.response.DadaUserRes;
import com.jiabian.dada.response.ScoreRes;
import com.jiabian.dao.basic.dada.AddressMapper;
import com.jiabian.dao.basic.dada.AwardMapper;
import com.jiabian.dao.basic.dada.DadaNewsMapper;
import com.jiabian.dao.basic.dada.DadaUserMapper;
import com.jiabian.dao.basic.dada.GiftMapper;
import com.jiabian.dao.basic.dada.HomepageMapper;
import com.jiabian.dao.basic.dada.ScoreMapper;
import com.jiabian.util.SpringBeanUtils;

@Service
public class DadaServiceImpl implements IDadaService {
	
	@Autowired
	private HomepageMapper homepageMapper;
	
	@Autowired
	private DadaNewsMapper dadaNewsMapper;
	
	@Autowired
	private DadaUserMapper dadaUserMapper;
	
	@Autowired
	private AddressMapper addressMapper;
	
	@Autowired
	private AwardMapper awardMapper;
	
	@Autowired
	private ScoreMapper scoreMapper;
	
	@Autowired
	private GiftMapper giftMapper;

	@Override
	public Homepage getHomepageInfo() {
		return homepageMapper.selectByExample(null).get(0);
	}

	@Override
	public Integer updateHomepageInfo(Homepage homepage) {
		return homepageMapper.updateByPrimaryKeySelective(homepage);
	}
	
	//============================================================================================================
	
	@Override
	public PagesModel<DadaNewsReq, DadaNewsRes> selectDadaNews(PagesModel<DadaNewsReq, DadaNewsRes> pagesModel) {
		pagesModel.setTotal(dadaNewsMapper.countDadaNews(pagesModel));
		pagesModel.setResults(dadaNewsMapper.selectDadaNews(pagesModel));
		return pagesModel;
	}

	@Override
	public Integer insertNews(DadaNewsReq dadaNewsReq) {
		dadaNewsReq.setTime(new Date());
		DadaNews dadaNews = new DadaNews();
		SpringBeanUtils.copyProperties(dadaNewsReq, dadaNews);
		return dadaNewsMapper.insertSelective(dadaNews);
	}

	@Override
	public Integer deleteNews(DadaNewsReq dadaNewsReq) {
		return dadaNewsMapper.deleteDadaNews(dadaNewsReq.getId());
	}

	@Override
	public DadaNews selectDadaNewsById(Long id) {
		return dadaNewsMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateDadaNews(DadaNewsReq dadaNewsReq) {
		DadaNews dadaNews = new DadaNews();
		SpringBeanUtils.copyProperties(dadaNewsReq, dadaNews);
		return dadaNewsMapper.updateByPrimaryKeySelective(dadaNews);
	}

	@Override
	public Integer delBatchDadaNews(List<Long> ids) {
		DadaNewsQueryHelper helper = new DadaNewsQueryHelper();
		Criteria criteria = helper.createCriteria();
		criteria.andIdIn(ids);
		return dadaNewsMapper.deleteByExample(helper);
	}

	//============================================================================================================
	
	@Override
	public PagesModel<DadaUserReq, DadaUserRes> selectDadaUsers(PagesModel<DadaUserReq, DadaUserRes> pagesModel) {
		pagesModel.setTotal(dadaUserMapper.countDadaUsers(pagesModel));
		pagesModel.setResults(dadaUserMapper.selectDadaUsers(pagesModel));
		return pagesModel;
	}

	@Override
	public DadaUser selectDadaUser(Long id) {
		return dadaUserMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public PagesModel<DadaUserReq, DadaUserRes> selectDadaUsersByCondition(String condition,
			PagesModel<DadaUserReq, DadaUserRes> pagesModel) {
		pagesModel.setTotal(dadaUserMapper.countDadaUsersByCondition(condition, pagesModel));
		pagesModel.setResults(dadaUserMapper.selectDadaUsersByCondition(condition, pagesModel));
		return pagesModel;
	}
	
	//============================================================================================================
	
	@Override
	public List<Address> selectAddressById(Long id) {
		AddressQueryHelper helper = new AddressQueryHelper();
		com.jiabian.beans.basic.dada.AddressQueryHelper.Criteria criteria = helper.createCriteria();
		criteria.andUseridEqualTo(id);
		return addressMapper.selectByExample(helper);
	}
	
	//============================================================================================================
	
	@Override
	public PagesModel<AwardReq, AwardRes> selectAwardById(Long id, PagesModel<AwardReq, AwardRes> pagesModel) {
		pagesModel.setTotal(awardMapper.countAwardById(pagesModel, id));
		pagesModel.setResults(awardMapper.selectAwardById(pagesModel, id));
		return pagesModel;
	}
	
	//============================================================================================================
	
	@Override
	public PagesModel<ScoreReq, ScoreRes> selectScoreById(Long id, PagesModel<ScoreReq, ScoreRes> pagesModel) {
		pagesModel.setTotal(scoreMapper.countScoreById(pagesModel, id));
		pagesModel.setResults(scoreMapper.selectScoreById(pagesModel, id));
		return pagesModel;
	}

	//============================================================================================================
	
	@Override
	public List<Gift> selectGifts() {
		return giftMapper.selectByExample(null);
	}

	@Override
	public Integer deleteGift(Long id) {
		return giftMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer insertGift(Gift gift) {
		return giftMapper.insertSelective(gift);
	}

	@Override
	public Integer updateGift(Gift gift) {
		return giftMapper.updateByPrimaryKeySelective(gift);
	}

	@Override
	public Gift selectGiftById(Long id) {
		return giftMapper.selectByPrimaryKey(id);
	}
	
}

