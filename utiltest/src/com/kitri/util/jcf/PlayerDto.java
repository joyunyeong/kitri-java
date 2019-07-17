package com.kitri.util.jcf;

public class PlayerDto {
	private int number;
	private String name;
	private int position;
	private double grade;
	private String positionName[] = {"����Ÿ��", "����", "����", "1���", "2���", "3���", "���ݼ�", "���ͼ�", "�߰߼�", "���ͼ�"};
	
	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PlayerDto [number=" + number + ", name=" + name + ", position=" + positionName[position] + ", grade=" + grade + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
