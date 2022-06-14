package hijava.practice;

/**
 * 첫번째 자바 실습
 * @author JuYeol
 * @update say함수 추가 (2022-06-13 by QQQ)
 *
 */
public class HelloJava {

	public static void main(String[] args) {

		String message = "Hello world"
				+ "";
		
		// HelloJava에게 say라는 명령을 내림!
		HelloJava.say("Hi~");

//		JVM이 스스로 화면에 출력
		System.out.println("Hello Java!!");

		/**
		 ㄴㅇㄻㄴㄹ
		 ㅁㄴㅇㄻㄴㅇㄹ
		 ㅁㄴㅇㄹㄴㅁㅇㄹ 
		 */
		
	}

	public static void say(String msg) {
		System.out.println(msg);
	}

}
