package solution6;
/*
 * �̱��� ������ ���� : ���󼼰迡 ������ ��ü�� �����ϰ��� �ϴ� ������ ����
 * ���ٹ���ũ����� public - protected - default -private
 */
public class ShopService {
	//private : �ܺο��� ���� �������� ���ϵ�����
	//static  : ���α׷��� ���۵Ǳ����� �ʱ�ȭ�ϱ� ����
	
	//�ٸ������� �������� ���ϰ� ��ü���ο��� ����
	private static ShopService ShopService = new ShopService();
	
	//private : �ܺο��� �����ڸ� ȣ������ ���ϵ��� �տ� private�� ���δ�.
	private ShopService() {
	}
	//public : �ܺο��� ���ο� �����Ȱ�ü�� ���������ϱ� ����
	//static :1.Ŭ����(����)����ʵ带 �����ؾ���.
	//				2.��ü �������� getInstaqnce()�� �ܺο��� ȣ���� �� �ְ� �ϱ�����.
	public static ShopService getInstaqnce() {
		return ShopService;
	}
}