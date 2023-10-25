package tk.mybatis.simple.model;

public class SysRolePrivilege {

	/*
	 * 角色ID
	 */
	private Long roleId;
	
	/*
	 * 权限ID
	 */
	private Long privilegeId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}
}
/*
create table sys_role_privilege
 ( role_id bigint comment '角色ID',
   privilege_id bigint comment '权限ID'
   );
*/