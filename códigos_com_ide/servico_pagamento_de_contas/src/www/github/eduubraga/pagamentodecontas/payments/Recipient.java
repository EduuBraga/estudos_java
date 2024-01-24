package www.github.eduubraga.pagamentodecontas.payments;

public class Recipient {
    private String name;
    private String keyPix;
    private String bankAccount;

    public Recipient(String name, String keyPix, String bankAccount) {
        this.name = name;
        this.keyPix = keyPix;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyPix() {
        return keyPix;
    }

    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean itHasKeyPix () {
        return getKeyPix() != null && getKeyPix().isEmpty();
    }

    public boolean itHasBankAccount () {
        return getBankAccount() != null && getBankAccount().isEmpty();
    }
}
