import java.util.Scanner;
public class amstrong {
public static void main(String[] args) {
int n=0,rem,res=0,i;
int originial=n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++){
rem=n%10;
res+=rem*rem*rem;
n=n/10;
}
System.out.println(res);
if(res==originial){
System.out.println("amstrong");
}
else{
System.out.println("not a amstrong");
}
}