package dept;

import java.util.ArrayList;

public interface DeptDAO {
	ArrayList<DeptDTO> getDeptList();
	DeptDTO read(String deptNo);
	int insert(DeptDTO dept);//������
	int delete(String deptno);
}
