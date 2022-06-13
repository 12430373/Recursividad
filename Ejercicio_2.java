public class Ejercicio_2 {
        public static int mcd(int a, int b){

           if(a==0||b==0){
               return 0;
           }
           if (a==b){
               return a;
           }
           if(a>b){
               return mcd (a-b,b);
            }else{
               return mcd (a,b-a);
           }

        }

    public static void main(String[] args) {
        System.out.println(Ejercicio_2.mcd(190, 200));
    }

}

