class Emp {
    int id;
    String name;
    Adress adress;
    static String ceo="Gagik Papoyan";

public Emp(int id, String name, Adress adress, String ceo){
    this.id=id;
    this.name=name;
    this.adress=adress;
}
void display(){
    System.out.println(id + " " + name);
    System.out.println(adress.city+ " " +adress.state+ " " +adress.country + " " + ceo);
    }

public static void main(String[] args) {
    Adress adress1 = new Adress("Yerevan", "ARM", "Armenia" );
    Adress adress2 = new Adress("Gyumri", "ARM", "Armenia");

    Emp e1 = new Emp(111, "Karapet", adress1, ceo);
    Emp e2 = new Emp(222, "Vazgen", adress2, ceo);

    e1.display();
    e2.display();

    }
}
