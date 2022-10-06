package com.valtech.training.corejava.day4;

public enum GenderEnum {
	MALE(1),FEMALE(-1),OTHERS(0);

	private GenderEnum(int value)
	{
		this.value=value;
	}
	private int value;
	
	public int getValue()
	{
		return value;
	}

	public static void main(String[] args) {
		//forEach loop can be used when even our class implements Iterable
		for(GenderEnum g:GenderEnum.values()) {
			System.out.println(g+" "+g.getValue());
		}
		System.out.println(GenderEnum.MALE);
	}

}
