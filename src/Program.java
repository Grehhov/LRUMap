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
		System.out.println("Время добавления 1000 элементов: " + timeOfTask(1000) + "мс");
		System.out.println("Время добавления 10000 элементов: " + timeOfTask(10000) + "мс");
		System.out.println("Время добавления 100000 элементов: " + timeOfTask(100000) + "мс");
		System.out.println("Время добавления 1000000 элементов: " + timeOfTask(1000000) + "мс");
	}
}
