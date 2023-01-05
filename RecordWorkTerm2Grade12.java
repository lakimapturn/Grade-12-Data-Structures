import java.util.Arrays;

public class RecordWorkTerm2Grade12 {
    public static void main(String[] args) {
//        System.out.println(palindrome("THE BIRD IS HELLEH."));
//        Question1 q1 = new Question1(5);
//        q1.run();
        Question7 q7 = new Question7();
        q7.run();
    }

    public static boolean isPalindrome(String s) {
        String reversed = "";
        int len = s.length();

        for (int i = len-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        if (reversed.equals(s))
            return true;
        return false;
    }

    public static String palindrome(String s){
        int len = s.length();
        String output = "";
        char ch = s.charAt(len-1);

        s = s.toUpperCase();
//        Checking if a string ends correctly
        switch (ch) {
            case '.':
            case ',':
            case '!':
            case '?':
                break;
            default:
                return "INVALID INPUT";
        }

        s = s.substring(0, len-1);

//        Replacing extra spaces in the string
        while(s.indexOf("  ") != -1) {
            s.replace("  ", " ");
        }

        String words[] = s.split(" ");

        String backward = "";

        for (int i = 0; i < words.length; i++) {
            int wordLen = words[i].length();
            char last = words[i].charAt(wordLen-1);
            boolean consecutive = true;

            if (isPalindrome(words[i])) {
                output += words[i] + " ";
                continue;
            }

            for (int j = wordLen - 2; j >= 0; j--) {
                char c = words[i].charAt(j);
                if (consecutive && c == last) {
                    continue;
                } else {
                    consecutive = false;
                    backward += c;
                }
            }
            output += words[i] + backward + " ";
            backward = "";
        }

        return output;
    }

    public static class Question1 {
        int a[];
        int b[][];

        public Question1() {
            this.a = null;
            this.b = null;
        }

        public Question1(int N) {
            if(2 < N && N < 10) {
                this.a = new int[N];
                this.b = new int[N][N];
            }
        }

        public void run() {
            sortA();
            fillB();
            print2D(this.b);
            print2D(transpose());
        }

        private void sortA() {
            for(int i = 1, j; i< a.length; i++) {
                int temp = a[i];
                for(j = i-1; j>=0 && temp < a[j]; j--)
                    a[j+1] = a[j];
                a[j+1] = temp;
            }
        }

        private void printA() {
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + ", ");
            System.out.println();
        }

        private void fillB() {
            for(int i = 0; i< b.length; i++) {
                this.b[i] = Arrays.copyOf(this.a, this.a.length);
                for (int j = i, cnt = 0; j > 0; j--) {
                    b[i][b.length-j] = this.a[cnt++];
                }
            }
        }

        private void print2D(int arr[][]) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
                System.out.println();
            }
        }

        private int[][] transpose() {
            int output[][] = new int[b.length][b.length];

            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    output[j][i] = b[i][j];
                }
            }

            return output;
        }
    }

    public static class Question7 {
        public Question7() {
            System.out.println(isKaprekar(500501));
            twinPrimes(49);
        }

        private boolean isKaprekar(int num) {
             long square = (long) Math.pow(num, 2);
             if(square/10 == 0 && square == num)
                 return true;

             String sqr = String.valueOf(square);
             int len = sqr.length();

            for (int i = 1; i < len; i++) {
                long n1 = Long.parseLong(sqr.substring(0, i));
                long n2 = Long.parseLong(sqr.substring(i));
                if(n1 + n2 == num) return true;
            }
            return false;
        }
        private void twinPrimes(int num) {
            System.out.println("Number read in is: " + num);
            for (int f = 0, b = 0; ; f+=2, b-=2) {
                if(isPrime(num+f) && isPrime(num+f+2)) {
                    System.out.println("p1=" + (num+f)+ " " + "p2=" + (num+f+2));
                    return;
                } else if (isPrime(num+b) && isPrime(num+b+2)) {
                    System.out.println("p1=" + (num+b)+ " " + "p2=" + (num+b+2));
                    return;
                }
            }
        }

        private static boolean isPrime(int num) {
            int sqrt =(int) Math.sqrt(num);
            for (int i = 2; i <= sqrt; i++) {
                if(num%i==0) return false;
            }
              return true;
        }
    }

    public class CircularPrime {
        public CircularPrime(int num) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            isCircularPrime(sc.nextInt());
        }

        public boolean isCircularPrime(int num) {
            int digits = numDigits(num);
            int factor = Math.pow(10, digits);

            if(!isPrime(num)) return false;

            for(int i = 0; i<digits-1; i++) {
                int firstNum = num/factor;
                num-=firstNum*factor;
                num*=10 + firstNum;
                if(!isPrime(num)) return false;
            }

            return true;
        }

        public int numDigits(int num) {
            int cnt = 0;
            while(num>0) {
                cnt++;
                num/=10;
            }

            return cnt;
        }

        public boolean isPrime(int num) {
            if(num < 2) return false;

            for(int i = 2; i<=num/2; i++) {
                if(num%i == 0) return false;
            }

            return true;
        }
    }

    public boolean static isUniqueDigitInteger(int num) {
        String sNum = String.valueOf(num);
        for(int i = 0; i<sNum.length()-1; i++) {
            if(sNum.indexOf(sNum.chatAt(i)+1) != -1) return false;
        }
        return true;
    }
}
