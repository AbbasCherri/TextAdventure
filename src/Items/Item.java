package Items;

public class Item {
    private String itemName = "";
    private int itemPrice = 0;
    private int itemAmount = 0;

    public Item(String itemName, int itemPrice, int itemAmount) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemAmount = itemAmount;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemAmount() {
        return itemAmount;
    }
    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public boolean isPlaceHolder() {
        return itemName.isEmpty();
    }

    @Override
    public String toString() {
        return getItemName();
    }
}
