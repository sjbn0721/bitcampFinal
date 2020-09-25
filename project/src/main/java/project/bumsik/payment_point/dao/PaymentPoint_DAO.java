package project.bumsik.payment_point.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import project.bumsik.payment_point.vo.PaymentPoint_VO;

public interface PaymentPoint_DAO {
	public List<PaymentPoint_VO> searchList(Map<String, Object> searchMap) throws DataAccessException;
}
