package chapter4_oopConcept.lecture5;

class Sofa{ }

class Table{ }

class Room { }

class Building{
    private Sofa sofa;
    private Table table;
    private Room room;

    public Building(Sofa sofa, Table table) {       // if building vanish, room will be vanished but sofa,table
        this.room = new Room(); // Composition

        this.sofa = sofa;       // aggregation
        this.table = table;     // aggregation
    }
}

public class AggregationAndComposition {
    Sofa sofa = new Sofa();
    Table table = new Table();

    Building building = new Building(sofa, table);

}

