package com.kitry.array;

// Dto : Data Transfer Object
// Vo : Value Object
// Bean

public class PlayerDto {	
	private int number;
	private String name;
	private String positionName[] = {"지명타자", "투수", "포수", "1루수", "2루수", "3루수", "유격수", "좌익수", "중견수", "우익수"};
	private int position; //1번 2번, 3번..
	private double grade;
	
	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	} //이거 없없으면 player.number 등 일일히 쳤어야함
	
	
	@Override
	public String toString() {
		return "PlayerDto [등번호  = " + number + "\t선수명 = "  + name + "\t포지션 = " +positionName[position]+ "\t" +(position != 1 ? "타율" : "방어율") + grade + "]";
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
