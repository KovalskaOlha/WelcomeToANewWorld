package class20;

public class userClass {
    String name;
    String number;

    userClass(String name,String number ){
        this.name=name;
        this.number=number;
    }
}
class userInfo extends userClass{

    String address;

    userInfo(String name,String number, String address){
        super(name, number);
        this.address=address;
    }

    void userDetails(){
        System.out.println(" user name is "+name+" number is "+number+" and address is "+address);
    }
}


