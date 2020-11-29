package action.responsibilitychain;

/**
 * @Author yucheng
 * @Date 2020/11/29 17:22
 */
public class Request {

    private String name;

    private Integer amount;

    public Request(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
