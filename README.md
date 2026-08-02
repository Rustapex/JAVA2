# 3. Rustapex/JAVA2 — README.md

````md
# Java 객체지향 및 응용 문법 실습 모음

> Java 기초 학습 이후 Builder Pattern, 내부 클래스, Comparator, Lambda 등 조금 더 진전된 Java 문법과 객체지향 개념을 예제 중심으로 실습한 저장소입니다.

<br>

## 목차

1. [프로젝트 소개](#1-프로젝트-소개)
2. [주요 실습 내용](#2-주요-실습-내용)
3. [기술 스택](#3-기술-스택)
4. [프로젝트 구조](#4-프로젝트-구조)
5. [실행 방법](#5-실행-방법)
6. [구현 및 학습 포인트](#6-구현-및-학습-포인트)
7. [테스트 및 검증](#7-테스트-및-검증)
8. [개선 예정 사항](#8-개선-예정-사항)
9. [참고 사항](#9-참고-사항)

<br>

## 1. 프로젝트 소개

이 저장소는 Java 기초 학습 이후 조금 더 진전된 문법과 객체지향 개념을 실습한 학습용 저장소입니다.

Builder Pattern, 내부 클래스, Comparator, Lambda, Method Reference, Collection 처리 등 Java 문법을 예제 중심으로 작성하며 학습했습니다.

완성된 하나의 애플리케이션이라기보다는, Java 기초 이후의 문법을 더 깊게 이해하기 위한 실습 모음입니다.

주요 목표는 다음과 같습니다.

* Java 객체지향 문법의 활용 방식 학습
* Builder Pattern을 통한 객체 생성 방식 이해
* 내부 클래스와 캡슐화 개념 확인
* Comparator를 활용한 객체 정렬 실습
* Lambda와 Method Reference를 통한 코드 표현 방식 학습

<br>

## 2. 주요 실습 내용

### 객체지향 및 생성 패턴

* Builder Pattern 직접 구현
* static 내부 클래스 사용
* 메서드 체이닝 방식의 객체 생성
* 생성자 방식과 Builder 방식 비교

### 객체 정렬

* `Comparator` 직접 구현
* 익명 클래스를 활용한 정렬
* Lambda를 활용한 정렬
* `Comparator.comparing()` 사용
* Method Reference 기초

### Java 응용 문법

* 내부 클래스
* 컬렉션 처리
* 함수형 인터페이스 기초
* Lambda 표현식
* Stream 기초 실습

<br>

## 3. 기술 스택

| 구분 | 기술 |
|---|---|
| Language | Java 17 |
| Runtime | JDK 17 |
| Tool | Eclipse |
| Core API | Collections, Comparator, Function, Stream |
| Project Type | Java Practice, Console Application |

<br>

## 4. 프로젝트 구조

이 저장소는 Java 문법 실습 파일을 주제별 또는 날짜별로 정리한 구조입니다.

```text
JAVA2/
├── day1/
│   └── src/
│       ├── builder/
│       └── comparator/
├── src/
├── .classpath
├── .project
└── README.md
````

### 주요 디렉토리 설명

| 경로                       | 설명                           |
| ------------------------ | ---------------------------- |
| `day1/src/builder`       | Builder Pattern과 내부 클래스 실습   |
| `day1/src/comparator`    | Comparator, Lambda, 정렬 방식 실습 |
| `src`                    | 기타 Java 문법 실습 코드             |
| `.classpath`, `.project` | Eclipse Java Project 설정 파일   |

<br>

## 5. 실행 방법

이 저장소는 Java 기초 이후의 문법을 예제 단위로 실습한 저장소입니다.
전체 저장소를 하나의 프로그램으로 실행하는 구조가 아니라, 각 예제 클래스의 `main()` 메서드를 실행하여 결과를 확인합니다.

### 5-1. 저장소 클론

```bash
git clone https://github.com/Rustapex/JAVA2.git
cd JAVA2
```

### 5-2. Eclipse에서 프로젝트 Import

```text
File → Import → Existing Projects into Workspace
```

### 5-3. Java 파일 실행

실행하려는 클래스의 `main()` 메서드를 실행합니다.

```text
Run As → Java Application
```

<br>

## 6. 구현 및 학습 포인트

### 6-1. Builder Pattern 직접 구현

* 생성자의 매개변수가 많아질 때 발생하는 가독성 문제를 Builder Pattern 예제로 확인했습니다.
* static 내부 클래스를 사용하여 객체 생성 과정을 분리했습니다.
* 메서드 체이닝 방식으로 객체를 생성하면서 생성자 방식과 Builder 방식의 차이를 실습했습니다.

### 6-2. 내부 클래스와 캡슐화

* 클래스 내부에 밀접한 클래스를 정의하는 구조를 실습했습니다.
* Builder처럼 특정 클래스와 강하게 연관된 객체 생성 로직을 내부 클래스로 분리했습니다.
* 내부 클래스가 객체 생성 책임을 분리하는 방식으로 활용될 수 있음을 확인했습니다.

### 6-3. Comparator 정렬 방식 비교

* 객체 리스트를 정렬하기 위해 `Comparator`를 직접 구현했습니다.
* 익명 클래스, Lambda, `Comparator.comparing()` 방식으로 같은 정렬을 다르게 표현해보았습니다.
* 코드 표현이 점점 간결해지는 흐름을 비교하며 Java 정렬 구조를 이해했습니다.

### 6-4. Lambda와 함수형 문법 기초

* 익명 클래스로 작성한 코드를 Lambda 표현식으로 바꾸는 과정을 실습했습니다.
* `Function`, `Comparator`, Method Reference 등을 통해 함수형 문법의 기본 사용 방식을 확인했습니다.
* Java 기초 문법 이후 더 나아간 문법을 이해하기 위한 실습으로 정리했습니다.

<br>

## 7. 테스트 및 검증

이 저장소는 별도의 자동화 테스트보다 콘솔 실행 결과를 통해 실습 내용을 검증했습니다.

### 주요 검증 범위

* Java 파일 컴파일 여부 확인
* `main()` 메서드 실행 결과 확인
* Builder 객체 생성 결과 확인
* Comparator 정렬 결과 확인
* Lambda 표현식 동작 결과 확인

<br>

## 8. 개선 예정 사항

현재 저장소를 기준으로 앞으로 개선하면 좋은 사항입니다.

* `JAVA` 저장소와 역할이 겹치지 않도록 주제별 설명 보강
* Builder, Comparator, Lambda 등 대표 예제에 설명 추가
* 주제별 패키지 구조 정리
* 콘솔 실행 결과 예시 추가
* 임시 파일과 학습용 예제 파일 구분

<br>

## 9. 참고 사항

### 프로젝트 형태

* 프로젝트 형태: 개인 학습 / Java 수업 실습 모음
* 실행 방식: Java 파일별 `main()` 메서드 실행
* 저장소 성격: Java 기초 이후의 응용 문법 학습 기록

### 참고

* 이 저장소는 완성 애플리케이션이 아니라 Java 문법 학습을 위한 예제 중심 저장소입니다.
* `JAVA` 저장소가 Java 기초와 알고리즘 풀이 중심이라면, 이 저장소는 객체지향 문법과 Lambda 등 조금 더 진전된 Java 문법 실습에 초점을 둡니다.

````

---

# 4. Rustapex/spring-legacy — README.md

```md
# Spring Legacy MVC 실습 모음

> Spring Legacy MVC 환경에서 Maven, JSP, MyBatis, Oracle DB 연동 구조를 제공 자료 기반으로 실습한 Spring 학습 저장소입니다.

<br>

## 목차

1. [프로젝트 소개](#1-프로젝트-소개)
2. [주요 실습 내용](#2-주요-실습-내용)
3. [기술 스택](#3-기술-스택)
4. [프로젝트 구조](#4-프로젝트-구조)
5. [실행 방법](#5-실행-방법)
6. [구현 및 학습 포인트](#6-구현-및-학습-포인트)
7. [테스트 및 검증](#7-테스트-및-검증)
8. [개선 예정 사항](#8-개선-예정-사항)
9. [참고 사항](#9-참고-사항)

<br>

## 1. 프로젝트 소개

이 저장소는 Spring Legacy MVC 수업 과정에서 제공된 자료를 기반으로 Spring MVC 구조와 MyBatis, Oracle DB 연동 흐름을 실습한 저장소입니다.

Spring Boot가 아닌 Spring Framework 기반의 Legacy MVC 프로젝트 구조를 다루며, Maven 의존성 관리, Controller 요청 처리, JSP View 응답, MyBatis Mapper 연동 방식을 확인했습니다.

완성된 CRUD 서비스라기보다는, Spring Legacy 환경의 기본 구조와 DB 연동 흐름을 학습하기 위한 실습 모음입니다.

주요 목표는 다음과 같습니다.

* Spring Legacy MVC 프로젝트 구조 이해
* Maven 기반 의존성 관리 방식 학습
* Controller와 View 연결 흐름 실습
* MyBatis와 Oracle DB 연동 구조 확인
* Servlet/JSP 이후 Spring MVC로 확장되는 흐름 이해

<br>

## 2. 주요 실습 내용

### Spring MVC 구조

* `@Controller`를 이용한 요청 처리
* `@RequestMapping` 기반 URL 매핑
* Model을 이용한 데이터 전달
* View 이름 반환을 통한 JSP 응답 흐름 확인

### Maven 프로젝트 구성

* `pom.xml` 기반 의존성 관리
* WAR 패키징 구조 확인
* Spring MVC, MyBatis, Oracle JDBC, JSP/JSTL 의존성 구성

### MyBatis / Oracle DB 연동

* MyBatis 설정 방식 확인
* `SqlSession`을 통한 Mapper 호출 구조 실습
* Repository 계층에서 DB 접근 흐름 확인
* Oracle JDBC를 활용한 DB 연결 실습

### JSP View 실습

* JSP를 이용한 화면 출력
* JSTL 기반 서버 데이터 표현
* Spring Controller에서 전달한 데이터를 View에서 확인

<br>

## 3. 기술 스택

| 구분 | 기술 |
|---|---|
| Language | Java 11 |
| Backend | Spring Framework 5.0.7, Spring MVC |
| View | JSP, JSTL |
| Database | Oracle DB |
| SQL Mapper | MyBatis, mybatis-spring |
| Build | Maven |
| Server | Apache Tomcat |
| Test | JUnit 4 |
| Tool | Eclipse / STS |

<br>

## 4. 프로젝트 구조

```text
spring-legacy/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── acorn/
│   │   │           └── batis/
│   │   ├── resources/
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           └── views/
│   └── test/
├── pom.xml
└── README.md
````

### 주요 디렉토리 설명

| 경로                   | 설명                                       |
| -------------------- | ---------------------------------------- |
| `src/main/java`      | Controller, Repository, 도메인 객체 등 Java 코드 |
| `src/main/resources` | Spring, MyBatis 등 설정 파일 위치               |
| `src/main/webapp`    | JSP, WEB-INF 등 웹 리소스                     |
| `WEB-INF/views`      | JSP View 파일 위치                           |
| `pom.xml`            | Maven 의존성 및 빌드 설정                        |

<br>

## 5. 실행 방법

이 저장소는 Spring Legacy MVC 실습 프로젝트입니다.
Eclipse 또는 STS에서 Maven Project로 import한 뒤, Apache Tomcat 서버에 추가하여 실행합니다.

### 5-1. 저장소 클론

```bash
git clone https://github.com/Rustapex/spring-legacy.git
cd spring-legacy
```

### 5-2. Eclipse 또는 STS에서 Import

```text
File → Import → Existing Maven Projects
```

### 5-3. Maven 의존성 갱신

```text
Project 우클릭 → Maven → Update Project
```

### 5-4. Tomcat 서버 설정

```text
Servers → New → Server → Apache Tomcat
```

### 5-5. DB 설정

Oracle DB 연동이 필요한 실습은 로컬 Oracle DB 환경과 접속 설정이 필요합니다.

README에는 실제 DB 계정, 비밀번호, 접속 정보는 포함하지 않습니다.
필요한 경우 예시 값으로 별도 설정 파일을 작성합니다.

```properties
DB_URL=jdbc:oracle:thin:@localhost:1521:xe
DB_USERNAME=your-username
DB_PASSWORD=your-password
```

### 5-6. 프로젝트 실행

```text
Run on Server
```

접속 주소는 프로젝트 context path에 따라 달라질 수 있습니다.

```text
http://localhost:8080/[context-path]
```

<br>

## 6. 구현 및 학습 포인트

### 6-1. Spring MVC 요청 처리 흐름

* `@Controller`와 `@RequestMapping`을 사용하여 클라이언트 요청을 처리하는 흐름을 실습했습니다.
* Controller에서 Model에 데이터를 담고 View 이름을 반환하는 구조를 확인했습니다.
* Servlet/JSP에서 직접 처리하던 흐름이 Spring MVC에서 어떻게 분리되는지 학습했습니다.

### 6-2. Maven 기반 의존성 관리

* `pom.xml`을 통해 Spring MVC, MyBatis, Oracle JDBC, JSP/JSTL, JUnit 등의 의존성을 관리했습니다.
* 라이브러리를 직접 추가하는 방식이 아니라 Maven을 통해 프로젝트 의존성을 구성하는 흐름을 확인했습니다.
* WAR 패키징 구조의 Spring Legacy 프로젝트를 다루는 경험을 정리했습니다.

### 6-3. MyBatis와 Oracle DB 연동

* `SqlSession`과 Mapper namespace를 사용하여 DB 접근 구조를 실습했습니다.
* Repository 계층에서 SQL Mapper를 호출하는 흐름을 확인했습니다.
* 완성된 CRUD 서비스보다는 Spring과 MyBatis가 연결되는 기본 구조를 학습하는 데 초점을 두었습니다.

### 6-4. JSP View 응답

* Spring Controller에서 전달한 데이터를 JSP에서 출력하는 흐름을 실습했습니다.
* View Resolver와 JSP 경로 구조를 확인했습니다.
* Spring MVC에서 Controller와 View가 분리되는 방식을 학습했습니다.

<br>

## 7. 테스트 및 검증

이 저장소는 제공 자료 기반 실습 프로젝트이므로, 자동화 테스트보다는 실행과 화면 확인 중심으로 검증했습니다.

### 주요 검증 범위

* Maven 의존성 로딩 확인
* Tomcat 서버 실행 확인
* Controller 요청 매핑 확인
* JSP View 응답 확인
* Oracle DB 연결이 필요한 실습의 경우 DB 조회 결과 확인
* MyBatis Mapper 호출 흐름 확인

<br>

## 8. 개선 예정 사항

현재 저장소를 기준으로 앞으로 개선하면 좋은 사항입니다.

* 제공 자료 기반 실습 코드와 직접 수정한 코드 구분
* DB 접속 정보 예시화
* 실습별 실행 순서 문서화
* Service 계층 분리 연습
* 예외 처리 구조 보강
* 완성 CRUD 프로젝트가 아니라 학습용 실습임을 README에 명확히 표시

<br>

## 9. 참고 사항

### 프로젝트 형태

* 프로젝트 형태: 개인 학습 / Spring 수업 실습 모음
* 실행 기준: Spring Legacy MVC, Maven, Apache Tomcat
* 저장소 성격: 제공 자료 기반 Spring Legacy 구조 학습 기록

### 참고

* 이 저장소는 완성된 CRUD 서비스가 아니라 Spring Legacy MVC 구조와 DB 연동 흐름을 학습하기 위한 실습 저장소입니다.
* 실제 DB 접속 정보, 계정, 비밀번호 등 민감 정보는 README에 포함하지 않습니다.

````

---

# 5. Rustapex/DATABASE — README.md

```md
# Oracle SQL 실습 모음

> Oracle DB를 기준으로 SQL 기본 문법, 페이징, 시퀀스, 계층 쿼리, 인덱스, 프로시저, 함수, 트리거를 실습한 데이터베이스 학습 저장소입니다.

<br>

## 목차

1. [프로젝트 소개](#1-프로젝트-소개)
2. [주요 실습 내용](#2-주요-실습-내용)
3. [기술 스택](#3-기술-스택)
4. [프로젝트 구조](#4-프로젝트-구조)
5. [실행 방법](#5-실행-방법)
6. [구현 및 학습 포인트](#6-구현-및-학습-포인트)
7. [테스트 및 검증](#7-테스트-및-검증)
8. [개선 예정 사항](#8-개선-예정-사항)
9. [참고 사항](#9-참고-사항)

<br>

## 1. 프로젝트 소개

이 저장소는 Oracle DB를 기준으로 SQL과 PL/SQL을 실습한 데이터베이스 학습 저장소입니다.

기본 SELECT 문부터 JOIN, 서브쿼리, 페이징, 시퀀스, 계층 쿼리, 인덱스, 프로시저, 함수, 트리거 등 Oracle 환경에서 사용하는 주요 SQL 문법과 DB 객체를 실습했습니다.

특정 서비스의 데이터베이스 설계 결과물이 아니라, Oracle SQL 문법과 데이터베이스 기능을 이해하기 위한 실습 모음입니다.

주요 목표는 다음과 같습니다.

* Oracle SQL 기본 문법 학습
* 테이블 생성과 데이터 조작 실습
* 페이징, 계층 쿼리, 인덱스 등 Oracle 주요 기능 확인
* PL/SQL 기반 프로시저, 함수, 트리거 작성 실습
* 웹 프로젝트에서 DB를 다루기 위한 SQL 기반 학습

<br>

## 2. 주요 실습 내용

### SQL 기본 문법

* SELECT 조회
* WHERE 조건 검색
* INSERT
* UPDATE
* DELETE
* COMMIT / ROLLBACK
* 테이블 생성 및 삭제

### Oracle SQL 실습

* `ROWNUM` 기반 페이징
* `FETCH FIRST` 문법
* 서브쿼리 기반 페이지 조회
* `SEQUENCE` 생성 및 사용
* JOIN
* 계층 쿼리
* `START WITH`
* `CONNECT BY PRIOR`
* `ORDER SIBLINGS BY`

### 인덱스 실습

* 인덱스 생성
* 인덱스 조회
* 인덱스 삭제
* 인덱스 사용 시 고려할 점 확인

### PL/SQL 실습

* PROCEDURE 작성 및 실행
* FUNCTION 작성 및 실행
* TRIGGER 작성 및 동작 확인
* `IN`, `OUT` 파라미터 실습
* `%TYPE`, `%ROWTYPE` 사용
* `DBMS_OUTPUT` 출력 확인

<br>

## 3. 기술 스택

| 구분 | 기술 |
|---|---|
| Database | Oracle DB |
| Language | SQL, PL/SQL |
| Tool | SQL Developer / DBeaver 등 SQL 실행 도구 |
| Concept | Sequence, Index, Procedure, Function, Trigger |
| Project Type | Database Practice |

<br>

## 4. 프로젝트 구조

이 저장소는 Oracle SQL 실습 파일을 모아둔 구조입니다.

```text
DATABASE/
├── *.sql
└── README.md
````

### 주요 파일 설명

| 구분          | 설명                              |
| ----------- | ------------------------------- |
| SQL 실습 파일   | Oracle SQL 문법과 DB 객체 실습 쿼리      |
| 테이블 생성 스크립트 | 실습용 테이블 생성 및 샘플 데이터 입력          |
| 조회 쿼리       | SELECT, JOIN, 서브쿼리, 페이징 등 조회 실습 |
| PL/SQL 예제   | 프로시저, 함수, 트리거 실습                |

<br>

## 5. 실행 방법

이 저장소는 Oracle DB 기준 SQL 실습 파일을 모아둔 저장소입니다.
Oracle DB에 접속한 뒤, 필요한 테이블 생성 SQL을 먼저 실행하고 각 실습 SQL 파일을 순서대로 실행하여 결과를 확인합니다.

### 5-1. 저장소 클론

```bash
git clone https://github.com/Rustapex/DATABASE.git
cd DATABASE
```

### 5-2. Oracle DB 접속

SQL Developer, DBeaver 등 Oracle DB 접속이 가능한 도구를 사용합니다.

```text
Host: localhost
Port: 1521
Service Name 또는 SID: 환경에 맞게 설정
Username: 사용자 계정
Password: 사용자 비밀번호
```

> 실제 DB 계정과 비밀번호는 README에 작성하지 않습니다.

### 5-3. SQL 파일 실행

1. 테이블 생성 SQL 실행
2. 샘플 데이터 INSERT 실행
3. SELECT / JOIN / 페이징 쿼리 실행
4. 프로시저, 함수, 트리거 등 PL/SQL 객체 생성
5. 실행 결과 확인

<br>

## 6. 구현 및 학습 포인트

### 6-1. Oracle 기준 페이징 쿼리

* `FETCH FIRST`, `ROWNUM`, 서브쿼리를 사용하여 Oracle에서 페이징을 처리하는 방식을 실습했습니다.
* 단순 조회와 페이지 단위 조회의 차이를 확인했습니다.
* 이후 웹 프로젝트에서 목록 조회와 페이징을 구현할 때 필요한 SQL 기반을 다졌습니다.

### 6-2. 시퀀스와 인덱스

* Oracle의 `SEQUENCE`를 사용하여 식별자 값을 생성하는 흐름을 실습했습니다.
* `INDEX` 생성, 조회, 삭제를 통해 조회 성능과 인덱스 관리 개념을 확인했습니다.
* 인덱스가 항상 좋은 것이 아니라 데이터 변경이 많은 경우 비용이 발생할 수 있다는 점을 실습을 통해 확인했습니다.

### 6-3. 계층 쿼리

* `START WITH`, `CONNECT BY PRIOR`를 사용하여 계층형 데이터를 조회하는 방식을 실습했습니다.
* 조직도나 댓글 구조처럼 부모-자식 관계를 가진 데이터를 조회하는 흐름을 확인했습니다.
* `ORDER SIBLINGS BY`를 통해 같은 계층 안에서 정렬하는 방식도 함께 실습했습니다.

### 6-4. PL/SQL 기초

* `PROCEDURE`, `FUNCTION`, `TRIGGER`를 작성하여 DB 내부에서 로직을 실행하는 방법을 실습했습니다.
* `IN`, `OUT` 파라미터, `%TYPE`, `%ROWTYPE`, `DBMS_OUTPUT` 등을 사용했습니다.
* 애플리케이션 코드 외에도 DB 내부에서 처리할 수 있는 로직 구조를 학습했습니다.

<br>

## 7. 테스트 및 검증

이 저장소는 별도의 테스트 프레임워크가 아니라 SQL 실행 결과를 통해 실습 내용을 검증했습니다.

### 주요 검증 범위

* 테이블 생성 여부 확인
* INSERT 후 데이터 조회 확인
* SELECT / JOIN / 서브쿼리 결과 확인
* 페이징 쿼리 결과 범위 확인
* 시퀀스 값 증가 확인
* 인덱스 생성 및 삭제 확인
* 프로시저, 함수, 트리거 실행 결과 확인

<br>

## 8. 개선 예정 사항

현재 저장소를 기준으로 앞으로 개선하면 좋은 사항입니다.

* SQL 파일을 주제별로 재분류
* 테이블 생성 → 데이터 입력 → 조회 → PL/SQL 객체 생성 순서로 실행 흐름 정리
* 실습용 테이블과 임시 테이블 구분
* Oracle 전용 문법임을 README에 명확히 표시
* 각 SQL 파일 상단에 실습 목적 주석 추가

<br>

## 9. 참고 사항

### 프로젝트 형태

* 프로젝트 형태: 개인 학습 / Oracle SQL 수업 실습 모음
* 실행 기준: Oracle DB
* 저장소 성격: SQLD 정리 문서가 아닌 Oracle SQL 및 PL/SQL 실습 기록

### 참고

* 이 저장소는 Oracle DB 기준으로 작성된 SQL 실습 파일을 포함합니다.
* 다른 DBMS에서는 일부 문법이 다르게 동작할 수 있습니다.
* 실제 DB 계정, 비밀번호, 접속 정보 등 민감 정보는 README에 포함하지 않습니다.

```
```
