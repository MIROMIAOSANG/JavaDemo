public class waterflowerNumber {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int sum=0;
            int a=i;
            while(a!=0){
                int b=a%10;
                sum=b*b*b+sum;
                a=a/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }


    }
}
