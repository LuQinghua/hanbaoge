package com.jiabian.versionapp.request;

import java.util.Date;

import com.jiabian.base.BaseReq;
import com.jiabian.base.io.request.IRequest;

public class VersionAppReq extends BaseReq implements IRequest{

	
	 private Long id;
	    /**
	     * �汾����
	     */
	    private String versionDesc;
	    /**
	     * �汾��
	     */
	    private String versionNo;
	    /**
	     * ���ͣ�1���黭��2��������3���̳���
	     */
	    private Byte type;
	    /**
	     * �汾url
	     */
	    private String versionUrl;
	    /**
	     * ��Դ   1��Android  2��ios
	     */
	    private Byte source;
	    /**
	     * �Ƿ�ɾ��  1����  2��ɾ��
	     */
	    private Byte isDel;
	    /**
	     * ����ʱ��
	     */
	    private Date createTime;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getVersionDesc() {
			return versionDesc;
		}
		public void setVersionDesc(String versionDesc) {
			this.versionDesc = versionDesc;
		}
		public String getVersionNo() {
			return versionNo;
		}
		public void setVersionNo(String versionNo) {
			this.versionNo = versionNo;
		}
		public Byte getType() {
			return type;
		}
		public void setType(Byte type) {
			this.type = type;
		}
		public String getVersionUrl() {
			return versionUrl;
		}
		public void setVersionUrl(String versionUrl) {
			this.versionUrl = versionUrl;
		}
		public Byte getSource() {
			return source;
		}
		public void setSource(Byte source) {
			this.source = source;
		}
		public Byte getIsDel() {
			return isDel;
		}
		public void setIsDel(Byte isDel) {
			this.isDel = isDel;
		}
		public Date getCreateTime() {
			return createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
	    
}
