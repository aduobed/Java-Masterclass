package bom;

public class Futures extends Product{
    private String exchange, contractCode;
    private int month, year;

    public Futures(String id, String exchange, String contractCode, int month, int year) {
        super(id);
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
