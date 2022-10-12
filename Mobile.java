package week1.day2;

public class Mobile {
public void sendMessege() {
	System.out.println("hi:"+"sendMessege");
	
}
public void shareDocument() {
	System.out.println("shareDocument");
}
public void call() {
	System.out.println("call");
}
public static void main(String[] args) {
	Mobile phone=new Mobile();
	phone.sendMessege();
	phone.shareDocument();
	phone.call();
	
	
}
}
