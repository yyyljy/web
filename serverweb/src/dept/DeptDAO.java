package dept;

import java.util.ArrayList;

public interface DeptDAO {
	ArrayList<DeptDTO> getDeptList();
	int insert(DeptDTO dept);//사원등록
	int delete(String deptno);
}
