package problem.q1;

// �ǽ� 7.2: City.java
// ���ø� ��Ÿ����

import java.util.*;

public class City2 {
	// ���� �̸�
	private String cityName;

	// ���� �α�
	private int population;

	// ������ �α� ������
	private double growthRate;

	// ���� �̸�, �α��� �α� �������� �о� ���δ�
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);

		// ���� �̸��� �о� ���δ�
		System.out.print("���� �̸��� �Է��ϼ���: ");
		cityName = keyboard.next();

		// ������ �α��� �о� ���δ�
		System.out.print("���� �α���? : ");
		population = keyboard.nextInt();
		// �α��� ������ ���� ��� �α��� �о� ���δ�
		// ���⿡ �ڵ带 �����ϼ���
		while (population < 0) {
			System.out.print("������ �ȵǿ� �α��� �Է� :");
			population = keyboard.nextInt();

		}

		// ������ �α� �������� �о� ���δ�
		// ���⿡ �ڵ带 �����ϼ���
		System.out.print("���� ������ �Է� : ");
		growthRate = keyboard.nextInt();
	}

	// ���� �̸�, �α��� �α� �������� ����Ѵ�
	public void writeOutput() {
		// ���⿡ �ڵ带 �����ϼ���
		System.out.println("���� �̸� : " + cityName 
		+ "�����α�" + population + "���� ������" + growthRate);
	}

	// �־��� ���� ���� ���� �α��� ����Ѵ�
	public int computeFuturePopulation(int years) {
		// ���� �α�
		double populationAmount = population;

		// ����
		int count = years;

		// �־��� ���� ���� ���� �α��� ����Ѵ�
		// ���⿡ �ڵ带 �����ϼ���
		populationAmount = population * Math.pow((1 + growthRate / 100), years);
//        while((count>0)&& (populationAmount>0)) {
//        	populationAmount = (populationAmount + (growthRate/100)*populationAmount);
//        	count--;
//        }
		// ���� �α��� ��ȯ�Ѵ�
		// ���⿡ �ڵ带 �����ϼ���
		return (int) populationAmount;
//        if(populationAmount > 0)
//        	return (int)populationAmount;
//        else
//        	return 0;

	}

	// ���� �̸��� �־��� ������ �����Ѵ�
	public void setName(String newName) {
		cityName = newName;
	}

	// ���� �α��� �־��� ������ �����Ѵ�
	public void setPopulation(int newPopulation) {
		// ���⿡ �ڵ带 �����ϼ���
		population = newPopulation;
	}

	// ���� �α� �������� �־��� ������ �����Ѵ�
	public void setGrowthRate(double newGrowthRate) {
		// ���⿡ �ڵ带 �����ϼ���
		growthRate = newGrowthRate;
	}

	// ���� �̸��� ��ȯ�Ѵ�
	public String getName() {
		return cityName;
	}

	// ���� �α��� ��ȯ�Ѵ�
	public int getPopulation() {
		// ���⿡ �ڵ带 �����ϼ���
		return population;
	}

	// ���� �α� �������� ��ȯ�Ѵ�
	public double getGrowthRate() {
		// ���⿡ �ڵ带 �����ϼ���
		return growthRate;
	}
}
