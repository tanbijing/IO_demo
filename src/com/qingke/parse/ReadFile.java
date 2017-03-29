package com.qingke.parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

import com.qingke.unit.Person;

public class ReadFile {
	private String filePath;
	
	public ReadFile(String path){
		filePath = path;
	}
	
	public TreeMap<String,Person> read(){
		File file = null;
		BufferedReader reader = null;
		TreeMap<String,Person> datas = new TreeMap<String,Person>();
		try {
			file = new File(this.filePath);
			reader = new BufferedReader(new FileReader(file));
			for(String text = reader.readLine();text!=null&&text!="";text=reader.readLine()){
				if(text.startsWith("#")) continue;
				String arr[] = text.trim().split(",");
				String id = "";
				String name = "";
				String salary = "";
				String superID = "";
				String Master = "";
				for(int i = 0;i<arr.length;i++){
					switch(i){
						case 0:
							id = arr[i];
							break;
						case 1:
							name = arr[i];
							break;
						case 2:
							salary = arr[i];
							break;
						case 3:
							superID = arr[i];
							break;
						case 4:
							Master = arr[i];
							break;
						default:
							break;
					}
				}
				datas.put(arr[0], new Person(id, name, salary, superID, Master));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null) reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return datas;
	}
	
}
