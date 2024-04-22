package chart.semi.common;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTemplate {
	private MybatisTemplate() {}
	
	public static SqlSession getSqlSession(boolean autocommit) {
		SqlSession session = null;
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(inputStream);
			session = factory.openSession(autocommit);
			
			if(session != null) System.out.println("연결성공"); else System.out.println("연결실패!!!!!!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}
	
}





