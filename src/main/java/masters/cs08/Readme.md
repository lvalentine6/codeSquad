cs08
---------------------

### 키워드
* 함수형 프로그래밍
  * 부수 효과 없이 순수 함수를 만들어 모듈화 수준을 높이는 선언형 프로그래밍 패러다임
  * 부수 효과와 순수 함수
    * 부수 효과란 주어진 값 이외에 외부 변수 및 프로그램 실행에 영향을 끼치지 말아야 한다는 것이며 부수 효과를 만족하는 함수를 순수 함수라고 한다.
  * 함수형 프로그래밍은 선언적 함수를 통해 무엇을 처리해야할지 결정하는 것이다.
* 일급 객체(시민)
  * 세가지의 조건을 모두 만족해야 일급 객체이다.
    * 변수나 데이터를 할당할 수 있다.

```  kotlin
object Main {
      @JvmStatic
      fun main(args: Array<String>) {
      val a = test
      }

    val test: () -> Unit = { println("kotlin") }
    }
```

```java

public class java {

    public static void test(){
        System.out.println("java");
    }

    public static void main(String[] args) {
        System.out.println("java");
//        Object a = test;
    }
}
```

* 메서드의 인자로 사용할 수 있다.
```kotlin
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        function(test)
    }

    fun function(f: () -> Unit) {
       f.invoke()
    }

    val test: () -> Unit = { println("kotlin") }
}
```
* function 함수의 파라미터로 함수를 전달한다.

* 리턴값으로 사용할 수 있다.
```kotlin
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        function()
    }

    fun function(): () -> Unit {
        return { println("kotlin") }
    }

}
```
* 함수를 함수 리턴값으로 사용하고 있다.

* 클로저
  * 클로저는 람다의 구현체이다.
  * 자바에서 클로저는 람다식이나 내부 클래스 같은 영역 안에서 외부에서 정의된 변수를 사용하는 방식을 의미한다.
  * 클로저에서 아용된 변수를 자유 변수라고 하며, 자유 변수는 코드 블곡 안에서 정의되거나 매개 변수가 아닌데 사용되는 변수를 의미한다.  
  * 자유 변수는 값을 변경할 수 없어야 한다.
  * 람다는 매개변수만을 참조하고 클로저는 외부 변수를 참조한다.
  * [람다와 클로저](https://futurecreator.github.io/2018/08/09/java-lambda-and-closure/)

```java
class CodeRunner {
    public static void main(String args[]) {
    	int a = 3; // 자유 변수
        InterfaceRamda interfaceRamda = i -> i + a; // 클로저
        System.out.println(interfaceRamda.test(11));
    }
}

@FunctionalInterface
interface InterfaceRamda {
    int test(int n);
}
```

* 고차 함수
  * 고차 함수의 조건
    * 함수를 파라미터로 받는 함수
    * 함수를 리턴하는 함수
  * 고차 함수는 일급 객체여야 한다.

* 람다와 스트림

### 기능 요구 사항
* 완전수(perfect)
  * 자기 자신을 제외한 양의 약수를 더했을 때 자기 자신이 되는 양의 정수이다.
* 과잉수(abundant)
  * 자연수 중 자기 자신을 제외한 양의 약수를 모두 더했을 때 자기 자신보다 더 커지는 수이다.
* 부족수(deficient)
  * 자연수 중 자기 자신을 제외한 양의 약수를 모두 더했을 때 자기 자신보다 더 작은 수이다.
* 소수(prime)
  * 약수가 1과 자기자신인 수이다.
* 정사각수(squared)
  * 어떤 자연수의 제곱이 되는 수이다.
  * 정사각수는 1부터 시작하는 연속된 홀수의 합과 같다.
