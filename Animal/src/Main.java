public class Main {
    public void main(String[] args) {
        Cat cat  = new Cat();
        cat.sound();
    }
    public class Animal {

        private boolean vegetarian;
        private String eats;

        public Animal(){

        }

        public Animal(boolean veg, String food){
            this.vegetarian = veg;
            this.eats = food;
        }

        public void sound(){
        }

        public boolean isVegetarian() {
            return vegetarian;
        }

        public String getEats() {
            return eats;
        }
    }

    class Cat extends Animal{
        public void sound(){
            System.out.println("Meow");
        }
    }
}