package TravisMin;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

public class MinTest {

	@Test
	public void testInt() throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(56);
		list.add(560);
		list.add(57);
		assertTrue("정수형 데이터 테스트 오류 - 값 여러개 입력", Min.min(list) == 56);
	}
	
	@Test
	public void testFloat() {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(5.01);
		list.add(4.0);
		list.add(2.6566);
		assertTrue("실수형 데이터 테스트 오류", Min.min(list) == 2.6566);
	}
	
	@Test
	public void testChar() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('A');
		list.add('z');
		assertTrue("문자형 데이터 테스트 오류", Min.min(list) == 'A');
	}
	
	@Test
	public void testString() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("하늘");
		list.add("바나나");
		assertTrue("문자열 데이터 테스트 오류 - 한글", Min.min(list).equals("바나나"));
		list.add("apple");
		list.add("zoo");
		assertTrue("문자열 데이터 테스트 오류 - 영어", Min.min(list).equals("apple"));
	}
	
	@Test
	public void testCharSpace() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('A');
		list.add(' ');
		assertTrue("공백 문자형 데이터 테스트 오류", Min.min(list) == ' ');
	}

	@Test
	public void testStringSpace() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add(" ");
		list.add("  ");
		assertTrue("공백 문자열 데이터 테스트 오류", Min.min(list).equals(" "));
	}
	
	@Test
	public void testStringEmpty() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add(" ");
		list.add("");
		assertTrue("빈 문자열 데이터 테스트 오류", Min.min(list).equals(""));
	}
	
	@Test
	public void testOneValue() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		assertTrue("빈 문자열 데이터 테스트 오류", Min.min(list).equals("apple"));
	}
	
	@Test
	public void testEmptyValue() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			Min.min(list);
			fail("빈 값 테스트 오류");
		}catch(IllegalArgumentException e){
			assertTrue(true);
			return;
		}
	}
	
	@Test
	public void testNullValue() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(null);
		list.add(null);
		try {
			Min.min(list);
			fail("Null 값 테스트 오류");
		}catch(NullPointerException e){
			assertTrue(true);
			return;
		}
	}
	
	@Test
	public void testAddNullValue() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add(null);
		try {
			Min.min(list);
			fail("Null 값 추가 테스트 오류");
		}catch(NullPointerException e){
			assertTrue(true);
			return;
		}
	}
}

