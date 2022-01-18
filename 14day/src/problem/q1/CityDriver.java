package problem.q1;

// �ǽ� 7.2: CityDriver.java
// City ��ü�� ����� �̿��Ѵ�

import java.util.*;

public class CityDriver {
	public static void main(String[] args) {
		// City ��ü ���� ����
		City aCity;

		// ���� �α�
		int newPopulation;

		// ����
		int years = 10;

		Scanner keyboard = new Scanner(System.in);

		// ��� ����
		boolean again = true;

		// ����ڰ� ����ϱ⸦ ���ϴ� ���� ������ 10�� �� ���� �α��� ����Ѵ�
		while (again) {
			// City ��ü�� �����ϰ� aCity�� ����Ű�� �Ѵ�
			// ���⿡ �ڵ带 �����ϼ���
			aCity = new City();

			// aCity�� ���� �̸�, �α��� �α� �������� �о� ���δ�
			// ���⿡ �ڵ带 �����ϼ���
			aCity.readInput();

			// aCity�� ���� �̸�, �α��� �α� �������� ����Ѵ�
			// ���⿡ �ڵ带 �����ϼ���
			aCity.writeOutput();
			// aCity�� 10�� �� �α��� ����Ѵ�
			// ���⿡ �ڵ带 �����ϼ���
			newPopulation = aCity.computeFuturePopulation(years);
			// aCity�� ���� �α��� ����Ѵ�
			// ���⿡ �ڵ带 �����ϼ���
			System.out.print("10�� �� �����α� : " + newPopulation);
			// ��� ���θ� �Է� �޴´�
			System.out.print("����ϱ�?(true, false)? : ");
			// ���⿡ �ڵ带 �����ϼ���
			again = keyboard.nextBoolean();
		}
	}
}