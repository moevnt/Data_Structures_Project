import java.util.*;
//update
public class CPU {

	private PriorityQueue pq = new PriorityQueue();
	private int min = 19;
	private int max = -20;
	private int sliceCount;
	private Timer timer = new Timer();

	public CPU() {
	}

	public void addJob(Job job) {
		{

			if (job.getPriority() <= min) {
				pq.add(job);
				min = job.getPriority();
			}
			else if (job.getPriority() >= max) {
				pq.add(job);
				max = job.getPriority();
			}
			else {
				while (true) {
					if (!pq.isEmpty()) {
						Job temp = (Job) pq.peek();
						if (job.getPriority() < temp.getPriority()) {
							pq.add(job);
							break;
						} else {
							pq.add(job);
							break;
						}
					}

				}
			}
			System.out.println("Job successfully added to registry\n");
		}
	}

	public void run() {

		while (!pq.isEmpty()) {
			Job current = (Job) pq.remove();
			System.out.println("Starting Job " + current.getName() + " with a length of " + current.getLength());
			for (int i = 0; i < current.getLength(); i++) {
				System.out.println("Proccessing job " + current.getName() + " -|Currently on step " + i + " out of " + current.getLength() + "|-");
			}
			System.out.println("Finished job " + current.getName() + " Successfully");
			pq.remove();

			if (pq.isEmpty()) {
				System.out.println("There are no new jobs\n");
			}
			return;
		}
		if (pq.isEmpty())
			System.out.println("There are no new jobs\n");
	}

	public void runRoundRobin() {

	}

}