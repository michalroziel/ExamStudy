package innerClasses;
public class OuterClass {
    public int x = 0;

    class InnerClass {
        public int x = 1;

        void print(int x) {
            System.out.println(x);           // 2 - This prints the local variable x passed as a parameter
            System.out.println(this.x);      // 1 - This prints the instance variable x of InnerClass
            System.out.println(OuterClass.this.x); // 0 - This prints the instance variable x of OuterClass
        }
    }

    public static void main(String[]     args) {
        OuterClass.InnerClass ic = new OuterClass().new InnerClass();
        ic.print(2); // Pass 2 as the argument to the print method
    }
}