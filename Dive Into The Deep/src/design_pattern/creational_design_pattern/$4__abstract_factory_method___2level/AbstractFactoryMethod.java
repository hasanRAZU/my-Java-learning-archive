package design_pattern.creational_design_pattern.$4__abstract_factory_method___2level;



interface Shirt{
    void make();
}
interface Pant{
    void make();
}

class ExportShirt implements Shirt{
    @Override
    public void make() {
        System.out.println("Export Quality Shirt");
    }
}

class LocalShirt implements  Shirt{
    @Override
    public void make() {
        System.out.println("Local Quality Shirt");
    }
}

class ExportPant implements Pant{
    @Override
    public void make() {
        System.out.println("Export Quality Pant");
    }
}

class LocalPant implements Pant{
    @Override
    public void make() {
        System.out.println("Local Quality Pant");
    }
}








interface Garments{
    Shirt shirt();
    Pant pant();
}

class ExportGarments implements Garments{
    @Override
    public Shirt shirt() {return  new ExportShirt();}
    @Override
    public Pant pant() {return  new ExportPant();}
}

class LocalGarments implements Garments{
    @Override
    public Shirt shirt() {return new LocalShirt();}
    @Override
    public Pant pant() {return new LocalPant();}
}












public class AbstractFactoryMethod{
    static void main() {

        // Export Garments
        ExportGarments exportGarments = new ExportGarments();
        exportGarments.pant().make();
        exportGarments.shirt().make();

        // Local Garments
        LocalGarments localGarments = new LocalGarments();
        localGarments.pant().make();
        localGarments.shirt().make();
    }
}