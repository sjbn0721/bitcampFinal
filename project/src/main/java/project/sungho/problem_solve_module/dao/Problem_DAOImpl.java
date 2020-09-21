package project.sungho.problem_solve_module.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import project.sungho.problem_solve_module.vo.ProblemExample_VO;
import project.sungho.problem_solve_module.vo.Problem_VO;

@Repository("problem_DAO") 
public class Problem_DAOImpl implements Problem_DAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Problem_VO> searchList(Map<String, Object> searchMap) throws DataAccessException {
		List<Problem_VO> list = sqlSession.selectList("pr.problem_solve.searchList", searchMap);
		return list;
	}

	@Override
	public List<Problem_VO> searchListCategory(Map<String, Object> searchMap) throws DataAccessException {
		List<Problem_VO> list = sqlSession.selectList("pr.problem_solve.searchListCategory", searchMap);
		return list;
	}

	@Override
	public List<Problem_VO> searchProblem(Map<String, Object> searchMap) throws DataAccessException {
		List<Problem_VO> list = sqlSession.selectList("pr.problem_solve.searchProblem", searchMap);
		return list;
	}

	@Override
	public List<ProblemExample_VO> searchExample(Map<String, Object> searchMap) throws DataAccessException {
		
		List<Problem_VO> list = sqlSession.selectList("pr.problem_solve.searchProblem", searchMap);
		
		return null;
	}
	

}