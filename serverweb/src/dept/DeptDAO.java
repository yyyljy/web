package dept;

import java.util.ArrayList;

public interface DeptDAO {
	ArrayList<DeptDTO> getDeptList();
	int insert(DeptDTO dept);//������
	int delete(String deptno);
}
