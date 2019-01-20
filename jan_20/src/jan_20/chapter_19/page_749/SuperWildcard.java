package jan_20.chapter_19.page_749;


public class SuperWildcard {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("java");
        stack2.push(2);
        stack1.push("sun");
        add(stack1, stack2);
        print(stack2);
    }

//    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
//        while (!stack1.isEmpty()) {
//            stack2.push(stack1.pop());
//        }
//    }
    
    public static <T> void add(GenericStack<? extends T> stack1, GenericStack<T> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public static void print(GenericStack<?> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }

}
