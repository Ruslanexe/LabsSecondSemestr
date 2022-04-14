package ua.lviv.iot.lab2.manager;
import java.util.ArrayList;
import java.util.List;
import ua.lviv.iot.lab2.model.AbstractHockeyEquipment;

public class hockeyClubManager{
    private List<AbstractHockeyEquipment> list;

    public hockeyClubManager(List<AbstractHockeyEquipment> list) {
        this.list = list;
    }
    public List<AbstractHockeyEquipment>SortedByGrowth(){
        List<AbstractHockeyEquipment> sortedList = this.list;
        sortedList.sort((o1,o2) -> Double.compare(o1.getPrice(),o2.getPrice()));
        return sortedList;
    }
    public List<AbstractHockeyEquipment>getSortedByDescending(){
        List<AbstractHockeyEquipment> sortedList = this.list;
        sortedList.sort((o1,o2) -> -Double.compare(o1.getPrice(),o2.getPrice()));
        return sortedList;
}
    public List<AbstractHockeyEquipment> sortByGrowthAlphabet(){
        List<AbstractHockeyEquipment> sortedList = this.list;
        sortedList.sort((o1,o2) -> (o1.getName().compareTo(o2.getName())));
        return sortedList;
    }
    public List<AbstractHockeyEquipment> sortByDescendingAlphabet(){
        List<AbstractHockeyEquipment> sortedList = this.list;
        sortedList.sort(((o2, o1) -> -(o2.getName().compareTo(o1.getName()))));
        return sortedList;
    }
    public List<AbstractHockeyEquipment>findByPrice(int price){
        List<AbstractHockeyEquipment> foundedList = new ArrayList<>();
        for(AbstractHockeyEquipment equipment: this.list ){
            if (equipment.getPrice()==price){
                foundedList.add(equipment);
            }
        }
        return foundedList;
    }
}
