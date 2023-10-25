package tk.mybatis.simple.model;

import java.sql.Date;

public class SysRole {
	/*
	 * 角色ID
	 */
	private Long id;
	
	/*
	 * 角色名
	 */
	private String roleName;
	
	/*
	 * 有效标志
	 */
	private int enabled;
	
	/*
	 * 创建人
	 */
	private Long createBy;
	
	/*
	 * 创建时间
	 */
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
/*
( id  bigint not null auto_increment comment '角色ID',
role_name  varchar(50) comment '角色名',
enabled int comment '有效标志',
create_by bigint comment '创建人',
create_time datetime comment '创建时间',
*/