package part5.functional;

import java.util.ArrayList;
import java.util.List;

public class FunctionalAssist {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        initData(service);

        List<Customer> result = new ArrayList<>();

        //요구사항 1) 지역으로 검색
//        List<Customer> result = service.searchCustomersByLocation("Busan");
       /* for (Customer cus : result){
            System.out.println(cus);
        }
*/
        //요구사항 2) 성별로 검색
//        result = service.searchCustomerBy(SearchOption.Gender,"Female");

        /**
         *클래스 안에 클래스 중첩 클래스(nested class) 종류는 4개가 있다.
         * 1. static 클래스
         * 2 . Non-static class
         * 2-1 멤버  : 필드 단위에서 inner class 선언
         * 2-2 로컬  : 메서드 안에서 inner class 선언
         * 2-3 익명  : 한 번만 쓰이는 클래스.
         * */

       /* result = service.searchCustomers(new SearchFilter() {
            @Override
            public boolean isMatched(Customer customer) {
                if(customer.getLocation().equals("Seoul")){
                    return true;
                }else{
                    return false;
                    }
            }
        });*/

        // 람다 적용
        result = service.searchCustomers(customer -> customer.getGender().equals(Gender.Male));

        result = service.searchCustomers(customer -> customer.getLocation().equals("Seoul") && customer.getAge() > 25);

        for(Customer cus : result){
            System.out.println(cus);
        }



    }

    private static void initData(CustomerService service){
        service.addCustomer(new Customer("CUS01","Seoul",Gender.Male,30));
        service.addCustomer(new Customer("CUS02","Busan",Gender.Female,50));
        service.addCustomer(new Customer("CUS03","Seoul",Gender.Male,15));
        service.addCustomer(new Customer("CUS04","Incheon",Gender.Female,55));
        service.addCustomer(new Customer("CUS05","Chuncheon",Gender.Male,33));
        service.addCustomer(new Customer("CUS06","Seoul",Gender.Female,30));
        service.addCustomer(new Customer("CUS07","Busan",Gender.Male,30));
    }
}
