import java.util.ArrayList;
import java.util.List;

public class Exo2 {
    // Classe OrderItem
    public static class OrderItem {
        private final int id; // Identifiant de l'article
        private final String description; // Description de l'article
        private final int quantity; // Quantité commandée de l'article
        private final double unitPrice; // Prix unitaire de l'article

        public OrderItem(int id, String description, int quantity, double unitPrice) {
            this.id = id;
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double getTotal() {
            return unitPrice * quantity; // Calcul du prix total de l'article (quantité * prix unitaire)
        }

        @Override
        public String toString() {
            return "OrderItem{" +
                    "id=" + id +
                    ", description='" + description + '\'' +
                    ", quantity=" + quantity +
                    ", unitPrice=" + unitPrice +
                    '}';
        }
    }
    // Classe OrderItemTest
    public static class OrderItemTest {
        public static void main(String[] args) {
            // Création des instances de OrderItem avec des valeurs spécifiques
            OrderItem item1 = new OrderItem(1, "Article 1", 2, 10.0);
            OrderItem item2 = new OrderItem(2, "Article 2", 3, 15.0);

            // Affichage des informations sur les OrderItem
            System.out.println(item1);
            System.out.println("Total for item 1: " + item1.getTotal());

            System.out.println(item2);
            System.out.println("Total for item 2: " + item2.getTotal());
        }
    }
// Classe Order
    public static class Order {
        private final String clientName; // Nom du client
        private final List<OrderItem> orderItems; // Liste des articles dans la commande

        public Order(String clientName) {
            this.clientName = clientName;
            this.orderItems = new ArrayList<>(); // Initialisation de la liste des articles
        }

        public void addItem(OrderItem item) {
            orderItems.add(item); // Ajout d'un article à la commande
        }

        public double calculateTotal() {
            double total = 0.0;
            for (OrderItem item : orderItems) {
                total += item.getTotal(); // Calcul du total en ajoutant le prix total de chaque article
            }
            return total; // Retourne le total de la commande
        }
    }
    // Classe OrderTest
    public static class OrderTest {
        public static void main(String[] args) {
            // Création d'une instance de Order avec le nom du client
            Order order = new Order("John Doe");

            // Création des instances de OrderItem avec des valeurs spécifiques
            OrderItem item1 = new OrderItem(1, "Article 1", 2, 10.0);
            OrderItem item2 = new OrderItem(2, "Article 2", 3, 15.0);

            // Ajout des OrderItem à la commande
            order.addItem(item1);
            order.addItem(item2);

            // Calcul et affichage du total de la commande
            System.out.println("Order total: " + order.calculateTotal());
        }
    }

}
