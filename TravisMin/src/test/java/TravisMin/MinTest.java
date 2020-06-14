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
		assertTrue("������ ������ �׽�Ʈ ���� - �� ������ �Է�", Min.min(list) == 56);
	}
	
	@Test
	public void testFloat() {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(5.01);
		list.add(4.0);
		list.add(2.6566);
		assertTrue("�Ǽ��� ������ �׽�Ʈ ����", Min.min(list) == 2.6566);
	}
	
	@Test
	public void testChar() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('A');
		list.add('z');
		assertTrue("������ ������ �׽�Ʈ ����", Min.min(list) == 'A');
	}
	
	@Test
	public void testString() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ϴ�");
		list.add("�ٳ���");
		assertTrue("���ڿ� ������ �׽�Ʈ ���� - �ѱ�", Min.min(list).equals("�ٳ���"));
		list.add("apple");
		list.add("zoo");
		assertTrue("���ڿ� ������ �׽�Ʈ ���� - ����", Min.min(list).equals("apple"));
	}
	
	@Test
	public void testCharSpace() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('A');
		list.add(' ');
		assertTrue("���� ������ ������ �׽�Ʈ ����", Min.min(list) == ' ');
	}

	@Test
	public void testStringSpace() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add(" ");
		list.add("  ");
		assertTrue("���� ���ڿ� ������ �׽�Ʈ ����", Min.min(list).equals(" "));
	}
	
	@Test
	public void testStringEmpty() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add(" ");
		list.add("");
		assertTrue("�� ���ڿ� ������ �׽�Ʈ ����", Min.min(list).equals(""));
	}
	
	@Test
	public void testOneValue() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		assertTrue("�� ���ڿ� ������ �׽�Ʈ ����", Min.min(list).equals("apple"));
	}
	
	@Test
	public void testEmptyValue() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			Min.min(list);
			fail("�� �� �׽�Ʈ ����");
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
			fail("Null �� �׽�Ʈ ����");
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
			fail("Null �� �߰� �׽�Ʈ ����");
		}catch(NullPointerException e){
			assertTrue(true);
			return;
		}
	}
}

