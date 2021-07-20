package algoritm;

//Ex88/pg62
public class MysterySoda {
    public static void main(String[] args) {
        String soda="coke";
        String pop="pepsi";
        String coke="pop";
        String pepsi="soda";
        String say=pop;

        carbonated(coke,soda,pop);
        carbonated(pop,pepsi,pepsi);
        carbonated("pop",pop, "koolaid");
        carbonated(say, "say",pop);
    }
    public static void carbonated(String coke, String soda, String pop){
        System.out.println("say "+soda+" not "+pop+" or "+coke);
    }


}
