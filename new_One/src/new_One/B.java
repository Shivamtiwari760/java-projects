package new_One;
import java.io.*;
import java.util.HashSet;
public class B {

	public static void main(String[] args) {
		PrintWriter pw= new PrintWriter("get_one.txt");
		BufferedReader br= (BufferedReader) new BufferedReader(new FileReader("weather_in_bangalore.txt"));
		String line=br.readLine();
		HashSet<String> hs= new HashSet<String>();
		while(line!: null) {
			if(hs.add(line))
				pw.println(line);
			
			line=br.readLine();
		pw.flush();
		br.close();
		pw.close();
		System.out.println("done");
	}
}
}
