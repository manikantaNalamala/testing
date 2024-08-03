package hashSet;

import java.util.HashSet;
import java.util.Set;

public class CustomUserDefinedExample {

	static class teachers {
		private int age;
		private String name;

		public teachers(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			teachers other = (teachers) obj;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "teachers [age=" + age + ", name=" + name + "]";
		}

	}

	public static void main(String[] args) {

		Set<teachers> schoolTeachers = new HashSet<>();
		teachers t1 = new teachers(25, "Mani");
		teachers t2 = new teachers(26, "kanta");
		// it allows duplicates,so we have to override the hash&equals
		teachers t3 = new teachers(25, "Mani");
		schoolTeachers.add(t1);
		schoolTeachers.add(t2);
		schoolTeachers.add(t3);

		System.out.println(schoolTeachers);

	}

}
