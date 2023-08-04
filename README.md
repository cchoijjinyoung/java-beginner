# java-beginner


- 미니과제 5 - 사용자에게 년/월을 입력받고 달력 출력하기.
  - [x] LocalDate를 사용하여 달력 만들기
  - [x] Calendar를 사용하여 달력 만들기.
    - cal.set(Calendar.MONTH, '사용자 입력(mm)')으로 month를 세팅하려고 했다. 
    - 사용자가 8월을 입력해도 7월이라는 값이 들어갔다. 
    - 이유는 Calendar 클래스에 JANUARY 와 같이 월 값들이 작성돼있었다.
    - JANUARY = 0부터 DECEMBER = 11로 작성되어있다.
  - [] Date를 사용하여 달력 만들기.