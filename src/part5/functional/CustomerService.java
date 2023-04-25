package part5.functional;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private List<Customer> customers;
    public CustomerService(){
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer newCustomer){
        this.customers.add(newCustomer);
    }

    //요구사항 1) 지역으로 검색
    public List<Customer> searchCustomersByLocation(String location){
        List<Customer> foundCustomers = new ArrayList<>();
        for(Customer customer : customers){
            if(customer.getLocation().equals(location)){
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }

    //요구사항이 계속 생긴다고 가정해보자. 성별로 검색, 나이가 몇살 이상인 사람 검색...
    //그럴때마다 메서드를 계속 추가하는 건 낭비이다.
    // 하나의 메소드로 만들어보자 ...
    public List<Customer> searchCustomerBy(SearchOption searchOption, String searchValue){
        List<Customer> foundCustomers = new ArrayList<>();
        for(Customer customer : customers){
            if(searchOption.equals(SearchOption.Location)){
                if(customer.getLocation().equals(searchValue)){
                    foundCustomers.add(customer);
                }
            }else if(searchOption.equals(SearchOption.Gender)){
                if(customer.getGender().name().equals(searchValue)){
                    foundCustomers.add(customer);
                }
            }
        }
        return foundCustomers;
    }

    //인터페이스를 통한 검색 메서드
    public List<Customer> searchCustomers(SearchFilter filter){
        List<Customer> foundCustomers = new ArrayList<>();
        for(Customer customer : customers){
            if(filter.isMatched(customer)){
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }


}
