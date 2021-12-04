package chap12;

/**
 * ������ ����
 * getState()�� Ȯ�� ����
 * @author X13
 *
 */
public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) { //Thread targetThread ���¸� ������ ������
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); //������ ���� ���
			System.out.println("Ÿ�� ������ ����:" + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start(); // ��ü ���� ������ ���, ���� ��� ���·� ����
			}
			
			if(state == Thread.State.TERMINATED) {
				break; // ���� ������ ��� while���� ������
			}
			try {
				//0.5�ʰ� �Ͻ� ����;
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}