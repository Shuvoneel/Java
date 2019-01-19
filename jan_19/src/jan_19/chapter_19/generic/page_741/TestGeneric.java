package jan_19.chapter_19.generic.page_741;

public class TestGeneric {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Dhaka");
        stack1.push("Paris");

        System.out.println("Stack1:");
        System.out.println("Size = " + stack1.getSize());
        System.out.println("Peek = " + stack1.peek());
        System.out.println("Pop =" + stack1.pop());

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(10);
        stack2.push(11);
        stack2.push(12);

        System.out.println("");
        System.out.println("Stack2:");
        System.out.println("New Size = " + stack2.getSize());
        System.out.println("Peek = " + stack2.peek());
        System.out.println("Pop =" + stack2.pop());
    }
}
