import java.util.ArrayList;
public class ChangeHistory {
    //private double status;
    //private ArrayList<String> prueba;
    private ArrayList<Double> prodHistory;
    //private double max;
    //private double min;
    //private double avg;
    public ChangeHistory(){
        this.prodHistory = new ArrayList<>();
        //this.prueba = new ArrayList<>();
    }

    public void add(double status){
        this.prodHistory.add(status);
        //this.prueba.add(status);

    }
    public void clear(){
        this.prodHistory.clear();
    }
    public String toString(){
        //int aver = this.prodHistory.size();
        //String s = Integer.toString(aver);
        //for(Double stat : this.prodHistory){
        //    aver+=" ,"+stat;
        //}
        return this.prodHistory.toString();
        //return this.prodHistory.toString();
        //return this.prodHistory.toString();
    }
    public double maxValue(){
        double max = 0.0;
        if(this.prodHistory.isEmpty()){
            return 0;
        }
        //Double max = 0.0;
        for(double status : this.prodHistory){
            if(status > max){
                max = status;
            }
        }
        return max;
    }
    public double minValue(){
        double min = maxValue();
        if(this.prodHistory.isEmpty()){
            return 0;
        }
        for(double status : this.prodHistory){
            if(status < min){
                min = status;
            }
        }
        return min;
    }
    public double average(){
        double avg = 0.0;
        for(double status : this.prodHistory){
            avg+=status;
        }
        return avg/this.prodHistory.size();
    }

    //public void prueba(){
    //    this.prodHistory.add(22.2);
    //    this.prodHistory.add(111.1);
    //    System.out.println(this.prodHistory);
    //}
}
