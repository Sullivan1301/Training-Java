public class Exo3 {
    // Classe Author
    public static class Author {
        private final String name; // Nom de l'auteur
        private final String email; // Adresse e-mail de l'auteur
        private final char gender; // Sexe de l'auteur ('M' ou 'F')

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        // Méthode toString pour afficher les informations de l'auteur
        @Override
        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public String getName() {
            return name;
        }
    }
    // Classe Book
    public static class Book {
        private final String title; // Titre du livre
        private final Author author; // Auteur du livre
        private final double price; // Prix du livre
        private final int quantity; // Quantité en stock

        public Book(String title, Author author, double price, int quantity) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.quantity = quantity;
        }

        // Méthode pour vérifier si le livre est en rupture de stock
        public boolean isOutOfStock() {
            return quantity == 0;
        }

        // Méthode toString pour afficher les informations du livre
        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author=" + author +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    '}';
        }

        // Méthode pour accéder au nom de l'auteur du livre
        public String getAuthorName() {
            return author.getName();
        }
        /*
        public boolean isThereAStock(){
        return this.stock > 0  };   */
   }
    // Classe BookTest
    public static class BookTest {
        public static void main(String[] args) {
            // Création d'une instance de Author
            Author author = new Author("John Smith", "john.smith@example.com", 'M');

            // Création d'une instance de Book avec l'auteur
            Book book = new Book("The Book", author, 19.99, 5);

            // Affichage des informations du livre
            System.out.println(book);

            // Accès au nom de l'auteur depuis l'instance de Book
            System.out.println("Author name: " + book.getAuthorName());
        }
    }
    // Classe Customer
    public static class Customer {
        private final String lastName; // Nom du client
        private final String phoneNumber; // Numéro de téléphone du client
        private final String email; // Adresse e-mail du client
        private final String dateOfBirth; // Date de naissance du client
        private final String address; // Adresse du client

        public Customer(String firstName, String lastName, String phoneNumber, String email, String dateOfBirth, String address) {
            // Prénom du client
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.dateOfBirth = dateOfBirth;
            this.address = address;
        }
    }
    // Classe Account
    public static class Account {
        private Customer customer; // Propriétaire du compte
        private double balance; // Solde du compte

        public Account(int accountNumber, Customer customer) {
            // Numéro de compte
        }
    }
}
