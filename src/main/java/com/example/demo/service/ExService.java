package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExService {

    

  

//    private final ExController exController;

	private static final Logger log = LoggerFactory.getLogger(ExService.class);


    


//    ExService(ExController exController) {
//        this.exController = exController;
//    }

	public String sayHello(String hi) {
		String msg = hi + "좋은날";
		System.out.println(msg);
		log.info(msg);
		return msg;
	}

//----------------------------------
	public String ex70() {
		String result = "";

		int number = 1;

		if (number == 1) {

			result = "if 블럭입니다";
		} else if (number == 2) {
			result = "else if 블럭입니다.";
		} else {
			result = "elese 블럭입니다.";
		}
		System.out.println(result);
		log.info(result);

		String msg = "ex70 결과는 : " + result;

		return msg;
	}

	public Integer ex70_int() {
		log.info("999");
		return 999;
	}

//----------------------------------
	public String ex322() {
		String result = "";
		int[] array = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {
			String msg = "i = " + array[i];
			result += msg + "<br>";
		}
		System.out.println(result);
		log.info(result);
		return result;
	}

	public interface Car {
		public String getColor();
	}

	public class Sonata implements Car {
		public Sonata() {
			log.info("===출고===sonata");
		}

		@Override
		public String getColor() {
			return "=== 색상:red===sonata";
		}
	}

	public class K5 implements Car {

		public K5() {
			log.info("===출고===k5");
		}

		@Override
		public String getColor() {
			return "=== 색상:yellow===k5";
		}
	}

//----------------------------------	
	public String ex324() {
		Car car1 = new Sonata();
		String re1 = car1.getColor();
		Car car2 = new K5();
		String re2 = car2.getColor();

		String result = re1 + "<br>" + re2 + "<br>" + "차 두대를 출고";
		return result;
	}
//----------------------------------

	public String ex325() {
		String result = "";

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		for (int i = 0; i < list.size(); i++) {
			result += "list[" + i + "] = " + list.get(i) + "<br>";
		}
		System.out.println(result);
		log.info(result);
		return result;
	}

//----------------------------------
	public String ex326() {

		String result = "";

		List<String> list = new ArrayList<>();

		list.add("public");
		list.add("static");
		list.add("void");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			result += list.get(i) + "<br>";
		}
		list.remove(1);
		int voidIndex = list.indexOf("void");

		result += "<br>void의 index = " + voidIndex;

		System.out.println("void의 index = " + voidIndex);
		log.info(result);
		return result;
	}

//--------------------

	public String ex327() {

		String result = "";

		String str1 = new String("is same?");
		String str2 = new String("is same?");

		// 객체 비교
		result += "str1 == str2 : " + (str1 == str2) + "<br>";
		// 값 비교
		result += "str1.equals(str2) : " + str1.equals(str2) + "<br>";

		result += "< ex327, ex328 >";

		System.out.println(result);

		return result;
	}

//--------------------------------------

	public String ex331() {
		String result = "";

		List<String> list = new ArrayList<>();

		list.add("public");
		list.add("static");
		list.add("void");

		// 익명클라스방식(오름차순)
		list.sort(new Comparator<String>() {

			@Override

			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
		});

		result += "익명 클라스 정렬: " + list + "<br>";

		// 람다식 방식
		list.sort((Comparator<String>) (str1, str2) -> str1.compareTo(str2));

		result += "람다식 정렬: " + list;

		System.out.println(result);
		log.info(result);
		return result;
	}

//--------------------------------------

	public String ex332() {
		String result = "";

		List<String> list = new ArrayList<>();
		list.add("public");
		list.add("static");
		list.add("void");

		list.forEach(str -> {
			System.out.println(str);
			log.info(str);
		});

		for (String str : list) {
			result += str + "<br>";
		}

		return result;
	}

	public String ex333() {
		String result = "";
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(integerArray);
		List<Integer> evenList = new ArrayList<>();

		// 짝수 필터링
		for (int i = 0; i < list.size(); i++) {
			Integer number = list.get(i);
			if (number % 2 == 0) {
				evenList.add(number);
			}
		}
		// 출력
		for (int num : evenList) {
			System.out.println(num);
			result += num + "<br>";
		}

		log.info(result);
		return result + "<br>" + "+ ex334, ex336";
	}

	public String ex335() {
		String result = "";

		Integer[] integerArray = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(integerArray);

		for (Integer value : list) {
			System.out.println(value);
			result += value + "<br>";
		}

		log.info(result);
		return result;
	}

	public String ex337() {
		String result = "";

		Integer[] integerArray = { 1, 1, 1, 1, 2, 2, 2, 3, 3, 4 };
		List<Integer> list = Arrays.asList(integerArray);

		List<Integer> distinctList = list.stream().distinct().toList();

		for (Integer value : distinctList) {
			System.out.println(value);
			result += value + "<br>";
		}

		log.info(result);
		return result;
	}

	public String ex338() {
		String result = "";

		String[] lowercaseArray = { "public", "static", "void" };
		List<String> lowercaseList = Arrays.asList(lowercaseArray);

		List<String> uppercaseList = lowercaseList.stream()

				.map(value -> value.toUpperCase())
				.toList();
		
		for(String value : uppercaseList) {
			System.out.println(value);
			result += value + "<br>";
		}
		
		log.info(result);
		return result;
	}

	public String ex339() {
		String result = "";
		
		String isThisNull = getSomeString();
		
		if (isThisNull !=null) {
			String upper = isThisNull.toUpperCase();
			System.out.println(upper);
			result += upper + "<br>";
		}else {
			System.out.println("값이 null입니다.");
			result += "값이 null입니다.<br>";
		}
		
		log.info(result);
		return result;
	}
	private String getSomeString() {
		return null;
	}

	public String ex3310() {
		String result = "";
		
		String isThisNull = getNullableString();
		
		if (isThisNull != null) {
			String upper = isThisNull.toUpperCase();
			System.out.println(upper);
			result += upper + "<br>";
		}else {
			System.out.println("값이 null입니다");
			result += "값이 null입니다.<br>";
		}
		log.info(result);
		return result;
	}
	private String getNullableString() {
		return  null;
	}

	public String ex3311() {
		String result = "";
		
		Optional<String> optionalValue = getOptionalString();
		
		optionalValue.ifPresent(str -> {
	        String upper = str.toUpperCase();
	        System.out.println(upper);
	        log.info(upper);
	    });
		
		 if (optionalValue.isEmpty()) {
		        System.out.println("값이 없습니다(optional.empty)");
		        result = "값이 없습니다.(optional.empty)<br>";
		    } else {
		        result = "값이 존재합니다.<br>";
		    }
		
		log.info(result);
		return null;
	}
	private Optional<String> getOptionalString() {
		return Optional.empty();
	}

	
	public String ex3312() {
		String result = "";

	  
	    Optional<String> optionalValue = getOptionalnullString();

	
	    optionalValue.ifPresent(str -> {
	        String upper = str.toUpperCase();
	        System.out.println(upper);  
	        log.info(upper);            
	    });

	
	    if (optionalValue.isPresent()) {
	        result = "값이 존재합니다. (콘솔에서 대문자로 확인)<br>";
	    } else {
	        result = "값이 없습니다. (optional.empty)<br>";
	    }

	    log.info(result);
	    return result;
	}

	private Optional<String> getOptionalnullString() {
	    return Optional.ofNullable("public static void");
	
	}

	public String ex3313() {
		 String result = "";

		    //null일 수도 있는 값을 Optional로 감싸기
		    Optional<String> str = getOptionalupString();

		    // 값이 존재하면 대문자로 변환 후 출력
		    if (str.isPresent()) {
		        String upper = str.get().toUpperCase();
		        System.out.println(upper);  // 콘솔 출력
		        log.info(upper);
		        result = upper + "<br>";    // 브라우저 출력용
		    } else {
		        System.out.println("값이 없습니다(optional.empty)");
		        result = "값이 없습니다.(optional.empty)<br>";
		    }

		    log.info(result);
		    return result;
		}

		private Optional<String> getOptionalupString() {
		    return Optional.ofNullable("public static void");
		}

		public String ex3314() {
			 String result = "";

			    //null일 수도 있는 값을 안전하게 Optional로 감싸기
			    Optional<String> str = getOptionalifpString();

			    // 값이 있을 때만 실행됨
			    str.ifPresent(string -> {
			        String upper = string.toUpperCase();
			        System.out.println(upper);  // 콘솔 출력
			        log.info(upper);            // 서버 로그 출력
			    });

			    // 브라우저 출력용
			    if (str.isPresent()) {
			        result = "값이 존재합니다. (콘솔에서 대문자로 확인)<br>";
			    } else {
			        result = "값이 없습니다.(optional.empty)<br>";
			    }

			    log.info(result);
			    return result;
			}

			// null일 수도 있는 값을 Optional로 감싸는 메서드
			private Optional<String> getOptionalifpString() {
			    return Optional.ofNullable("public static void");
			}
	
	
}
