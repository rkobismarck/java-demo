package helloWorld;

public class run {

	public static void main(String[] args) {

		// Validate Input
		if (args.length == 0) {
			System.out.print("You should insert a valid TTL in seconds.");
			System.exit(0);
		}

		try {
			int ttl = Integer.parseInt(args[0]) * 1000;
			System.out.println("Your first argument was: " + ttl);
			System.out.println("In that case, we're gonna simulate a TTL from:" + ttl + " seconds");

			try {
				System.out.println("Hello Simulator Started.");
				Thread.sleep(ttl);
				System.out.println("Hello World Finished after: " + ttl + " ms");

			} catch (InterruptedException e) {
				throw e;
			}

		} catch (Exception ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
