public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void CheckPrice (){
        if (this.price < 600){
            System.out.println("This notebook is cheap");
        }else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        }else
            {
                System.out.println("This notebook is quit expensive");
            }
        }

    public void CheckWeight (){
        if (this.weight < 1000){
            System.out.println("This notebook is light");
        }else if (this.weight >= 1000 && this.weight <= 1700){
            System.out.println("This notebook is not too heavy");
        } else
            System.out.println("This notebook is very heavy");

    }

    public void CheckNotebook () {
        if (this.year <= 2010 && this.price <= 300){
            System.out.println("This notebook is old and cheap");
        }else if ((this.year > 2010 && this.year <=2018) && (this.price > 300 && this.price <= 2000) ){
            System.out.println("This notebook isn't modern, but price is good");
        }else if ((this.year > 2018 && this.year <= 2020) && (this.price >2000 && this.price <= 10000)){
            System.out.println("This notebook is modern, but expensive");
        }else
            System.out.println("It will be in future");
    }

}
