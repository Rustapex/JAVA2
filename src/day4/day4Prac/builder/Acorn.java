package day4.day4Prac.builder;

import java.lang.module.ModuleDescriptor.Builder;

public class Acorn {

	String id;
	String name;
	String address;
	int age;

	private Acorn(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
		this.age = builder.age;
	}

	// 기본 생성자 제공 x
	
	public static Builder build() {
		return new Builder();
	}

	// Builder class 생성 - inner class
	static class Builder {
		String id;
		String name;
		String address;
		int age;
		
		Builder id(String id) {
			this.id = id;
			return this;
		}
		Builder name(String name) {
			this.name = name;
			return this;
		}
		Builder address(String address) {
			this.address = address;
			return this;
		}
		Builder age(int age) {
			this.age = age;
			return this;
		}
		
		Acorn build() {
			return new Acorn(this);
		}
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	

}
