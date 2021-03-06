package project.sungho.group_module.service;

import java.util.List;
import java.util.Map;

public interface Group_Service {
	
	public void insertGroup(Map<String, Object> inputMap);
	public List<Map<String, Object>> selectWholeGroup();
	public Map<String, Object> selectOneGroup(Map<String, Object> inputMap);
	public List<Map<String, Object>> selectMyGroup();
	public void insertGroupMember(Map<String, Object> inputMap);
	public Map<String,Object> checkMemberState(Map<String,Object> inputMap) throws Exception;
	public List<Map<String,Object>> selectGroupBoardList(Map<String,Object> inputMap);
	public Map<String,Object> selectGroupMemberList(Map<String,Object> inputMap);
	public void yieldManager(Map<String, Object> inputMap);
	public void deportUser(Map<String, Object> inputMap);
	public void applyUser(Map<String, Object> inputMap);
	public String signUpCafe(Map<String, Object> inputMap);
	public void insertArticle(Map<String,Object> inputMap);
	public boolean authorityCheck(Map<String, Object> inputMap, String ...strings);
	public void updateGroup(Map<String,Object> inputMap);
}
