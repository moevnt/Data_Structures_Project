import java.util.*;
//update
public class CPU {

	private final LinkedList pq = new LinkedList<Job>();
	private int min = 19;
	private int max = -20;
	private int sliceCount;
	private Timer timer = new Timer();

	public CPU() {
	}

	public void addJob(Job job) {
		{
			ListIterator<Job> iterator = pq.listIterator();
			if (job.getPriority() <= min) {
				pq.addFirst(job);
				min = job.getPriority();
			} else if (job.getPriority() >= max) {
				pq.addLast(job);
				max = job.getPriority();
			} else {
				while (true) {
					if (iterator.hasNext()) {
						Job temp = iterator.next();
						if (job.getPriority() < temp.getPriority()) {
							iterator.add(job);
							break;
						} else {
							iterator.add(job);
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
			Job current = (Job) pq.getFirst();
			System.out.println("Starting Job " + current.getName() + " with a length of " + current.getLength());
			for (int i = 0; i < current.getLength(); i++) {
				System.out.println("Proccessing job " + current.getName() + " -|Currently on step " + i + " out of " + current.getLength() + "|-");
			}
			System.out.println("Finished job " + current.getName() + " Successfully");
			pq.removeFirst();

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
