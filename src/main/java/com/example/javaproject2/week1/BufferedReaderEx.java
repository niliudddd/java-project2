package com.example.javaproject2.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderEx {
    public void readALine() throws IOException {
// InputStreamReader 선언 및 초기화
        InputStreamReader isr = new InputStreamReader(System.in);
// BufferedReader 선언 및 초기화, InputStreamReader 태우기
        BufferedReader br = new BufferedReader(isr);
// 한 줄 읽어 와 line 변수에 담기
        String line = br.readLine();
// line 변수에 있는 한 줄 출력하기
        System.out.println(line);
    }
}
