package com.qingke.main;

import java.util.TreeMap;

import com.qingke.parse.ReadFile;
import com.qingke.unit.Console;
import com.qingke.unit.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile reader = new ReadFile("datas.txt");
		TreeMap<String,Person> datas = reader.read();
		boolean flag = true;
		while(flag){
			System.out.println("ÇëÊäÈëÃüÁî£º");
			String com = Console.waitPrint();
			String[] comArr = com.trim().split(" ");
			
			switch(comArr[0]){
				case "exit":
					flag = false;
					break;
				case "ls":
					datas.forEach((String key,Person person)->System.out.println(person));
					break;
				default:
					break;
			}
		}
	}

}
