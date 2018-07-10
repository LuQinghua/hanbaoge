package com.jiabian.solr;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;

public class test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws SolrServerException 
	 */
	public static void main(String[] args) throws SolrServerException, IOException {

		String baseURL = "http://114.55.252.3:8180/solr";
	        SolrServer server = new HttpSolrServer(baseURL);  
	        SolrInputDocument doc = new SolrInputDocument();  
	        doc.addField("name", "我爱中国");  
	        doc.addField("addr", "中关村大街");  
	        doc.addField("manu", "汉语");  
	        doc.addField("cat", "cat is cat dog horse");  
	        doc.addField("lei", "cat is cat dog horse");  
	        doc.addField("id", "2001");  
	        server.add(doc);  
	        server.commit();  
	}

}
