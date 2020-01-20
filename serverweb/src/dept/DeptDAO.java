package dept;

import java.util.ArrayList;

public interface DeptDAO {
	ArrayList<DeptDTO> getDeptList();
	DeptDTO read(String deptNo);
	int insert(DeptDTO dept);//사원등록
	int delete(String deptno);
}
