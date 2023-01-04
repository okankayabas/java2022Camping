package rInterfaces;

public class OracleCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void Add() {
		System.out.println("Oracle eklendi");
	}

	@Override
	public void delete() {
		System.out.println("Oracle silindi");
	}

}
