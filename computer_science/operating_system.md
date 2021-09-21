# 운영체제

- [프로세스의 의미](#프로세스의-의미)
- [프로세스의 구성요소](#프로세스의-구성-요소)
  - 전역변수와 static 변수의 차이점은?
- [프로세스 스케줄링이란?](#프로세스-스케줄링)
- [프로세스의 상태변화를 설명하시오](#프로세스의-상태변화)
  - Running > Ready 와 Running > Blocked의 차이점은?



> ## 프로세스의 의미

메모리 할당이 이루어지고 실행중인 프로그램을 의미



> ## 프로세스의 구성 요소

| 구성 요소 | 내용                     |
| --------- | ------------------------ |
| code      | 실행파일의 명령어가 저장 |
| data      | 전역변수, static 변수    |
| stack     | 지역변수, 인자값 등      |
| heap      | 동적할당을 위해 존재     |

### 전역변수와 static 변수의 차이점은?

- ##### 전역변수

  다른 파일에서도 쓸 수 있는 변수

- ##### static변수

  선언된 파일만 접근 가능한 변수



> ## 프로세스 스케줄링

프로세스의 CPU할당 순서 및 방법을 결정하는 일

- ##### 스케줄러

  스케줄링을 담당하는 소프트웨어 요소. 운영체제의 요소이다.

  

> ## 프로세스의 상태변화

<img src="C:\Users\wkdwl\AppData\Roaming\Typora\typora-user-images\image-20210921120500417.png" alt="image-20210921120500417" style="zoom:50%;margin-left:0" />

1. ### Start > Ready

   프로세스가 생성된 상태. 프로세스는 생성되면 바로 Ready상태가 되어 CPU할당을 기다린다

2. ### Ready > Running

   프로세스가 스케줄러에 의해 선택되어 CPU에서 실행되는 상태

3. ### Running > Ready

   우선순위가 더 높은 프로세스가 생겨서 실행되던 프로세스가 Ready상태로 변경

4. ### Running > Blocked

   데이터 입,출력으로 blocked상태로 변경

5. ### Blocked > Ready

   데이터 입,출력 완료 후 Ready상태로 변경

6. ### Blocked > Exit

   프로세스 종료



### Running > Ready 와 Running > Blocked의 차이점

- ##### **Running > Ready**

  우선순위가 더 높은 프로세스에게 CPU를 양보하는 과정

- ##### **Running > Blocked**

  는 데이터 입,출력 때문에 프로세스가 Blocked되는 과정
