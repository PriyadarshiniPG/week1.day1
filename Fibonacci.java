package week1.day1;

import java.nio.file.spi.FileSystemProvider;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Fibonacci {
public static void main(String[] args) {
	int firstnum=0;
	int secondnum=1;
	int range=8;
	System.out.println(firstnum);
	System.out.println(secondnum);
	for(int i=1;i<8;i++){

		int sum=firstnum+secondnum;
	//System.out.println("step1");
		//System.out.println(sum=firstnum+secondnum);//1+1
		firstnum=secondnum;
	//	System.out.println("step 2");
		//System.out.println(firstnum=secondnum);
		secondnum=sum;
	//	System.out.println("step3");
	//	System.out.println(secondnum=sum);
		System.out.println(sum);

	}
}
}
