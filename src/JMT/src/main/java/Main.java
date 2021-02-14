import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Room room = new Room(10, 7, 260, true, false, 1);

        room.furnitureSet.add(new Furniture(
                "Sofa",
                0.8,
                2,
                3.2,
                "leather",
                "Black",
                true));

        room.furnitureSet.add(new Furniture(
                "Table",
                1.3,
                2,
                3.2,
                "wood",
                "grey",
                false));
        room.furnitureSet.add((new Furniture(
                "Armchair",
                3.2,
                1.5,
                2.4,
                "leather",
                "Yellow",
                true)));


        room.appliancesSet.add(new Appliances("TV", 0.4, 0.3, 1, "Black", 220));
        room.appliancesSet.add(new Appliances("Microwave", 0.5, 0.7, 1.5, "Brown", 220));
        room.appliancesSet.add(new Appliances("Washer", 0.2, 1.3, 2.3, "Red", 220));
        room.appliancesSet.add(new Appliances("Dishwasher", 0.3, 0.2, 5, "Blue", 220));

        System.out.println(AddClassToJson.putOnJson(room));
        //По сути, теперь я могу каким - то образом передать этот объект пользователю
        //другого языка? Какой именно для это есть способ?
        //Я решил создать отдельный метод для помещения объекта в формат JSON, подумал что так будет лучше. Правильно?
    }
}
