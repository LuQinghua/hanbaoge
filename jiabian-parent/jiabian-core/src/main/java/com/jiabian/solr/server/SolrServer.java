package com.jiabian.solr.server;



public class SolrServer {/*

	private static final Logger logger = LogManager.getLogger(SolrServer.class.getName());

	private static CloudSolrClient solrClient;
	private static  String zkHost=GlobalParameter.SOLR_URL;
	private static  List<String> zkHosts;
	private static final String defaultCollection = "maike";
	private static final int zkClientTimeout = 20000;
	private static final int zkConnectTimeout = 20000;
	private static final String FL = "id,catId,goodsSn,goodsName,clickCount,brandId,marketPrice,shopPrice,"
			+ "promotePrice,promoteStartDate,promoteEndDate,goodsImg,originalImg,isReal,isOnSale,isAloneSale,"
			+ "isShipping,addTime,sortOrder,isBest,isNew,isHot,isPromote,isDisplay, fictitousStatus,brandName,brandLogo,goodsBrief,storageName,storageLogo";
	*//**
	 * 高亮
	 *//*
	private boolean HighQuery = false;
	
	public static String escapeQueryChars(String s) {  
	    StringBuilder sb = new StringBuilder();  
	    for (int i = 0; i < s.length(); i++) {  
	      char c = s.charAt(i);  
	      // These characters are part of the query syntax and must be escaped  
	      if (c == '\\' || c == '+' || c == '-' || c == '!'  || c == '(' || c == ')' || c == ':'  
	        || c == '^' || c == '[' || c == ']' || c == '\"' || c == '{' || c == '}' || c == '~'  
	        || c == '*' || c == '?' || c == '|' || c == '&'  || c == ';' || c == '/'  
	        || Character.isWhitespace(c)) {  
	        sb.append('\\');  
	      }  
	      sb.append(c);  
	    }  j
	    return sb.toString();  
	  }  
	

	*//**
	 * 方法名: getCloudSolrClient
	* 方法描述: 获取云solr对象
	* 修改时间：2016年6月30日 上午10:07:19 
	* 参数 @param zkHost
	* 参数 @return 参数说明
	* 返回类型 CloudSolrClient 返回类型
	* @throws
	 *//*
	private static synchronized CloudSolrClient getCloudSolrClient(
			final String zkHost) {
		if (solrClient == null) {
			try {
				solrClient = new CloudSolrClient(zkHost);
				System.out.println("The Cloud SolrServer Instance has benn created!"); 
				solrClient.setDefaultCollection(defaultCollection); 
				solrClient.setZkClientTimeout(zkClientTimeout); 
				solrClient.setZkConnectTimeout(zkConnectTimeout); 
				solrClient.connect(); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return solrClient;
	}
	
	
	*//**
	 * 方法名: getCloudSolrClient
	* 方法描述: 获取云solr对象
	* 修改时间：2016年6月30日 上午10:07:38 
	* 参数 @param zkHosts
	* 参数 @param chroot
	* 参数 @return 参数说明
	* 返回类型 CloudSolrClient 返回类型
	* @throws
	 *//*
	private static synchronized CloudSolrClient getCloudSolrClient(
			final List<String> zkHosts,final String chroot) {
		if (solrClient == null) {
			try {
				solrClient = new CloudSolrClient(zkHosts,chroot);
				System.out.println("The Cloud SolrServer Instance has benn created!"); 
				solrClient.setDefaultCollection(defaultCollection); 
				solrClient.setZkClientTimeout(zkClientTimeout); 
				solrClient.setZkConnectTimeout(zkConnectTimeout); 
				solrClient.connect(); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return solrClient;
	}
	
	
	
	
	public SolrjServer() {
		this.getCloudSolrClient(zkHost);
	}
	
	public SolrjServer(String zkHost) {
		this.getCloudSolrClient(zkHost);
		
	}

	public SolrjServer(List<String> zkHosts,String chroot) {
		 this.getCloudSolrClient(zkHosts,chroot);
		}


	
	 * 方法名: close
	* 方法描述:  关闭solr链接
	* 修改时间：2016年6月30日 上午10:08:05 
	* 参数  参数说明
	* 返回类型 void 返回类型
	* @throws
	 
	public void close(){
		try {
			if(null!=solrClient)
			solrClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	*//**
	 * @method: spellcheck
	 * @Description: 智能提示 Solr里叫做Suggest模块
	 *//*
	public  List<Map<String, Long>> suggest(String word) {
		List<Map<String, Long>> wordList = new ArrayList<Map<String, Long>>();
		try {
			SolrQuery params = new SolrQuery();  
	        params.set("q", "*:*");  
	        params.set("qt", "/terms");  
	  
	        // parameters settings for terms requesthandler  
	        // 参考（refer to）http://wiki.apache.org/solr/termscomponent  
	        params.set("terms", "true");  
	        params.set("terms.fl", "goodsName");  
	          
	        //指定下限  
//	      params.set("terms.lower", ""); // term lower bounder开始的字符  
//	      params.set("terms.lower.incl", "true");  
//	      params.set("terms.mincount", "1");  
//	      params.set("terms.maxcount", "100");  
	  
//	       http://localhost:8983/solr/terms?terms.fl=text&terms.prefix=学 //  
//	       using for auto-completing   //自动完成  
//	      params.set("terms.prefix", "联");  
	         params.set("terms.regex", word+"+.*");  
	         params.set("terms.regex.flag", "case_insensitive");  
//	        
//	       params.set("terms.limit", "20");  
//	       params.set("terms.upper", ""); //结束的字符  
//	       params.set("terms.upper.incl", "false");  
//	        
//	       params.set("terms.raw", "true");  
	  
	        params.set("terms.sort", "count");//terms.sort={count|index} -如果count，各种各样的条款术语的频率（最高计数第一）。 如果index，索引顺序返回条款。默认是count  
	           
			QueryResponse response = solrClient.query(params);

			 // 获取相关的查询结果  
	        if (response != null) {  
	            TermsResponse termsResponse = response.getTermsResponse();  
	            if (termsResponse != null) {  
	                Map<String, List<TermsResponse.Term>> termsMap = termsResponse.getTermMap();  
	                for (Map.Entry<String, List<TermsResponse.Term>> termsEntry : termsMap.entrySet()) {  
//	                  System.out.println("Field Name: " + termsEntry.getKey());  
	                    List<TermsResponse.Term> termList = termsEntry.getValue();  
	                    for (TermsResponse.Term term : termList) {  
	                    	Map<String, Long> map = new HashMap<String, Long>();
	                    	map.put(term.getTerm(), term.getFrequency());
	                    	wordList.add(map);
	                        System.out.println(term.getTerm() + " : "+ term.getFrequency());  
	                    }  
	                }  
	            }  
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wordList;
	}
	
	*//**
	 * 方法名: search
	* 方法描述:查询
	* 修改时间：2016年6月30日 上午10:21:18 
	* 参数 @param record
	* 参数 @param solrQueryString 参数说明
	* 返回类型 void 返回类型
	* @throws
	 *//*
	public void searchRecommend(BaseSolrModel<BaseGood> record) {
		//设置过滤条件
		this.setFQ(record);
		//设置查询条件
		this.setQuery(record);
		SolrQuery parameters = new SolrQuery();
		parameters.set("q", record.getQuery());
		parameters.set("fq", record.getfQuery()+" and !originalImg:''");
		parameters.set("qt", "/select");
		parameters.set("fl",FL);
		if (StringUtil.isNotBlank(record.getCollectionName()))
			parameters.set("collection", record.getCollectionName());
		parameters.setStart(-1 == record.getLimitStart() ? 0 : record
				.getLimitStart());
		parameters.setRows(record.getLimitNum());
		// 排序
		if(null != record.getOrderBy())
		parameters.set("sort", record.getOrderBy());
		
		// 判断是否开启字段统计
		QueryResponse response;
		try {
			response = solrClient.query(parameters);
			// 获得标签个数
			if (null != response.getFacetFields()) {
				record.setFacetList(response.getFacetFields());
			}
			record.setRangeList(response.getFacetRanges()) ;
			SolrDocumentList docs = response.getResults();
			record.setResults(getSolrRecommendGoodResult(docs));

		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	*//**
	 * 方法名: getSolrResult
	* 方法描述: 搜索结果处理
	* 修改时间：2016年6月30日 上午10:21:37 
	* 参数 @param docs
	* 参数 @return 参数说明
	* 返回类型 ArrayList<HashMap<String,String>> 返回类型
	* @throws
	 *//*
	public ArrayList<BaseGood> getSolrRecommendGoodResult(SolrDocumentList docs) {
		ArrayList<BaseGood> resultList = new ArrayList<BaseGood>();
		for (SolrDocument doc : docs) {
			RecommendGood good ;//=new BaseGood();
			//good.setId(doc.get("id").toString());
			try {
				good = (RecommendGood) BeanToMapUtil.convertMap(RecommendGood.class, doc);
				//good.setGoodsImg(GlobalParameter.VISITPATH+good.getGoodsImg());
				resultList.add(good);
			} catch (IllegalAccessException e) {
				logger.error("", e);
			} catch (InstantiationException e) {
				logger.error("", e);
			} catch (InvocationTargetException e) {
				logger.error("", e);
			} catch (IntrospectionException e) {
				logger.error("", e);
			}
			
		}
		return resultList;
	}
	
	*//**
	 * 方法名: search
	* 方法描述:查询
	* 修改时间：2016年6月30日 上午10:21:18 
	* 参数 @param record
	* 参数 @param solrQueryString 参数说明
	* 返回类型 void 返回类型
	* @throws
	 *//*
	public void search(BaseSolrModel<BaseGood> record) {
		//设置过滤条件
		this.setFQ(record);
		//设置查询条件
		this.setQuery(record);
		SolrQuery parameters = new SolrQuery();
		parameters.set("q", record.getQuery());
		parameters.set("fq", record.getfQuery());
		parameters.set("qt", "/browse");
		//parameters.set("fl",FL);
		if (StringUtil.isNotBlank(record.getCollectionName()))
			parameters.set("collection", record.getCollectionName());
		parameters.setStart(-1 == record.getLimitStart() ? 0 : record
				.getLimitStart());
		parameters.setRows(record.getLimitNum());
		// 排序
		if(null != record.getOrderBy())
		parameters.set("sort", record.getOrderBy());
		if(1==record.getCurrentPage()){
		parameters.setFacet(true);
		//parameters.setFacetMinCount(1);
		//parameters.addFacetField(record.getFacetField());
		//parameters.addFacetField("shopPrice");
		//parameters.setF
		parameters.setFacetLimit(1000);
		}
		// 判断是否开启字段统计
		QueryResponse response;
		try {
			response = solrClient.query(parameters);
			// 获得标签个数
			if (null != response.getFacetFields()) {
				record.setFacetList(response.getFacetFields());
			}
			record.setRangeList(response.getFacetRanges()) ;
			SolrDocumentList docs = response.getResults();
			//List<BaseGood> tmpLists = response.getBeans(BaseGood.class);
			//record.setResults(tmpLists);
			record.setTotal((int) docs.getNumFound());
			logger.debug("商品个数：" + docs.getNumFound());
			logger.debug("查询时间：" + response.getQTime());
			record.setResults(getSolrResult(docs));

		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	 * 方法名: getFacetList
	* 方法描述: 获取统计数据
	* 修改时间：2016年7月1日 下午1:47:15 
	* 参数 @param record
	* 参数 @return 参数说明
	* 返回类型 List<FacetField> 返回类型
	* @throws
	 
	public  List<FacetField> getFacetList(BaseSolrModel<BaseGood>record){
		//设置过滤条件
		this.setFQ(record);
		//设置查询条件
		this.setQuery(record);
		SolrQuery parameters = new SolrQuery();
		parameters.set("q", record.getQuery());
		parameters.set("fq", record.getfQuery());
		parameters.set("qt", "/select");
		parameters.setStart(0);
		parameters.setRows(1);
		parameters.setFacet(true);
		parameters.setFacetMinCount(1);
		parameters.addFacetField(record.getFacetField());
		parameters.setFacetLimit(1000);
		QueryResponse response;
		try {
			response = solrClient.query(parameters);
			//获得节点个数
			List<FacetField> facetList = response.getFacetFields();
			return facetList;
		} catch (SolrServerException e) {
			logger.error("", e);
		} catch (IOException e) {
			logger.error("", e);
		}
		return null;
		
	}
	
	private void setQuery(BaseSolrModel<BaseGood> record){
		StringBuffer query = new StringBuffer();
		if(StringUtil.isBlank(record.getModel().getGoodsName())){
			query.append("*:*");
		}else{
			query.append("text:");
			query.append(escapeQueryChars(record.getModel().getGoodsName()));
		}
		record.setQuery(query.toString());
		
	}
	
	
	 * 方法名: getFQ
	* 方法描述: 过滤语句
	* 修改时间：2016年6月30日 下午3:52:59 
	* 参数 @param record
	* 参数 @return 参数说明
	* 返回类型 String 返回类型
	* @throws
	 
	private void setFQ(BaseSolrModel<BaseGood> record){
		Map<String,String> map = new HashMap<String,String>();
		if (StringUtil.isNotBlank(record.getModel().getCatId())) {
			map.put("catId", record.getModel().getCatId());
		}
		if (StringUtil.isNotBlank(record.getModel().getBrandId())) {
			map.put("brandId", record.getModel().getBrandId());
		}
		if (StringUtil.isNotBlank(record.getModel().getBrandName())) {
			map.put("brandName","(" +escapeQueryChars(record.getModel().getBrandName()).replaceAll(",", " OR ")+")");
		}
		if (StringUtil.isNotBlank(record.getModel().getIsOnSale())) {
			map.put("isOnSale", record.getModel().getIsOnSale());
		}
		if (StringUtil.isNotBlank(record.getModel().getIsShipping())) {
			map.put("isShipping", record.getModel().getIsShipping());
		}
		if (StringUtil.isNotBlank(record.getModel().getIsNew())) {
			map.put("isNew", record.getModel().getIsNew());
		}
		if (StringUtil.isNotBlank(record.getModel().getIsBest())) {
			map.put("isBest", record.getModel().getIsBest());
		}
		if (StringUtil.isNotBlank(record.getModel().getIsHot())) {
			map.put("isHot", record.getModel().getIsHot());
		}
		if (StringUtil.isNotBlank(record.getModel().getIsDisplay())) {
			map.put("isDisplay", record.getModel().getIsDisplay());
		}
		if (StringUtil.isNotBlank(record.getModel().getCountryId())) {
			map.put("countryId", record.getModel().getCountryId());
		}
		if (StringUtil.isNotBlank(record.getModel().getShopPrice())) {
			String[] shopPrices=record.getModel().getShopPrice().split("-");
			if(shopPrices.length==2){
				map.put("shopPrice","["+ StringUtil.parseInt(shopPrices[0])*100+" TO " +StringUtil.parseInt(shopPrices[1])*100+"]");
			}
		}
		record.setfQuery(getFQ(map));

	}
	
	 * 方法名: getFQ
	* 方法描述: 过滤语句
	* 修改时间：2016年6月30日 下午3:54:14 
	* 参数 @param map
	* 参数 @return 参数说明
	* 返回类型 String 返回类型
	* @throws
	 
	private String getFQ(Map<String,String> map){
		StringBuffer fq = new StringBuffer();
		int i=0;
		 for (String key : map.keySet()) {
			// fq.append("(");
			 fq.append(key);
			 fq.append(":");
			 fq.append(map.get(key));
			// fq.append(")");
			 i++;
			 if(i<map.keySet().size()){
				 fq.append(" AND ");
			 }
		 }
		return fq.toString();
	}
	
	*//**
	 * 方法名: getSolrResult
	* 方法描述: 搜索结果处理
	* 修改时间：2016年6月30日 上午10:21:37 
	* 参数 @param docs
	* 参数 @return 参数说明
	* 返回类型 ArrayList<HashMap<String,String>> 返回类型
	* @throws
	 *//*
	public ArrayList<BaseGood> getSolrResult(SolrDocumentList docs) {
		ArrayList<BaseGood> resultList = new ArrayList<BaseGood>();
		for (SolrDocument doc : docs) {
			BaseGood good ;//=new BaseGood();
			//good.setId(doc.get("id").toString());
			try {
				good = (BaseGood) BeanToMapUtil.convertMap(BaseGood.class, doc);
				//good.setGoodsImg(GlobalParameter.VISITPATH+good.getGoodsImg());
				resultList.add(good);
			} catch (IllegalAccessException e) {
				logger.error("", e);
			} catch (InstantiationException e) {
				logger.error("", e);
			} catch (InvocationTargetException e) {
				logger.error("", e);
			} catch (IntrospectionException e) {
				logger.error("", e);
			}
			
		}
		return resultList;
	}

	*//**
	 * 方法名: deleteAllIndex
	* 方法描述: 删除所有索引
	* 修改时间：2016年6月30日 上午10:27:35 
	* 参数 @param collection 参数说明
	* 返回类型 void 返回类型
	* @throws
	 *//*
	public void deleteAllIndex(String collection) {
		try {
			solrClient.deleteByQuery(collection, "*:*");// delete everything!
			solrClient.commit(collection);
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	        
	
	
	*//**
	 * 方法名: deleteIndex
	* 方法描述: 删除知识索引
	* 修改时间：2016年6月30日 上午10:28:05 
	* 参数 @param collection
	* 参数 @param ids 参数说明
	* 返回类型 void 返回类型
	* @throws
	 *//*
	 public void deleteIndex(String collection,List<String> ids) {
		 try {
			 solrClient.deleteById(collection,ids);
			 solrClient.commit(collection);
		  } catch (Exception e) {
		         e.printStackTrace();
		  }
	 }
	
	
	 *//**
	  * 方法名: buildIndex
	 * 方法描述: 增量/全量建立索引
	 * 修改时间：2016年6月30日 上午10:28:22 
	 * 参数 @param collection
	 * 参数 @param delta 参数说明
	 * 返回类型 void 返回类型
	 * @throws
	  *//*
	public static void buildIndex(String collection, boolean delta) {
		SolrQuery query = new SolrQuery();
		query.setRequestHandler("/dataimport");
		String command = delta ? "delta-import" : "full-import";
		String clean = delta ? "false" : "true";
		String optimize = delta ? "false" : "true";
		query.setParam("command", command).setParam("clean", clean)
				.setParam("commit", "true").setParam("collection", collection)
				// .setParam("entity", "article")
				.setParam("optimize", optimize);
		try {
			solrClient.query(query);
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


*/}
