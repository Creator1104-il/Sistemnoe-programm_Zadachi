import java.util.Random;
//хранитель денег
public class MoneyKeeper extends Thread {
    //чьи денеги хранить
    private Account account;
    MoneyKeeper(Account account){
        this.account = account;
    }

    @Override
    public void run(){
        while (true) {
            Random rn = new Random();
            account.addToBalance(rn.nextInt(100, 1000));//заработок денег
            //остановка если уже есть 15000 денег
            if(account.getBalance()>15000)
            {
                System.out.println("накоплено достаточно денег");
                break;
            }
            try {
                //отдых от заработка денег
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
