class Cat extends Animal {
    public void sound() {
        System.out.println("Meow");
    }
    public Cat() {
        //хищник, питается мясом и молоком
        super(false, "milk and meat");
    }
}
