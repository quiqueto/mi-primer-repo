// Se usa en Encapsulacion3.java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }

  public String Bienvenida(){
  	return ("Bienvenido " + this.getName());
  }
}
