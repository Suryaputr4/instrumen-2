public class in{
    public static void main(String[] args) {
        System.out.println(System.in);
    

    instrument a = new instrument("Guitar", 101.5);
    instrument b = new instrument("piano" , 200.0);
    instrument c = new instrument("Violin " ,150.0);

        a.setType("Guitar");
        a.setPrice(101.5);
        b.setType ("piano");
        b.setPrice(200.0) ;
        c.setType("violin");
        c.setPrice(150.0);
        a.print();
        b.print();
        c.print();


        //Membandingkan harga alat musik
        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Harga alat musik termahal adalah " + a.getType());
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Harga alat musik termahal adalah " + b.getType());
        } else if (c.getPrice() > a.getPrice() && c.getPrice() > b.getPrice()) {
            System.out.println("Harga alat musik termahal adalah " + c.getType());
        }
        
        
        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Harga alat musik Termurah adalah " + a.getType());}
        else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Harga alat musik Termurah adalah " + b.getType());
        } else if (c.getPrice() < a.getPrice() && c.getPrice() < b.getPrice()) {
            System.out.println("Harga alat musik Termurah adalah " + c.getType());
        }
    }

    
    }