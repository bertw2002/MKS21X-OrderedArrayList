import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NullArrayList(){
    super();
  }
  public NullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public void set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException();
    }else{
    super.set(index, element);
    }
  }
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException();
    }else{
      super.add(element);
    }
  }
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException();
    }else{
      super.add(index, element);
    }
  }

}
