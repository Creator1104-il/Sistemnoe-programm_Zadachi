public class shop {
    static int amount(int price, int moneyUHave, int wrap){
        int count = moneyUHave/price;
        int fantiki = count;
        while (fantiki >= wrap){
            int newCount = fantiki/wrap;
            count+=newCount;
            fantiki = (fantiki % wrap)+ newCount ;

        }
        return count;
    }
}
