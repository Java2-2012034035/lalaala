package ����;

public class AutoCar implements OperateCar {

	 public void start(){
		 System.out.println("�ڵ��� ���");
	 }
	 public void stop(){
		 System.out.println("�ڵ��� ����");
	 }
	 public void setSpeed(int speed){
		 System.out.println("�ڵ����� �ӵ���" + speed + "km/h�� �ٲߴϴ�.");
     }
	 public void turn(int degree){
		 System.out.println("�ڵ����� ������"+ degree +"�� ��ŭ �ٲߴϴ�.");
	 }
}
