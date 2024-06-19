package problem.problem9;


import java.util.ArrayList;

class Hotel {
	private ArrayList<Room> rooms = new ArrayList<Room>();

	class Room {
		int num;
		String name;

		public Room(int num, String name) {
			this.num = num;
			this.name = name;
		}

		public void show() {
			System.out.println(num + "번 방을 " + name + "가 예약했습니다.");
		}
	}

	public void add(int num, String name) {
		rooms.add(new Room(num, name));
	}

	public void show() {
		for (Room room : rooms) {
			room.show();
		}
	}
}

public class HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.show();
	}
}
