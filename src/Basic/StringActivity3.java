package Basic;

public class StringActivity3 {

	public static void main(String[] args) {
		String str = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		String[] detail = str.split("\\\\");
		
		StringBuilder drive = new StringBuilder("Drive: ").append(detail[0]).append("\\");
		System.out.println(drive);
		
		StringBuilder folders = new StringBuilder("Folders: ").append(detail[1])
		.append(" ||").append(detail[2]).append(" ||").append(detail[3]);
		System.out.println(folders);
		
		StringBuilder file = new StringBuilder("File: ").append(detail[4]);
		System.out.println(file);
		
		
	}

}
