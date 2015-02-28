package mybatis.demo.biz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mybatis.demo.common.AppinfoDO;
import mybatis.demo.common.MyBatisUtil;
import mybatis.demo.mapper.AppinfoMapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisDemoTest {
	static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    public static void main(String[] args) {
    	getAppinfoDO();
    	testAdd();
    	getAppName();
    	getAllAppName();
    }

    public static void testAdd() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
        	AppinfoMapper appinfoMapper = sqlSession.getMapper(AppinfoMapper.class);
            AppinfoDO appinfoDO = new AppinfoDO();
            appinfoDO.setMemberId(2000071006L);
            appinfoDO.setAppName("testMybatis");
            appinfoDO.setAppSiteInfo(3);
            appinfoDO.setFloorOpen(2);
            appinfoDO.setHomePage("http://testMybatis.com");
            appinfoDO.setPackageName("mybatis.com");
            appinfoDO.setPlatform(1);
            appinfoDO.setSiteId(1111L);
            appinfoDO.setStatus(2);
            appinfoMapper.insertAppinfoDO(appinfoDO);
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();//一定要有finally关闭
        }
    }

    public static void getAppinfoDO() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
        	AppinfoMapper appinfoMapper = sqlSession.getMapper(AppinfoMapper.class);
        	AppinfoDO appinfoDO = new AppinfoDO();
            appinfoDO.setMemberId(2000071006L);
        	List<AppinfoDO> appinfoDOList = appinfoMapper.getAppinfoDO(appinfoDO);
        	Iterator<AppinfoDO> test = appinfoDOList.iterator();
        	while(test.hasNext()){
        		System.out.println(test.next().getAppName());
        	}
        } finally {
            sqlSession.close();
        }
    }
    public static void getAppName() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
        	AppinfoMapper appinfoMapper = sqlSession.getMapper(AppinfoMapper.class);
        	String appName = appinfoMapper.getAppName(50L);
            System.out.println(appName);
        } finally {
            sqlSession.close();
        }
    }
    public static void getAllAppName() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
        	AppinfoMapper appinfoMapper = sqlSession.getMapper(AppinfoMapper.class);
        	AppinfoDO appinfoDO = new AppinfoDO();
            appinfoDO.setMemberId(2000071006L);
            List<String> appNameList = new ArrayList<String>();
        	appNameList = appinfoMapper.getAllAppName(appinfoDO);
           // System.out.println(appName);
        } finally {
            sqlSession.close();
        }
    }
}
