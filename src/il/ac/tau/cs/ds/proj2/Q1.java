package il.ac.tau.cs.ds.proj2;

public class Q1 {
	
	public static void run() {
		System.out.println("Q1.run() - START");
		
		/*run_all_for((int)Math.pow(2, 10));
		System.out.println();
		run_all_for((int)Math.pow(2, 15));
		System.out.println();
		run_all_for((int)Math.pow(2, 20));
		System.out.println();
		run_all_for((int)Math.pow(2, 25));*/
		run_F();
		
		System.out.println("Q1.run() - END\n");
	}
	
	public static void run_all_for(int m) {
		/*run_B_for(m);
		System.out.println();*/
		run_D_for(m);
		System.out.println();
		run_E_for(m);
		System.out.println();
		run_F_for(m);
	}
	
	public static void run_B() {
		run_B_for((int)Math.pow(2, 10));
		System.out.println();
		run_B_for((int)Math.pow(2, 15));
		System.out.println();
		run_B_for((int)Math.pow(2, 20));
		System.out.println();
		run_B_for((int)Math.pow(2, 25));
	}
	
	public static void run_D() {
		run_D_for((int)Math.pow(2, 10));
		System.out.println();
		run_D_for((int)Math.pow(2, 15));
		System.out.println();
		run_D_for((int)Math.pow(2, 20));
		System.out.println();
		run_D_for((int)Math.pow(2, 25));
	}
	
	public static void run_E() {
		run_E_for((int)Math.pow(2, 10));
		System.out.println();
		run_E_for((int)Math.pow(2, 15));
		System.out.println();
		run_E_for((int)Math.pow(2, 20));
		System.out.println();
		run_E_for((int)Math.pow(2, 25));
	}
	
	public static void run_F() {
		run_F_for((int)Math.pow(2, 10));
		System.out.println();
		run_F_for((int)Math.pow(2, 15));
		System.out.println();
		run_F_for((int)Math.pow(2, 20));
		System.out.println();
		run_F_for((int)Math.pow(2, 25));
	}
	
	public static void run_B_for(int m) {
		System.out.println("Q1.run_B_for("+String.valueOf(m)+") - START");
		Timer timer = new Timer();
		int k;
		FibonacciHeap.HeapNode[] items = new FibonacciHeap.HeapNode[m];
		
		FibonacciHeap H = new FibonacciHeap();
		Logger.reset();
		timer.reset();
		
	
		for (k=m-1; k>=0; k--) {
			items[k] = H.insert(k);
		}
		
		H.insert(-1);
		H.deleteMin();
		FibonacciHeap.HeapNode itemToDec;
		for (k=(int)log2(m); k>=1; k--) {
			itemToDec = items[m+1-(1<<k)];
			//System.out.println("Decreased key " + String.valueOf(m+1-(1<<k)) + " to " + String.valueOf(itemToDec.getKey()-(m+1)));
			H.decreaseKey(items[m+1-(1<<k)], m+1);
			//System.out.println(String.format("Potential %d", H.potential()));
		}
		long pace = timer.split();
		
		System.out.println(String.format("Q1.run_B_for(%d) - \n\tRuntime = %d ms\n\ttotalLinks = %d\n\ttotalCuts=%d\n\tPotential=%d", m, pace, H.totalLinks(), H.totalCuts(), H.potential()));
		
		Logger.reset();
		timer.reset();
		
		System.out.println("Q1.run_B_for("+String.valueOf(m)+") - END");
	}
	
	public static void run_D_for(int m) {
		System.out.println("Q1.run_D_for("+String.valueOf(m)+") - START");
		Timer timer = new Timer();
		int k;
		FibonacciHeap.HeapNode[] items = new FibonacciHeap.HeapNode[m];
		
		FibonacciHeap H = new FibonacciHeap();
		Logger.reset();
		timer.reset();
		
	
		for (k=m-1; k>=0; k--) {
			items[k] = H.insert(k);
		}
		
		H.insert(-1);
		H.deleteMin();
		FibonacciHeap.HeapNode itemToDec;
		for (k=(int)log2(m); k>=1; k--) {
			itemToDec = items[m+1-(1<<k)];
			System.out.println("Decreased key " + String.valueOf(m+1-(1<<k)) + " to " + String.valueOf(itemToDec.getKey()-(m+1)));
			
			H.decreaseKey(items[m/*+1*/-(1<<k)], m+1);
		}
		long pace = timer.split();
		
		System.out.println(String.format("Q1.run_D_for(%d) - \n\tRuntime = %d ms\n\ttotalLinks = %d\n\ttotalCuts=%d\n\tPotential=%d", m, pace, H.totalLinks(), H.totalCuts(), H.potential()));
		
		Logger.reset();
		timer.reset();
		
		System.out.println("Q1.run_D_for("+String.valueOf(m)+") - END");
	}
	
	public static void run_E_for(int m) {
		System.out.println("Q1.run_E_for("+String.valueOf(m)+") - START");
		Timer timer = new Timer();
		int k;
		FibonacciHeap.HeapNode[] items = new FibonacciHeap.HeapNode[m];
		
		FibonacciHeap H = new FibonacciHeap();
		Logger.reset();
		timer.reset();
		
	
		for (k=m-1; k>=0; k--) {
			items[k] = H.insert(k);
		}
		
		H.insert(-1);
		/*H.deleteMin();*/
		for (k=(int)log2(m); k>=1; k--) {
			H.decreaseKey(items[m+1-(1<<k)], m+1);
		}
		long pace = timer.split();
		
		System.out.println(String.format("Q1.run_E_for(%d) - \n\tRuntime = %d ms\n\ttotalLinks = %d\n\ttotalCuts=%d\n\tPotential=%d", m, pace, H.totalLinks(), H.totalCuts(), H.potential()));
		
		Logger.reset();
		timer.reset();
		
		System.out.println("Q1.run_E_for("+String.valueOf(m)+") - END");
	}
	
	public static void run_F_for(int m) {
		System.out.println("Q1.run_F_for("+String.valueOf(m)+") - START");
		Timer timer = new Timer();
		int k;
		FibonacciHeap.HeapNode[] items = new FibonacciHeap.HeapNode[m];
		int maxCutsDelta = 0;
		int oldCuts;
		
		FibonacciHeap H = new FibonacciHeap();
		Logger.reset();
		timer.reset();
		
	
		for (k=m-1; k>=0; k--) {
			items[k] = H.insert(k);
		}
		
		H.insert(-1);
		H.deleteMin();
		FibonacciHeap.HeapNode itemToDec;
		oldCuts = FibonacciHeap.totalCuts();
		for (k=(int)log2(m); k>=1; k--) {
			itemToDec = items[m+1-(1<<k)];
			System.out.println("Decreased key " + String.valueOf(m+1-(1<<k)) + " to " + String.valueOf(itemToDec.getKey()-(m+1)));
			H.decreaseKey(items[m+1-(1<<k)], m+1);
			maxCutsDelta = Math.max(maxCutsDelta, FibonacciHeap.totalCuts()-oldCuts);
			oldCuts = FibonacciHeap.totalCuts();
		}
		itemToDec = items[m-2];
		H.decreaseKey(items[m-2], m+1);
		maxCutsDelta = Math.max(maxCutsDelta, FibonacciHeap.totalCuts()-oldCuts);
		long pace = timer.split();
		
		System.out.println(String.format("Q1.run_F_for(%d) - \n\tRuntime = %d ms\n\tmaxCutsDelta = %d\n\ttotalLinks = %d\n\ttotalCuts=%d\n\tPotential=%d", m, pace, maxCutsDelta, H.totalLinks(), H.totalCuts(), H.potential()));
		
		Logger.reset();
		timer.reset();
		
		System.out.println("Q1.run_F_for("+String.valueOf(m)+") - END");
	}
	
	public static double log2(double m) {
		return (double)(Math.log(m)/Math.log(2));
	}
}
