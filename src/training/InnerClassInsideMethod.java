package training;

public class InnerClassInsideMethod {
    public static void main(String[] args) {

        Person1 sam = new Person1("Sam");
        sam.setAccount("qwerty");
    }
}
class Person1{

    private String name;

    Person1(String name){
        this.name = name;
    }

    public void setAccount (String password){

        class Account{

            void display(){
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}
