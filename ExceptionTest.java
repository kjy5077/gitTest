package ExceptionTest;

public class ExceptionTest {
	
	public void sayNick(String nick) throws FoolException {
//		try {
			if("fool".equals(nick)) {
				throw new FoolException();
			}
			System.out.println("����� �г�����" + nick + "�Դϴ�");
//		} catch(FoolException e) {
//			System.err.println("FoolException!!");
//		}
	}
	
	public static void main(String args[]) {
		ExceptionTest ex = new ExceptionTest();
		
		try {
			ex.sayNick("fool");
			ex.sayNick("nick");
		} catch(FoolException e) {
			System.out.println("FoolException!!");
		}
	}
	
}
