public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public int whatindex(T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    if (element.compareTo(super.get(super.size() - 1)) == 1){
      return super.size();//last element
    }
    for (int x = 0;x < super.size() - 1; x++){
      if (element.compareTo(super.get(x)) >= 1 && element.compareTo(super.get(x + 1)) == -1){
        return x + 1;
      }
    }
    return 0;
  }
  public boolean add(T element){
    if (whatindex(element) == super.size()){
      super.add(element);
      return true;
    }
    super.add(whatindex(element), element);
    return true;
  }

  public void add(int index, T element){
    if (whatindex(element) == super.size()){
      super.add(element);
    }
    super.add(whatindex(element), element);
  }

  public void sorted(int index, T element){
    super.remove(index);
    if (!(element.compareTo(super.get(0)) == -1)){
      if (super.size() != 0){
        super.add(0, element);
      }else{super.add(element);}
    }else if(element.compareTo(super.get(super.size() - 1)) == 1){
      super.add(element);

    }
    for (int x = 0; x < super.size() - 1; x++){
      if (element.compareTo(super.get(x)) >= 0 && element.compareTo(super.get(x + 1)) <= 0){
        super.add(x + 1, element);
        break;
      }
    }

  }
  public T set(int index, T element){
    if (index >= super.size()){
      throw new IndexOutOfBoundsException();
    }
    T var = super.set(index, element);
    sorted(index, element);
    return var;
  }
}
