import java.util.*;

public class CPUClient {

		public static void main(String[] args) {
			CPU cpu = new CPU();

			Scanner in = new Scanner(System.in);

			System.out.println("-=CPU Simulator=-");
			System.out.println("Would you like to begin a priority or round-robin simulation?");
			String simulation = in.nextLine();

			while (true) {
				if (simulation.equalsIgnoreCase("priority")) {
					runPriority(in, cpu);
					break;
				}
				else if (simulation.equalsIgnoreCase("round-robin")) {
					runRoundRobin(in, cpu);
					break;
				}
				else {
					System.out.println("invalid option. Please reenter.");
					simulation = in.nextLine();
				}
			}
		}

		public static void runPriority(Scanner in,CPU cpu){
			boolean go = true;
			int select;

			while (go == true) {
				System.out.println("Press 1 to add a job\n"
						+ "Press 2 to begin simulating. Keep in mind you can add jobs while the simulation is running\n"
						+ "Press 3 to exit");


				select = in.nextInt();
				switch (select) {
					case 1: {
						System.out.println("Please enter job name without spaces");
						String name = in.next();
						System.out.println("Please enter job priority as an integer between -19 and 20");
						int priority = in.nextInt();
						if (priority < -19 || priority > 20) {
							System.out.println("This is not a valid priority\n" + "Press 1 to add a job\n"
									+ "Press 2 to begin simulating. Keep in mind you can add jobs while the simulation is running\n"
									+ "Press 3 to exit");
						}
						System.out.println("Please enter job length as a number between 1 and 100");
						int length = in.nextInt();
						if (length < 1 || length > 100) {
							System.out.println("This is not a valid length\n" + "Press 1 to add a job\n"
									+ "Press 2 to begin simulating. Keep in mind you can add jobs while the simulation is running\n"
									+ "Press 3 to exit");
						}
						Job job = new Job(priority, length, name);
						cpu.addJob(job);
					}
					break;
					case 2: {
						cpu.run();
					}
					break;
					case 3: {
						go = false;
						break;
					}

				}
			}
		}

		public static void runRoundRobin(Scanner in, CPU cpu){
			boolean go = true;
			int select;

			while (go == true) {
				System.out.println("Press 1 to add a job\n"
						+ "Press 2 to begin simulating. Keep in mind you can add jobs while the simulation is running\n"
						+ "Press 3 to exit");


				select = in.nextInt();
				switch (select) {
					case 1: {
						System.out.println("Please enter job name without spaces");
						String name = in.next();
						System.out.println("Please enter job Time as an integer between 0 and 20");
						int time = in.nextInt();
						if (time < 0) {
							System.out.println("This is not a valid priority\n" + "Press 1 to add a job\n"
									+ "Press 2 to begin simulating. Keep in mind you can add jobs while the simulation is running\n"
									+ "Press 3 to exit");
						}
						System.out.println("Please enter job length as a number between 1 and 100");
						int length = in.nextInt();
						if (length < 1 || length > 100) {
							System.out.println("This is not a valid length\n" + "Press 1 to add a job\n"
									+ "Press 2 to begin simulating. Keep in mind you can add jobs while the simulation is running\n"
									+ "Press 3 to exit");
						}

						Job job = new Job(length, name,time);
						cpu.addJob(job);
					}
					break;
					case 2: {
						cpu.runRoundRobin();
					}
					break;
					case 3: {
						go = false;
						break;
					}

				}
			}
		}
}


