package com.kitry.array;

// Dto : Data Transfer Object
// Vo : Value Object
// Bean

public class PlayerDto {	
	private int number;
	private String name;
	private String positionName[] = {"����Ÿ��", "����", "����", "1���", "2���", "3���", "���ݼ�", "���ͼ�", "�߰߼�", "���ͼ�"};
	private int position; //1�� 2��, 3��..
	private double grade;
	
	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	} //�̰� �������� player.number �� ������ �ƾ����
	
	
	@Override
	public String toString() {
		return "PlayerDto [���ȣ  = " + number + "\t������ = "  + name + "\t������ = " +positionName[position]+ "\t" +(position != 1 ? "Ÿ��" : "�����") + grade + "]";
	}


	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
}
