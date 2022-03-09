class Main {

   public static void main(String[] args) {

       Animal temperal = new Gato();
       Animal bolinha = new Cachorro();
       Som bicho = new Som();
       bicho.falou(temperal);
       bicho.falou(bolinha);
   }

}



class Animal {

    public void som() {
        System.out.println("aaaaaaa");

    }

}

class Gato extends Animal {

    public void som() {

        System.out.println("Miau");

    }

}

class Cachorro extends Animal {

    public void som() {

        System.out.println("AuAu");

    }

}

class Som {



              public void falou(Animal a) {

        a.som();

    }

}
