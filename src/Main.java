import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato
public class Main {
    public static void main(String[] args) {
        Number num = new Number(4);

        Set<Integer> numbers = makeHashSet(num);

        System.out.println("The set with the object created is: \n" + numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            Integer number = iterator.next();
            if(number == 4){
                iterator.remove();
                System.out.println("The number equal to the object created is:\n" + number);
            }

        }
        System.out.println("The set without the objected created is: \n" + numbers);

        numbers.clear();

        System.out.println("The set cleared: \n" + numbers);
    }
    public static Set<Integer> makeHashSet(Number num){
        Set<Integer> hashSetNumbers = new HashSet<Integer>(Arrays.asList(1,2,3));

        hashSetNumbers.add(num.number);

        return hashSetNumbers;
    }
}
