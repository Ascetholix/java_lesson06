import java.util.HashMap;
import java.util.Iterator;

/**
 * Разработать программу, имитирующую поведение коллекции HashSet.
 * В программе содать метод add добавляющий элемент,
 * метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
 * Формат данных Integer.
 */
public class homeTask06 {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(2);
        myHashSet.add(7);
        myHashSet.add(89);
        myHashSet.add(743);
        myHashSet.add(74);
        myHashSet.add(7);
        System.out.println(myHashSet);
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.get(2));

        Iterator<Integer> iterator = myHashSet.iterator();
        while (iterator.hasNext()){
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }

    }
}
class MyHashSet{   // Свой класс
    private HashMap<Integer, Object> map = new HashMap<>();
    private final Object OBJ = new Object(); // Объект

    public boolean add(Integer a){  // Метода добавления
        return map.put(a, OBJ)!= null? true:false ;
    }

    @Override          //
    public String toString(){    // преобразованиея из типа объект в стринг
        return map.keySet().toString();
    }

    public Integer get(Integer a){      // метод прочтения по индексу
        return (Integer) map.keySet().toArray()[a];
    }
    public Integer size(){     //  размер
        return map.keySet().size();
    }
    public Iterator<Integer> iterator(){ // итератор
        return map.keySet().iterator();
    }
}
