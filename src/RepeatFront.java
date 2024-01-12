import com.sun.source.tree.DoWhileLoopTree;

public class RepeatFront {

        public static void main(String [] args) {
            RepeatFront chocolate = new RepeatFront();
            String output = chocolate.repeatFrontFor("Chocolate", 3);
            System.out.println(output);

            String output2 = chocolate.repeatFrontWhile("Chocolate", 4);
            System.out.println(output2);

            RepeatFront icecream = new RepeatFront();
            String output3 = icecream.repeatFrontDoWhile("Ice Cream", 2);
            System.out.println(output3);

        }

        public String repeatFrontFor(String str, int n) {
            String newString = "";
            for (int i = n; i > 0; i--) {
                newString += str.substring(0, i);
            }
            return newString;
        }

        public String repeatFrontWhile(String str, int n) {
            String newString = "";
            while (n > 0) {
                newString += str.substring(0, n);
                n = n - 1;
            }
            return newString;
        }

        public String repeatFrontDoWhile(String str, int n) {
            String newString = "";
            do {
                newString += str.substring(0, n);
                n = n - 1;
            } while(n > 0);
            return newString;

        }

}
