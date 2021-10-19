package series;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter size of input");
int n=sc.nextInt();
System.out.println("enter the input");
int arr[]=new int[n];
for(int i=0;i<n;i++)
 arr[i]=sc.nextInt();
int count=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0;
for(int i=0;i<n;i++) {
if(arr[i]%1 == 0) {
	count++;
}

if(arr[i]%2 == 0){
	count1++;
}
if(arr[i]%3 == 0){
	count2++;
}
if(arr[i]%4 == 0){
	count3++;
}
if(arr[i]%5 == 0){
	count4++;
}
if(arr[i]%6 == 0){
	count5++;
}
if(arr[i]%7 == 0){
	count6++;
}
if(arr[i]%8 == 0){
	count7++;
}
if(arr[i]%9 == 0){
	count8++;
}
}
System.out.print("1:"+count+",2:"+count1+",3:"+count2+",4:"+count3+",5:"+count4+",6:"+count5+",7:"+count6+",8:"+count7+",9:"+count8);

	}
}
