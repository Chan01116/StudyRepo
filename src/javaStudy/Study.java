package javaStudy;

public class Study {

	public static void main(String[] args) {
		// 문제 : 아래와 같이 출력해주세요.
		// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.
		// 조건 : * 1000까지 출력해주세요 (for, while x)
		int dan = 8;
	    
	    // 수정가능지역 시작
	    int i = 1;
	    
	    
	    if(i <= 1000) {
	    	System.out.println(dan + " * " + (i) + " = " + dan * i);
		    i++;
	    }
	    if(i <= 1000) {
	    	System.out.println(dan + " * " + (i) + " = " + dan * i);
		    i++;
	    }if(i <= 1000) {
	    	System.out.println(dan + " * " + (i) + " = " + dan * i);
		    i++;
	    }if(i <= 1000) {
	    	System.out.println(dan + " * " + (i) + " = " + dan * i);
		    i++;
	    }if(i <= 1000) {
	    	System.out.println(dan + " * " + (i) + " = " + dan * i);
		    i++;
	    }
	    // 이런식으로 1000개 이상 쓰면 천까지만 나온다.
	    
	    // 수정가능지역 끝
	    
	    // 출력
	    /*
	    8 * 1 = 8
	    8 * 2 = 16
	    8 * 3 = 24
	    8 * 4 = 32
	    8 * 5 = 40
	    8 * 6 = 48
	    8 * 7 = 56
	    8 * 8 = 64
	    8 * 9 = 72
	    */
	
		
	}
}