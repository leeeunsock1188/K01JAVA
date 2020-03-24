package ex18lambda;

import java.util.function.Consumer;

public class Ex06Define3Consumer {

	public static void main(String[] args) {
		

		/*
		 	interface Consumer<T> {
		 	void accept (T t) ;
		 	}
		 */
		Consumer<String> c1 = (String s)  -> {
			System.out.println(s +" 은 (은) 가수입니다.");
		};
		c1.accept("케이월");
		Consumer<String> c2 = t -> {
			System.out.println(t + "는 (은) 과일입니다.");
		};
		c2.accept("Strawberry");
	}
	

}
