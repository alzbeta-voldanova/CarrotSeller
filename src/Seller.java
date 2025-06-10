import java.time.LocalDate;

public class Seller {

    String name;
    LocalDate dateOfBirth;
    int signedContractsCount;
    double carrotSalesInTons;
    boolean isSeniorSeller;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSignedContractsCount() {
        return signedContractsCount;
    }

    public void setSignedContractsCount(int signedContractsCount) {
        this.signedContractsCount = signedContractsCount;
    }

    public double getCarrotSalesInTons() {
        return carrotSalesInTons;
    }

    public void setCarrotSalesInTons(double carrotSalesInTons) {
        this.carrotSalesInTons = carrotSalesInTons;
    }

    public boolean isSeniorSeller() {
        return isSeniorSeller;
    }

    public void setSeniorSeller(boolean seniorSeller) {
        isSeniorSeller = seniorSeller;
    }
}
