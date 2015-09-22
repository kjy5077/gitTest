package ExceptionTest;

public class ExceptionMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionMall em = new ExceptionMall();
		
//		try {
			em.insert("상품");
			em.update("사과");
			em.delete("배");
//		} catch(FoolException e) {
//			System.out.println("FoolException!!");
//		}
		
	}
	
	public void insert(String text) {
		try {
			if("상품".equals(text)) {
				throw new FoolException();
			}
			System.out.println(text + "insert");
		} catch(FoolException e) {
			System.out.println("FoolException!!");
		}
	}
	
	public void update(String text) {
		
		try {
			if("상품".equals(text)) {
				throw new FoolException();
			}
			System.out.println(text + "update");
		} catch(FoolException e) {
			System.out.println("FoolException!!");
		}
	}
	
	public void delete(String text) {
		
		try {
			if("상품".equals(text)) {
				throw new FoolException();
			}
			System.out.println(text + "delete");
		} catch(FoolException e) {
			System.out.println("FoolException!!");
		}
	}

}
