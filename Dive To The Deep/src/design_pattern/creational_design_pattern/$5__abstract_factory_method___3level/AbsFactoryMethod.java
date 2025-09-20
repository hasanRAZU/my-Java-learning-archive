package design_pattern.creational_design_pattern.$5__abstract_factory_method___3level;




// Level 1 Abstraction
interface Shirt{
    abstract void make();
}
interface Pant{
    abstract void make();
}

class ExportShirt implements Shirt{
    @Override
    public void make() {
        System.out.println("Exporting Shirt ...");
    }
}

class ExportPant implements Pant{
    @Override
    public void make() {
        System.out.println("Exporting Pant ...");
    }
}

class LocalShirt implements Shirt{
    @Override
    public void make() {
        System.out.println("Local Shirt ...");
    }
}

class LocalPant implements Pant{
    @Override
    public void make() {
        System.out.println("Local Pant ...");
    }
}








// Level 2 Abstraction
interface Garments{
    Shirt shirt();
    Pant pant();
}
class ExportGarments implements Garments{
    @Override
    public Shirt shirt() {return new ExportShirt();}
    @Override
    public Pant pant() {return new ExportPant();}
}

class LocalGarments implements Garments{
    @Override
    public Shirt shirt() {return new LocalShirt();}
    @Override
    public Pant pant() {return new LocalPant();}
}




// Level 3 Abstraction
class GarmentsAdapter{
    public Garments getGarments(GarmentsType garmentsType){
        if(garmentsType == GarmentsType.EXPORT){
            return new ExportGarments();
        }
        else if(garmentsType == GarmentsType.LOCAL){
            return new LocalGarments();
        }
        else return null;
    }
}







// Main Class
public class AbsFactoryMethod {
    static void main() {
        GarmentsAdapter adapter = new GarmentsAdapter();


        Garments garments1 = adapter.getGarments(GarmentsType.EXPORT);
        garments1.pant().make();
        garments1.shirt().make();


        Garments  garments2 = adapter.getGarments(GarmentsType.LOCAL);
        garments2.pant().make();
        garments2.shirt().make();
    }
}

