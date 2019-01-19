package jan_19.chapter_19.generic.page_741;

public class GenericBosta {

    public static void main(String[] args) {
        GenericStack<Bosta> bostaList = new GenericStack<>();
        System.out.println("Size =" + bostaList.getSize());
        
        bostaList.push(new Bosta(100, "50 KG"));
        bostaList.push(new Bosta(110, "100 KG"));
        bostaList.push(new Bosta(120, "150 KG"));
        System.out.println("New Size =" + bostaList.getSize());
        System.out.println("Peek =" + bostaList.peek());
        System.out.println("Pop =" + bostaList.pop());
        System.out.println(bostaList.isEmpty());
        System.out.println(bostaList.toString());
    }
}
