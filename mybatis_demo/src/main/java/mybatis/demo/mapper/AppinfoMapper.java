package mybatis.demo.mapper;

import java.util.List;

import mybatis.demo.common.AppinfoDO;
//相当于之前的dao接口，这个接口必选与mapper的id一样，这样绑定省去了之前的dao的实现层
public interface AppinfoMapper {
	public void insertAppinfoDO(AppinfoDO appinfoDO);

    public List<AppinfoDO> getAppinfoDO(AppinfoDO appinfoDO);
    public String getAppName(Long appId);
    public List<String> getAllAppName(AppinfoDO appinfoDO);
}
