package com.day;

import java.util.ArrayList;
import java.util.Arrays;

public class B implements I{

	String[] name = { "송가인", "현빈", "김수현", "아이유", "유재석" };
	String[] addr = { "경기도 수원시", "서울 특별시", "부산 광역시", "인천 광역시", "대전 광역시" };
	String[] number = { "000000-123456", "000000-123456", "000000-123456", "000000-123456", "000000-123456" };
	String[] phoneNum = { "010-0000-1234", "010-0000-1234", "010-0000-1234", "010-0000-1234", "010-0000-1234", };
	String[] email = { "kosta@kosta.kr", "kosta@kosta.kr", "kosta@kosta.kr", "kosta@kosta.kr", "kosta@kosta.kr", };
	String[] service = { "SK-0000-1234", "KT-0000-1234", "LG-0000-1234", "SK-0000-1234", "별정통-0000-1234" };
	String[] plan = { "20000", "30000", "50000", "60000", "70000", };
	String[] serial = { "기계번호_0000", "기계번호_0000", "기계번호_0000", "기계번호_0000", "기계번호_0000" };
	
	@Override
	public ArrayList<String> GetList() {
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(name));
		return names;
	}

	@Override
	public String[] Listinfo() {
		String s[] = new String[addr.length];
		for (int i = 0; i < addr.length; i++) {
			s[i] = name[i] +"/"+ addr[i]+"/"+number[i]+"/"+phoneNum[i]+"/"+email[i]+"/"+service[i]+"/"+plan[i]+"/"+serial[i];
		}
		return s;
	}

	@Override
	public ArrayList<String> GetHoliList() {
		// TODO Auto-generated method stub
		ArrayList<String> info = new ArrayList<String>();
		for (int j = 0; j < name.length; j++) {
			String k = name[j] + addr[j]+number[j]+ phoneNum[j]+ email[j]+
					service[j]+ plan[j]+ serial[j];
			info.add(k);
			} 
		return info;
	}


}
