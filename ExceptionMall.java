package ExceptionTest;

public class ExceptionMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionMall em = new ExceptionMall();
		
//		try {
			em.insert("��ǰ");
			em.update("����");
			em.delete("��");
//		} catch(FoolException e) {
//			System.out.println("FoolException!!");
//		}
		
	}
	
	public void insert(String text) {
		try {
			if("��ǰ".equals(text)) {
				throw new FoolException();
			}
			System.out.println(text + "insert");
		} catch(FoolException e) {
			System.out.println("FoolException!!");
		}
	}
	
	public void update(String text) {
		
		try {
			if("��ǰ".equals(text)) {
				throw new FoolException();
			}
			System.out.println(text + "update");
		} catch(FoolException e) {
			System.out.println("FoolException!!");
		}
	}
	
	public void delete(String text) {
		
		try {
			if("��ǰ".equals(text)) {
				throw new FoolException();
			}
			System.out.println(text + "delete");
		} catch(FoolException e) {
			System.out.println("FoolException!!");
		}
	}

}
