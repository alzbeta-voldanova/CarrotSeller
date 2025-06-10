import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Seller seller1 = new Seller();
        Seller seller2 = new Seller();

//        seller1.name = "Lukas Zajic";
//        seller1.dateOfBirth = LocalDate.of(1989, 10, 2);
//
//        seller2.name = "Tom Celer";
//        seller2.dateOfBirth = LocalDate.of(1975, 2, 11);

        seller1.setName("Lukas Zajic");
        seller1.setDateOfBirth(LocalDate.of(1989, 10, 2));

        seller2.setName("Tom Celer");
        seller2.setDateOfBirth(LocalDate.of(1975, 2, 11));



        System.out.println("Prodejce " + seller1.getName() + " se narodil " + seller1.getDateOfBirth());
        System.out.println("Prodejce " + seller2.getName() + " se narodil " + seller2.getDateOfBirth());
    }
}
