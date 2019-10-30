public class MyClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.setName("Gevorik");
        System.out.println(myObj.getName());
    }
}