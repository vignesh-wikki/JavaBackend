package Day19.CompletableFuture;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Order {
    private String itemName;
    private int id;

    public Order(String itemName, int id) {
        this.itemName = itemName;
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public int getId() {
        return id;
    }

}

public class CompletableFutureEx {
    public static void main(String[] args) {

        CompletableFuture<List<User>> fetchUser;
        fetchUser = CompletableFuture.supplyAsync(() -> {
            List<User> users = Arrays.asList(new User("Vignesh", 1), new User("Wikki", 2), new User("Shivan", 3));
            try {
                System.out.println("Going to sleep: " + Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("Started: " + Thread.currentThread().getName());
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            return users;
        });
        CompletableFuture<List<Order>> fetchOrder = CompletableFuture.supplyAsync(() -> {
            List<Order> orders = Arrays.asList(new Order("Briyani", 101), new Order("Dosa", 102),
                    new Order("Idli", 103));
            try {
                System.out.println("Going to sleep: " + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("Started: " + Thread.currentThread().getName());
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            return orders;
        });
        CompletableFuture<String> result = fetchUser.thenCombine(fetchOrder, (o1, o2) -> {
            StringBuilder data = new StringBuilder();
            Iterator<User> users = o1.iterator();
            Iterator<Order> orders = o2.iterator();
            while (users.hasNext() && orders.hasNext())
                data.append("User: ").append(users.next().getName()).append(" Order: ")
                        .append(orders.next().getItemName()).append(", ");

            return data.toString();
        });

        System.out.println(result.join());
    }
}
