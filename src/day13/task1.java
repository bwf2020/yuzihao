package day13;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class task1 {
	public static void show(File file1) {
		File[] fl1 = file1.listFiles();
		for (File file3 : fl1) {
			if(file3 != null) {
				System.out.println("���ļ�");
				System.out.println(Arrays.toString(fl1));
				file3.delete();
				
			}
	
		}
		file1.delete();
		File file4 = new File(file1.getParent());
		File[] fl2 = file4.listFiles();
		for (File a : fl2) {
			if(a != null) {
				System.out.println("���ļ�");
				System.out.println(Arrays.toString(fl2));
				a.delete();
				
			}
	
		}
		file4.delete();

	}

	public static void main(String[] args) {
		File file = null;
		//System.out.println(file.exists());
		File file1 = new File("D:/file/other/name");
		//File file2 = new File("D:/file/other/name/a.txt");
		file1.mkdirs();
		try {
			file.createTempFile("a1c", ".txt",file1);
			file.createTempFile("hello", ".txt",file1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("û�����ɹ�");
		}
		System.out.println("����Ŀ¼�ɹ�");
		show(file1);
		System.out.println("ɾ��Ŀ¼�ɹ�");
		
		
		
	}

}
