import java.util.List;
import java.util.ArrayList;

public class quickSortString {

  static int partition(List<String> arr, int low, int high) {
    String pivot = arr.get(low);
    int i = low;
    int j = high;

    while (i < j) {
      while (arr.get(i).compareTo(pivot) <= 0 && i <= high - 1) {
        i++;
      }
      while (arr.get(j).compareTo(pivot) > 0 && j >= low + 1) {
        j--;
      }

      if (i < j) {
        String temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
      }
    }
    String temp = arr.get(low);
    arr.set(low, arr.get(j));
    arr.set(j, temp);
    return j;
  }

  static void qs(List<String> arr, int low, int high) {
    if (low < high) {
      int pIndex = partition(arr, low, high);
      qs(arr, low, pIndex - 1);
      qs(arr, pIndex + 1, high);
    }
  }

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Charlie");
    names.add("David");
    names.add("Eve");
    names.add("Alice");
    names.add("Bob");
 
    System.out.println("Unsorted names: " + names);

    qs(names, 0, names.size() - 1);

    System.out.println("Sorted names: " + names);
  }
}