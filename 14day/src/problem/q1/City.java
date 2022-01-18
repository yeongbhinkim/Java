package problem.q1;

// �ǽ� 7.2: City.java
// ���ø� ��Ÿ����

import java.util.*;

public class City
{
	// ���� �̸�
    private String cityName;

    // ���� �α�
    private int population;

    // ������ �α� ������
    private double growthRate;

    // ���� �̸�, �α��� �α� �������� �о� ���δ�
    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);

		// ���� �̸���  �о� ���δ�
    	System.out.print("���� �̸��� �Է��ϼ���: ");
        cityName = keyboard.next();

        // ������ �α��� �о� ���δ�
        System.out.print("���� �α���? : ");
        population = keyboard.nextInt();
        // �α��� ������ ���� ��� �α��� �о� ���δ�
  			// ���⿡ �ڵ带 �����ϼ���
        while(population<0) {
        	System.out.print("������ �ȵǿ� �α��� �Է� :");
        	population = keyboard.nextInt();
        	
        }

        // ������ �α� �������� �о� ���δ�
  			// ���⿡ �ڵ带 �����ϼ���
        System.out.print("���� ������ �Է� : ");
        growthRate = keyboard.nextInt();
    }

    // ���� �̸�, �α��� �α� �������� ����Ѵ�
    public void writeOutput()
    {
  			// ���⿡ �ڵ带 �����ϼ���
    	System.out.println("���� �̸� : "+cityName+"�����α�"+population+"���� ������"+growthRate);
    }

    // �־��� ���� ���� ���� �α��� ����Ѵ�
    public int computeFuturePopulation(int years)
    {
		// ���� �α�
        double populationAmount = population;

        // ����
        int count = years;

        // �־��� ���� ���� ���� �α��� ����Ѵ�
  			// ���⿡ �ڵ带 �����ϼ���
        populationAmount = population* Math.pow((1+growthRate/100),years);
        return (int)populationAmount;
        
        // ���� �α��� ��ȯ�Ѵ�
  			// ���⿡ �ڵ带 �����ϼ���
    }

    // ���� �̸��� �־��� ������ �����Ѵ�
    public void setName(String newName)
    {
		cityName = newName;
	}

	// ���� �α��� �־��� ������ �����Ѵ�
	public void setPopulation(int newPopulation)
    {
  			// ���⿡ �ڵ带 �����ϼ���
		population = newPopulation;
    }

    // ���� �α� �������� �־��� ������ �����Ѵ�
    public void setGrowthRate(double newGrowthRate)
    {
  			// ���⿡ �ڵ带 �����ϼ���
    	growthRate = newGrowthRate;
	}

	// ���� �̸��� ��ȯ�Ѵ�
    public String getName()
    {
        return cityName;
    }

	// ���� �α��� ��ȯ�Ѵ�
    public int getPopulation()
    {
			return population;
  			// ���⿡ �ڵ带 �����ϼ���
    }

	// ���� �α� �������� ��ȯ�Ѵ�
    public double getGrowthRate()
    {
			return growthRate;
  			// ���⿡ �ڵ带 �����ϼ���
    }
}
