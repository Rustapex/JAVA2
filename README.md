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
```

### 주요 디렉토리 설명

| 경로 | 설명 |
|---|---|
| `day1/src/builder` | Builder Pattern과 내부 클래스 실습 |
| `day1/src/comparator` | Comparator, Lambda, 정렬 방식 실습 |
| `src` | 기타 Java 문법 실습 코드 |
| `.classpath`, `.project` | Eclipse Java Project 설정 파일 |

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
