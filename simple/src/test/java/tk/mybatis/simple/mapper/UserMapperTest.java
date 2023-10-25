package tk.mybatis.simple.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysRoleExtend;
import tk.mybatis.simple.model.SysUser;

public class UserMapperTest extends BaseMapperTest {

	@Test
	public void testSelectById() {
		//获取sqlSession
		SqlSession sqlSession = getSqlSession();
		try {
			//获取UserMapper接口
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//调用selectById方法，查询 id=1 的用户
			SysUser user = userMapper.selectById(1L);
			//user 不为空
			Assert.assertNotNull(user);
			//userName = admin
			Assert.assertEquals("admin", user.getUserName());
		} finally {
			//不要忘记关闭sqlSession
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectAll() {
		SqlSession sqlSession = getSqlSession();
		try {
			//获取UserMapper接口
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//调用selectAll方法，查询所有用户
			List<SysUser> userList = userMapper.selectAll();
			//结果 不为空
			Assert.assertNotNull(userList);
			//用户数量大于0个
			Assert.assertTrue(userList.size() > 0);
		} finally {
			//不要忘记关闭sqlSession
			sqlSession.close();
		}
	}

	@Test
	public void testSelectRolesByUserId() {
		//获取sqlSession
		SqlSession sqlSession = getSqlSession();
		try {
			//获取UserMapper接口
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//调用selectById方法，查询 id=1 的用户
			List<SysRole> roleList = userMapper.selectRolesByUserId(1L);
			//user 不为空
			Assert.assertNotNull(roleList);
			//userName = admin
			Assert.assertTrue(roleList.size() > 0);
		} finally {
			//不要忘记关闭sqlSession
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectRoleExtendsByUserId() {
		//获取sqlSession
		SqlSession sqlSession = getSqlSession();
		try {
			//获取UserMapper接口
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			//调用selectById方法，查询 id=1 的用户
			List<SysRoleExtend> roleExtendList = userMapper.selectRoleExtendsByUserId(1L);
			//user 不为空
			Assert.assertNotNull(roleExtendList);
			//userName = admin
			Assert.assertTrue(roleExtendList.size() > 0);
		} finally {
			//不要忘记关闭sqlSession
			sqlSession.close();
		}
	}
}
