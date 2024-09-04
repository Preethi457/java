public class sumofdigits {
public static void main(String[] args) {
int n=567;
int i,sum=0,digit;
for(i=0;i<=n;i++) {
digit=n%10;
sum=sum+digit;
n/=10;}
System.out.println(sum);

}
}