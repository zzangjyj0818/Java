public class TelevisonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		
		//채널의 값을 다시 지정해줌 
		myTv.setChannel(11);
//		myTv.print();
//		int ch = myTv.getChannel();
//		System.out.printf("현재 채널은 %d 입니다.\n", ch);
		System.out.println(myTv.toString("나의 텔레비전의 "));
		
		/*
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = false;
		yourTv.print();
		*/
		
		//Not using Method
		/*
		System.out.println("텔레비전의 채널은 "+myTv.channel+"이고 볼륨은 "
				+ myTv.volume + "입니다.");
		System.out.println("텔레비전의 채널은 "+yourTv.channel+"이고 볼륨은 "
				+ yourTv.volume + "입니다.");
		*/
		
		
	}
}