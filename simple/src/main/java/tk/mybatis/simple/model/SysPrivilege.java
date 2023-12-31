package tk.mybatis.simple.model;

public class SysPrivilege {

	/*
	 * 权限ID
	 */
	private Long id;
	
	/*
	 * 权限名称
	 */
	private String privilegeName;
	
	/*
	 * 权限URL
	 */
	private String privilegeUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public String getPrivilegeUrl() {
		return privilegeUrl;
	}

	public void setPrivilegeUrl(String privilegeUrl) {
		this.privilegeUrl = privilegeUrl;
	}
}
/*
create table sys_privilege
( id  bigint not null auto_increment comment '权限ID',
  privilege_name varchar(50) comment '权限名称',
  privilege_url varchar(200) comment '权限URL',
  primary key (id)
);
*/