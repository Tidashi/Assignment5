public class InClass {
    public static void main(String args[]){

    }
    static void removeVowels(char[] a) {

        for(int i = 0; i < a.length; i ++){
            switch (a[i]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                default:
                    System.out.println(a[i]);

            }
        }
    }

}
