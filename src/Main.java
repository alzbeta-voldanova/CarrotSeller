import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Seller seller1 = new Seller();
        Seller seller2 = new Seller();

        seller1.name = "Lukas Zajic";
        seller1.dateOfBirth = LocalDate.of(1989, 10, 2);

        seller2.name = "Tom Celer";
        seller2.dateOfBirth = LocalDate.of(1975, 2, 11);


        System.out.println("Prodejce " + seller1.name + " se narodil " + seller1.dateOfBirth);
        System.out.println("Prodejce " + seller2.name + " se narodil " + seller2.dateOfBirth);
    }
}
