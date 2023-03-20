package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Book {
    public static void main(String[] args) {
        HashMap<Integer,Book> map = new HashMap<>();
        Book b1 = new Book(101,"Let us C","Yeshwznth","MTG",8);
        Book b2 = new Book(102,"Let us JAVA","Dewang","MTG",6);
        Book b3 = new Book(103,"Let us Python","Takur","MTG",7);

        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        for (Map.Entry <Integer,Book> m : map.entrySet()){
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println(key+"  "+"Details");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
//            System.out.println(m.getKey()+"  "+m.getValue());
        }

    }
}

class  Book{
    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id,String name,String author, String publisher, int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}
