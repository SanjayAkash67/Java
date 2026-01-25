public class Encap {
    private String name;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.setName("John Doe");
        System.out.println("Name: " + obj.getName());
    }

}

