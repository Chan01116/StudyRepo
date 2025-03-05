package javaStudy;

public class Study {

	public static void main(String[] args) {
		 if ( true ) {
		      System.out.println("참");
		    }
		    
		    if ( false ) {
		      System.out.println("거짓");
		    }
		    
		    int a = 10;
		    
		    // `==` => 같다.
		    if ( a == 10 ) {
		      System.out.println("참1");
		    }
		    
		    // `!=` => 같지 않다.
		    if ( a != 10 ) {
		      System.out.println("거짓2");
		    }
		    
		    if ( a > 10 ) {
		      System.out.println("거짓2");
		    }
		    
		    if ( a >= 10 ) {
		      System.out.println("참2");
		    }
		    
		    int b = 10;
		    
		    if ( a == b ) {
		      System.out.println("참3");
		    }
		    
		    // boolean c => c 에는 오직 true/false 만 담을 수 있다.
		    boolean c = a != b;
		    
		    if ( c ) {
		      System.out.println("거짓3");
		    }
		    
		    if ( c == false ) {
		      System.out.println("참4");
		    }
		    
		    // `!` => 반전
		    if ( !c ) {
		      System.out.println("참5");
		    }
		    
		    // `!` => 반전
		    if ( !(!c) ) {
		      System.out.println("거짓4");
		    }
		    
		    boolean d = true;
		    
		    if ( c != d ) {
		      System.out.println("참6");
		    }

		    if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
					System.out.println("거짓5");
				}

				if ( 10 != 10 || 10 < 2 ) {
					System.out.println("거짓6");
				}
	
	}

}
