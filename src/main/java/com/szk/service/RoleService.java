package com.szk.service;

import java.util.List;

import com.szk.vo.Role;

public interface RoleService {

	/**
	 * ��ӵ�����ɫ
	 * @param role
	 * @return
	 */
	public int insertRole(Role role);
	
	/**
	 * ��Ӷ����ɫ
	 * @param roleList
	 * @return
	 */
	public int insertRoleList(List<Role> roleList);
	
}
