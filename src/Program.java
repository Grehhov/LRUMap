public class Program {
	public static long timeOfTask(Integer number) {
		long start = System.currentTimeMillis();
		LRUMap<Integer, Integer> map = new LRUMap<Integer, Integer>();
		for (int i = 0; i < number; i++) {
			map.addOfUpdate(i, i);
		}
		return System.currentTimeMillis() - start;
	}
	
	public static void main (String[] args) {
		timeOfTask(1000000);
		System.out.println("����� ���������� 1000 ���������: " + timeOfTask(1000) + "��");
		System.out.println("����� ���������� 10000 ���������: " + timeOfTask(10000) + "��");
		System.out.println("����� ���������� 100000 ���������: " + timeOfTask(100000) + "��");
		System.out.println("����� ���������� 1000000 ���������: " + timeOfTask(1000000) + "��");
	}
}
