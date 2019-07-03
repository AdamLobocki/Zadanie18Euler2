public class Euler2 {
    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
     int x =   euler2.calc(4000000);
        System.out.println(x);
    }
int calc( int max){
    int a = 1;
    int b = 2;
    int c = 3;
    int sum = 2;
    while (c < max){
        c = a +b;
        a = b;
        b = c;
        if (c %2 == 0){
           sum += c;
        }
    }
    return sum;
}


}
