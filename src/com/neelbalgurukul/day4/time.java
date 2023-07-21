package com.neelbalgurukul.day4;
class Time{
	private int hr;
	private int min;
	private int sec;
}
	Time(){
		
	}
	Time(int Hours,int Minutes,int Seconds){
		hr=Hours;
		min=Minutes;
		sec=Seconds;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public
	
	public String toString() {
		return "Hour"+hr+"Minutes"+min+"Seconds"+sec;
	}
public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time x = new Time(12,30,25);
		Time y = new Time(19,20,35);
		Time z = x.add(y);
		String timeMessage1=x.convertIn12Hours();
		String timeMessage2=y,convertIn12Hours();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(TimeMassage1);
		System.out.println(TimeMassage1);
		
		
		

	}

}
