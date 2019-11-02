public class Overload {
    public double x(){
        return 5;
    }
    public double x(double x){
        return x;
    }
    public double x(double x,double c){
        return c = x;
    }
    public double x(int x){
        return this.x();
    }
}
