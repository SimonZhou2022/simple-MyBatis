package tk.mybatis.simple.mapper;

import java.util.List;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysRoleExtend;
import tk.mybatis.simple.model.SysUser;

public interface UserMapper {

	SysUser selectById(Long id);
	
	/**
	 * 查询全部用户
	 * @return
	 */
	List<SysUser> selectAll();
	
	/**
	 * 根据用户 id 获取角色信息
	 */
	List<SysRole> selectRolesByUserId(Long userId);
	
	List<SysRoleExtend> selectRoleExtendsByUserId(Long userId);
	
}
