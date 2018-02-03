 /*Given an array find the largest 'span'
 (span is the number of elements between two same digits)
find their sum.*/

import java.util.Scanner;


public class arrays9 {
public static void main(String[] args) {
int a[]={1,4,2,1,4,1,5};
largestSpan(a);
}
public static void largestSpan(int[] a) {
int max=0;
int p1=0;
int p2=0;
int n=0;
int sum=0;
for(int i=0;i<a.length-1;i++){
for(int j=i+1;j<a.length;j++)
if(a[i]==a[j])
{
if(j-i>max){
max=j-i;
}
}
}
System.out.println("largest span:"+max);
}}