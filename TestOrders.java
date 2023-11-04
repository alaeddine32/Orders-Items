import java.util.ArrayList;

public class TestOrders {
    public static void main (String[] args) {
        Item item1 = new Item () ;
        Item item2 = new Item () ;
        Item item3 = new Item () ;
        Item item4 = new Item () ;

        item1.setName("mocha");
        item2.setName("latte");
        item3.setName("drip coffee");
        item4.setName("capuccino");

        item1.setPrice(1);
        item2.setPrice(2);
        item3.setPrice(3);
        item4.setPrice(4);

        Order order1 = new Order() ;
        Order order2 = new Order() ;
        Order order3 = new Order() ;
        Order order4 = new Order() ;

        order1.setName("Cindhuri");
        order2.setName("Jimmy");
        order3.setName("Noah");
        order4.setName("Sam");


        ArrayList<Item> items1 = new ArrayList<Item>() ;
        items1.add(item1);
        order2.setItems(items1);
        order2.setTotal(order2.getTotal()+1);
        System.out.println(order2.getTotal());


        ArrayList<Item> items2 = new ArrayList<Item>() ;
        items2.add(item2) ;
        order3.setItems(items2);


        ArrayList<Item> items3 = new ArrayList<Item>() ;
        items3.add(item2);
        order4.setItems(items3);

        order1.setReady(true);

        items3.add(item2) ;
        items3.add(item2) ;
        order4.setItems(items3);
        System.out.println(order4.getItems());

        order2.setReady(true);

    }

}