package com.jiabian.dada;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.dada.Address;
import com.jiabian.beans.basic.dada.DadaNews;
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

public interface IDadaService {

	Homepage getHomepageInfo();

	Integer updateHomepageInfo(Homepage homepage);
	
	//============================================================================================================

	PagesModel<DadaNewsReq, DadaNewsRes> selectDadaNews(PagesModel<DadaNewsReq, DadaNewsRes> pagesModel);

	Integer insertNews(DadaNewsReq dadaNewsReq);

	Integer deleteNews(DadaNewsReq dadaNewsReq);

	DadaNews selectDadaNewsById(Long id);

	Integer updateDadaNews(DadaNewsReq dadaNewsReq);

	Integer delBatchDadaNews(List<Long> ids);

	//============================================================================================================

	PagesModel<DadaUserReq, DadaUserRes> selectDadaUsers(PagesModel<DadaUserReq, DadaUserRes> pagesModel);
	
	PagesModel<DadaUserReq, DadaUserRes> selectDadaUsersByCondition(String condition, PagesModel<DadaUserReq, DadaUserRes> pagesModel);

	DadaUser selectDadaUser(Long id);
	
	//============================================================================================================
	
	List<Address> selectAddressById(Long id);
	
	//============================================================================================================
	
	PagesModel<AwardReq, AwardRes> selectAwardById(Long id, PagesModel<AwardReq, AwardRes> pagesModel);

	//============================================================================================================
	
	PagesModel<ScoreReq, ScoreRes> selectScoreById(Long id, PagesModel<ScoreReq, ScoreRes> pagesModel);
	
	//============================================================================================================

	List<Gift> selectGifts();

	Integer deleteGift(Long id);

	Integer insertGift(Gift gift);

	Integer updateGift(Gift gift);

	Gift selectGiftById(Long id);
	
}
