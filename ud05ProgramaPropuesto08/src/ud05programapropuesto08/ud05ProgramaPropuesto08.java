package ud05programapropuesto08;

public class ud05ProgramaPropuesto08 {

    public static void main(String[] args) {
        Cola c = new Cola();
        
        System.out.println (c.desencolar());
        
        for (int i = 0; i < 10; i++) {
            c.encolar(i);
        }
        
        Integer num = c.desencolar();
        
        while (num != null) {
            System.out.print(num + " ");
            num = c.desencolar();
        }
    }
    
}
