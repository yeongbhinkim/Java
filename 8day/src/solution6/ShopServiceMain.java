package solution6;

public class ShopServiceMain {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstaqnce();
		ShopService obj2 = ShopService.getInstaqnce();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
	}

}
