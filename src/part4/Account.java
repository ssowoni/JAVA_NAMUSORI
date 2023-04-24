package part4;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    /*public int withdraw(int money){
        if(balance < money){
            System.out.println("잔액이 부족합니다.");
        }else{
            balance -= money;
        }
        return balance;
    }*/

    // 나를 호출한 곳에서 예외를 던져줘. 그럼 OverdraftException 예외를 처리한다.
    public int withdraw(int money) throws OverdraftException {
        if(balance < money){
            //throw : 예외가 발생하는 시점에 예외를 발생시켜라
            throw new OverdraftException("잔액이 부족합니다.");
        }
        balance -= money;
        return balance;
    }


}
