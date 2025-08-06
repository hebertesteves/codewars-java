package kyu8;

public class ClassyExtentions {
    public class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public String speak() {
            return this.name + " meows.";
        }
    }

    public abstract class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public abstract String speak();
    }
}
