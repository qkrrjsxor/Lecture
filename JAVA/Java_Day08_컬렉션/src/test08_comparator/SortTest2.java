package test08_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

     
        persons.add(new Person("BBB", 22));
        persons.add(new Person("BBB", 23));
        persons.add(new Person("AAA", 23));
        persons.add(new Person("AAA", 11));
        
        System.out.println(persons);
        
        //comparator 클래스를 만들어도 되지만
        //람다 표현식
        // - 이름이 없는 함수'
        // - 파라미터로 전달하기 위한 함수
        // - 주로 길이가 짧을때
        //문법
        //(매개변수..) -> {함수 본문내용}
        //매개변수가 없으면 빈 괄호
        //매개변수가 1개일 때는 괄호 생략 가능
        //본문이 1문장만 있으면 중괄호 생략가능
        
        Collections.sort(persons, (Person 01, Person 02)) -> {
        	if(o1.name)
        }
        System.out.println(persons);
         
    }
}
