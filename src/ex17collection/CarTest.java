package ex17collection;



	abstract class Car {
		abstract void run(String a);
		abstract void refuel();
		abstract void stop();
		
	}
	

	class Bus extends Car{
		@Override
		void run(String a) {
			System.out.println(a+"가 달립니다");
			
		}
		@Override
		void refuel() {
			// TODO Auto-generated method stub
			System.out.println("천연가스를 충전합니다");
		}
		@Override
		void stop() {
			// TODO Auto-generated method stub
			System.out.println("차가 멈춥니다");
		}
		void takePassenger() {
			System.out.println("승객을 버스에 태웁니다");
		}
		
	}
	class AutoCar extends Car{
		@Override
		void run(String a) {
			System.out.println(a+"달립니다");
			// TODO Auto-generated method stub
			
		}
		@Override
		void refuel() {
			// TODO Auto-generated method stub
			
			System.out.println("휘발유를 충전합니다");
		}
		@Override
		void stop() {
			// TODO Auto-generated method stub
			System.out.println("차가 멈춥니다");
		}
		void load() {
			System.out.println("승짐을 싣습니다.");
		}
	}
	public abstract class CarTest {
		
	public static void main(String[] args) {
	
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		
		
		bus.run("버스");
		autoCar.run("차");
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
		
	}

	
}
