public class Calculator {
		public int add(int a, int b) {
				return a + b;
		}

		public int mul(int a, int b) {
				int result = 0;
				for (int i = 0; i < b; i++) {
						result += a;
				}
				return result;
		}
}
