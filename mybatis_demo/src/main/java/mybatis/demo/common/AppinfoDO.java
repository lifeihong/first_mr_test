package mybatis.demo.common;

import java.io.Serializable;
import java.util.Date;

/**
 * 测试对象创建
 *
 */
public class AppinfoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2531319268001021567L;
	/**
	 * 应用的appid,本系统生成
	 */
	private Long appId;

	/**
	 * memberid为alimama memberid
	 */
	private Long memberId;

	/**
	 * 应用名称
	 */
	private String appName;

	/**
	 * 应用首页
	 */
	private String homePage;
	/**
	 * 应用包名
	 */
	private String packageName;
	/**
	 * 发布的平台(iOS、android、wp) 1 iOS，2 android
	 */
	private Integer platform;
	/**
	 * 抄底跳转
	 */
	private Integer floorOpen;
	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 应用状态，0表示已删除的应用，1表示待验证的应用，2表示有效的应用
	 */
	private Integer status;
	//tanx应用的标示，根据这个id与tanx对应
	private Long siteId;
	//tanx应用审核和网站验证状态,按照位算，第一位是标示网站验证状态0标示待验证，1标示验证通过，第二位是tanx应用审核状态，0标示待审核，1标示审核通过。
	private Integer appSiteInfo;

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appid) {
		this.appId = appid;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberid) {
		this.memberId = memberid;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appname) {
		this.appName = appname;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homepage) {
		this.homePage = homepage;
	}
	
	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packagename) {
		this.packageName = packagename;
	}


	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmt_modified) {
		this.gmtModified = gmt_modified;
	}
	
	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmt_create) {
		this.gmtCreate = gmt_create;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getFloorOpen() {
		return floorOpen;
	}
	public void setFloorOpen(Integer flooropen) {
		this.floorOpen = flooropen;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer stateid) {
		this.status = stateid;
	}
	
	public Long getSiteId() {
		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	public Integer getAppSiteInfo() {
		return appSiteInfo;
	}

	public void setAppSiteInfo(Integer appSiteInfo) {
		this.appSiteInfo = appSiteInfo;
	}
}
