package basic;
//�����Ͻ� ����
public class CalcLogic {
	public int calc(int num1, String method, int num2) {
		System.out.println("�����Ͻ� ���� ȣ��...");
		int result=0;
		switch(method) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/": 
			result = num1/num2;
			break;
		default:
			result = -1;
			break;
		}
		return result;
	}
}
