public class ProductWarehouseWithHistory extends ProductWarehouse {
    //private Double initialBalance;
    private ChangeHistory newHistory;
    //private Double balance;
    

    public ProductWarehouseWithHistory(String productName,double capacity, double initialBalance){
        super(productName, capacity);
        //this.initialBa = initialBalance;
        //this.balance = initialBalance;
        super.addToWarehouse(initialBalance);
        this.newHistory = new ChangeHistory();
        this.newHistory.add(initialBalance);
    }
    public String history(){
        return this.newHistory.toString();
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.newHistory.add(getBalance());
        //if(amount < 0.0){
        //    return;//this.balance;
        //}
        //this.balance+=amount;
        /*if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount+100;
        } else {
            this.balance = getCapacity();
        }
        this.newHistory.add(this.balance);*/
    }
    //}
    public double takeFromWarehouse(double amount){
        this.newHistory.add(this.getBalance()-amount);
        return super.takeFromWarehouse(amount);

    }

    public void printAnalysis(){
        System.out.println("Product: "+getName());
        System.out.println("History: "+this.newHistory);
        System.out.println("Largest amount of product: "+this.newHistory.maxValue());
        System.out.println("Smallest amount of product: "+this.newHistory.minValue());
        System.out.println("Average: "+this.newHistory.average());
    }
}
